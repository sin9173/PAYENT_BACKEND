package module.payments.api.model.response.bootpay;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class WebhookResDto {

    private Boolean success;

    public WebhookResDto(Boolean success) {
        this.success = success;
    }
}
