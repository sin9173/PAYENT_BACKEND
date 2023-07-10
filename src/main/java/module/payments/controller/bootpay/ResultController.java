package module.payments.controller.bootpay;

import lombok.extern.slf4j.Slf4j;
import module.payments.api.model.bootpay.WebhookDto;
import module.payments.api.model.response.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/bootpay")
@RestController
public class ResultController {

    @PostMapping("/webhook")
    public Response webhook(@RequestBody WebhookDto dto) {
        log.info("webhook Data = " + dto);
        return null;
    }

    @PostMapping("/status-test")
    public String webhook_status_test(@RequestBody WebhookDto dto) {
        System.out.println("dto = " + dto);
        return "S";
    }
}
