package module.payments.api.model.bootpay.webhook;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class KakaoMoneyDataDto { //카카오머니로 결제되는 경우 리턴되는 데이터

    /** 카카오페이에서 카드로 결제한 경우엔 card_data로 리턴됩니다 */
    @Schema(description = "PG 에서 발급한 결제 고유 식별 ID")
    private String tid;
}
