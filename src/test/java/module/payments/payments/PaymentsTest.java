package module.payments.payments;

import module.payments.api.TosUrl;
import module.payments.api.model.response.tos.Payment;
import module.payments.api.model.response.Response;
import module.payments.api.util.WebClientServiceTos;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;

@SpringBootTest
public class PaymentsTest {

    @Autowired
    private WebClientServiceTos webClientService;

    @Test
    public void paymentsTest() { //PaymentKey 로 결제 조회 테스트
//        String paymentKey = "9o5gEq4k6YZ1aOwX7K8mzx4E0R6NMQ3yQxzvNPGenpDAlBdb";
//        String paymentKey = "1";
//        Response payment = webClientService.connect(TosUrl.PAYMENTS.getUrl(paymentKey), HttpMethod.GET, "", Payment.class);
//
//        System.out.println("payment = " + payment);
//
//        if(webClientService.isFailure(payment)) {
//
//        } else {
//            Assertions.assertThat(((Payment)payment).getPaymentKey()).isEqualTo(paymentKey);
//        }

    }
}
