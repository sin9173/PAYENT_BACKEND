package module.payments.controller;

import lombok.RequiredArgsConstructor;
import module.payments.utils.SlackUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final SlackUtils slackUtils;

    @GetMapping("/slack-test")
    public String slack_test(@RequestParam("message") String message) {
        Map<String, String> map = new HashMap<>();
        map.put("안녕메세지", "01");
        map.put("안녕텍스트", "02");
        map.put("안녕테스트", "03");

        slackUtils.slackSend(message, map);
        return "S";
    }
}
