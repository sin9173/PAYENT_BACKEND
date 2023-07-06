package module.payments.api.util;

import module.payments.api.model.request.tos.virtualaccount.EscrowProduct;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebClientServiceImplTosTest {

    @Autowired
    private WebClientServiceTos webClientService;


    @Test
    public void webclientTest() { //WebClient 호출 테스트

    }

    @Test
    public void getParamConvertTest() throws Exception { // GET 메소드 통신 파라미터 변환 테스트
//        EscrowProduct escrowProduct = new EscrowProduct("11", "테스트", "30", "100", 10L);
//        String paramConvert = webClientService.getParamConvert(escrowProduct);
//        Assertions.assertThat(paramConvert).isEqualTo("?id=11&name=테스트&code=30&unitPrice=100&quantity=10&");
    }

}