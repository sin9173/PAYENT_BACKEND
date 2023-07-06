package module.payments.api.util;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import module.payments.api.model.request.HeaderDto;
import module.payments.api.model.response.Response;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class WebClientService {

    public Response connectJson(String url, HttpMethod method, Object body, Class successClassType, Class failClassType, List<HeaderDto> headerList) {
        return connect(url, method, body, successClassType, failClassType, headerList, MediaType.APPLICATION_JSON);
    }

    public Response connectForm(String url, HttpMethod method, Object body, Class successClassType, Class failClassType, List<HeaderDto> headerList) {
        return connect(url, method, body, successClassType, failClassType, headerList, MediaType.APPLICATION_FORM_URLENCODED);
    }

    public Response connect(String url, HttpMethod method, Object body, Class successClassType, Class failClassType, List<HeaderDto> headerList, MediaType mediaType) {
        log.info("호출 시작");

        long time = System.currentTimeMillis();
        Response block = (Response) WebClient.builder().baseUrl(url)
                .filter(logRequest())
                .clientConnector(new ReactorClientHttpConnector(
                        HttpClient.create().wiretap(true)
                ))
                .build()
                .method(method)
                /** 헤더 추가 */
                .headers(headers -> {
                    headerList.forEach(h -> headers.add(h.getKey(), h.getValue()));
                })
                .accept(mediaType)
                .contentType(mediaType)
                .bodyValue(body)
                //retrieve : ResponseBody 값을 받아와서 bodyToMono 로 빠르게 처리가 가능 (권장)
                //exchange : 상태값, 헤더정보를 포함해 결과를 받아와 세밀한 처리가 가능
                .exchangeToMono(response -> {
                    if(response.statusCode().equals(HttpStatus.OK)) {
                        return response.bodyToMono(successClassType);
                    }
                    else if(response.statusCode().is4xxClientError()) {
                        return response.bodyToMono(failClassType);
                    } else {
                        return response.bodyToMono(failClassType);
                    }
                }).block();

        log.info("time = " + (System.currentTimeMillis() - time));
        log.info("response = " + block);

        return block;
    }

    private ExchangeFilterFunction logRequest() {
        return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
            log.info("Request : [{} {}] {}", clientRequest.method(), clientRequest.url(), clientRequest.body());
            return Mono.just(clientRequest);
        });
    }
}
