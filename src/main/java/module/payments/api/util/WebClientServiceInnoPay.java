package module.payments.api.util;

import lombok.RequiredArgsConstructor;
import module.payments.api.model.response.Response;
import module.payments.api.model.response.tos.Failure;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class WebClientServiceInnoPay {

    @Value("${webclient.innopay.base-url}")
    private String base_url;

    private final WebClientService webClientService;


    public Response connect(String uri, Object body, Class classT) {
        return webClientService.connectJson(base_url + uri, HttpMethod.POST, body,
                classT, classT, new ArrayList<>());
    }

    public Response connectForm(String uri, Object body, Class classT) {
        return null;
    }

}
