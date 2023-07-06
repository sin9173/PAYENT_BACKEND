package module.payments.orders;

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
public class OrdersTest {

    @Autowired
    private WebClientServiceTos webClientService;

    @Test
    public void ordersTest() { //orderId 로 결제 조회 테스트
//        String orderId = "adfjojdsfjosdFSf";
//
//        Response result = webClientService.connect(TosUrl.PAYMENTS_ORDERS.getUrl(orderId), HttpMethod.GET, "", Payment.class);
//
//        System.out.println("result = " + result);
//
//        Payment payment = (Payment) result;
//
//        Assertions.assertThat(payment.getOrderId()).isEqualTo(orderId);
    }
}
