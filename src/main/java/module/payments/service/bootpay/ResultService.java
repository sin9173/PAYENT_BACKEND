package module.payments.service.bootpay;

import lombok.RequiredArgsConstructor;
import module.payments.api.model.bootpay.WebhookDto;
import module.payments.api.model.response.bootpay.WebhookResDto;
import module.payments.utils.SlackUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class ResultService {

    private final SlackUtils slackUtils;

    public WebhookResDto webhook(WebhookDto dto) {
        HashMap<String, String> map = new HashMap<>();
        map.put("test01", "01");
        map.put("test02", "02");
        map.put("test03", "03");
//        slackUtils.slackSend(dto.toString(), map);


        System.out.println("dto : " + dto);
        return new WebhookResDto(true);
    }
}
