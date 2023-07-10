package module.payments.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SlackUtilsTest {

    @Autowired
    private SlackUtils slackUtils;

    @Test
    public void slackSendTest() {
        slackUtils.slackSend("안녕텍스트!!");
    }

}