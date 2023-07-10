package module.payments.api.model.bootpay.webhook;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NaverPointDataDto { //네이버포인트로 결제한 경우 리턴되는 데이터

    /** 네이버페이에서 카드로 결제한 경우엔 card_data로, 간편계좌이체로 결제한 경우 bank_data로 리턴됩니다 */
    @Schema(description = "PG 에서 발급한 결제 고유 식별 ID")
    private String tid;
}
