package module.payments.controller.innopay;

import module.payments.api.model.request.innopay.result.PaymentWebResultDto;
import module.payments.api.model.request.innopay.result.VbankDepositResultDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequestMapping("/innopay")
@RestController
public class PaymentController {

    @GetMapping("/payment-result")
    public String payment_result(@ModelAttribute PaymentWebResultDto data) {
        System.out.println("data = " + data);
        return "S";
    }

    @PostMapping(value = "/vbank/deposit-result",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String vbank_deposit_result(@ModelAttribute VbankDepositResultDto data) {
        System.out.println("data = " + data);
        return "0000";
    }
}
