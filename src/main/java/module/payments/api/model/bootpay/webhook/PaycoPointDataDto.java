package module.payments.api.model.bootpay.webhook;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaycoPointDataDto { //페이코 포인트로 결제되는 경우 리턴되는 데이터

    /** 페이코에서 카드로 결제한 경우엔 card_data로 리턴됩니다 */
    @Schema(description = "PG 에서 발급한 결제 고유 식별 ID")
    private String tid;
}
