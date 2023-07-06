package module.payments.api.util;

import module.payments.api.service.InnoPayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WebClientServiceInnoPayTest {

    @Autowired
    private InnoPayService innoPayService;


//    @Test
//    public void vbankTest() {
//        innoPayService.vbankAccount();
//    }
}