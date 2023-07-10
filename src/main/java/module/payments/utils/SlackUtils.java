package module.payments.utils;

import lombok.RequiredArgsConstructor;
import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackAttachment;
import net.gpedro.integrations.slack.SlackField;
import net.gpedro.integrations.slack.SlackMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class SlackUtils {

    private final SlackApi slackApi;

    private final ThreadPoolTaskExecutor threadPoolTaskExecutor;

    public SlackUtils(@Value("${slack.webhook}") String webhook, ThreadPoolTaskExecutor threadPoolTaskExecutor) {
        this.slackApi = new SlackApi(webhook);
        this.threadPoolTaskExecutor = threadPoolTaskExecutor;
        System.out.println("webhook = " + webhook);
    }

    public void slackSend(String message) {
        threadPoolTaskExecutor.execute(() ->
                sendSlackMessage("Error", message,"#36a64f",
                        List.of(
                                createField("test01", "1"),
                                createField("test02", "2"),
                                createField("test03", "3")
                        )));

    }


    public void slackSend(String message, Map<String, String> feild_map) {
        List<SlackField> fieldList = feild_map.entrySet().stream()
                .collect(Collectors.toList())
                .stream().map(m -> createField(m.getKey(), m.getValue()))
                .collect(Collectors.toList());
        threadPoolTaskExecutor.execute(() ->
                sendSlackMessage("Error", message,"#36a64f", fieldList));

    }

    private void sendSlackMessage(String fallback, String message, String color, List<SlackField> feild_list) {
        SlackAttachment slackAttachment = new SlackAttachment();
        slackAttachment.setFallback(fallback);
        slackAttachment.setColor(color);

        slackAttachment.setFields(feild_list);

        SlackMessage slackMessage = new SlackMessage("sid9173", message)
                .setAttachments(Collections.singletonList(slackAttachment));

//        System.out.println("slackMessage = " + slackMessage);

        slackApi.call(slackMessage);
    }

    private SlackField createField(String title, String value) {
        return new SlackField().setTitle(title).setValue(value);
    }
}
