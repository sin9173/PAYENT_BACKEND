package module.payments.controller.bootpay;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import module.payments.api.model.bootpay.WebhookDto;
import module.payments.api.model.response.Response;
import module.payments.service.bootpay.ResultService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/bootpay")
@RestController
@RequiredArgsConstructor
public class ResultController {

    private final ResultService resultService;

    @PostMapping("/webhook")
    public Response webhook(@RequestBody WebhookDto dto) {
//        log.info("webhook Data = " + dto);
        return resultService.webhook(dto);
    }

    @PostMapping("/status-test")
    public String webhook_status_test(@RequestBody WebhookDto dto) {
        System.out.println("dto = " + dto);
        return "S";
    }
}
