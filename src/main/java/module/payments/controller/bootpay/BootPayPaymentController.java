package module.payments.controller.bootpay;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RequestMapping("/bootpay")
@RestController
public class BootPayPaymentController {


    @PostMapping("/payment-test")
    public String payment_test(HashMap<String, Object> params) {
        System.out.println("params = " + params);

        return "S";
    }
}
