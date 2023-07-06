package module.payments.virtualaccount;

import module.payments.api.TosUrl;
import module.payments.api.model.request.tos.virtualaccount.VirtualAccountRequest;
import module.payments.api.model.response.tos.Payment;
import module.payments.api.model.response.Response;
import module.payments.api.util.WebClientServiceTos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;

@SpringBootTest
public class VirtualAccountTest {

    @Autowired
    private WebClientServiceTos webClientService;

    @Test
    public void virtualAccount() { //가상계좌 발급 테스트

//        VirtualAccountRequest request = new VirtualAccountRequest(100, "AOfmfomOemFoAadas", "테스트", "테스트", "20");
//
//        Response result = webClientService.connect(TosUrl.VIRTUAL_ACCOUNT.getUrl(), HttpMethod.POST, request, Payment.class);
//
//        System.out.println("result = " + result);
//
//        Payment payment = (Payment) result;
    }
}
