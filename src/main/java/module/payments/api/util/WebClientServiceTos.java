package module.payments.api.util;

import lombok.RequiredArgsConstructor;
import module.payments.api.model.request.HeaderDto;
import module.payments.api.model.response.tos.Failure;
import module.payments.api.model.response.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WebClientServiceTos {

    @Value("${webclient.tos.base-url}")
    private String base_url;

    @Value("${webclient.tos.secret-key}")
    private String secret_key;

    private final WebClientService webClientService;

    public Response connect(String uri, HttpMethod method, Object body, Class classT) {
        List<HeaderDto> headerList = new ArrayList<>();
        headerList.add(new HeaderDto("Authorization", "Basic " + secret_key));
        return webClientService.connectJson(base_url + uri, method, body,
                classT, Failure.class, headerList);
    }

//    public Response connect(String uri, HttpMethod method, Object body, Class classT) {
//        System.out.println("호출 시작");
//        long time = System.currentTimeMillis();
//        Response block = (Response) WebClient.create(base_url)
//                .method(method)
//                .uri(uri)
//                .header("Authorization", "Basic " + secret_key)
//                .accept(MediaType.APPLICATION_JSON)
//                .contentType(MediaType.APPLICATION_JSON)
////                .body(null)
//                .bodyValue(body)
//                //retrieve : ResponseBody 값을 받아와서 bodyToMono 로 빠르게 처리가 가능 (권장)
//                //exchange : 상태값, 헤더정보를 포함해 결과를 받아와 세밀한 처리가 가능
//        .exchangeToMono(response -> {
//            if(response.statusCode().equals(HttpStatus.OK)) {
//                return response.bodyToMono(classT);
//            }
//            else if(response.statusCode().is4xxClientError()) {
//                return response.bodyToMono(Failure.class);
//            } else {
//                return response.bodyToMono(Failure.class);
//            }
//        }).block();
//
//        System.out.println("time = " + (System.currentTimeMillis() - time));
//
//        return block;
//    }


    public boolean isFailure(Object obj) {
        return obj.getClass().getName().equals(Failure.class.getName());
    }

    //GET URL 파라미터 변환
    public String getParamConvert(Object obj) throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        Class cl = obj.getClass();
        Field[] fields = cl.getDeclaredFields();

        StringBuilder result = new StringBuilder("?");

        for (Field field : fields) {
            System.out.println("field = " + field.getName());
            Method getterMethod = cl.getMethod(getterMethodName(field.getName()));
            String value = String.valueOf(getterMethod.invoke(obj));
            System.out.println("value = " + value);
            result.append(field.getName() + "=" + value + "&");
        }
        System.out.println("result = " + result);
        return result.toString();
    }

    private String getterMethodName(String name) { //getter 메소드 이름 가져오기
        return "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
