package module.payments.api.model.response.bootpay;

import lombok.Getter;
import lombok.ToString;
import module.payments.api.model.response.Response;

@Getter
@ToString
public class WebhookResDto implements Response {

    private Boolean success;

    public WebhookResDto(Boolean success) {
        this.success = success;
    }
}
