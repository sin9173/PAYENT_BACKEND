package module.payments.api.model.bootpay.webhook;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import module.payments.api.model.enums.EscrowStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class EscrowDataDto { //에스크로 정보

    @Schema(description = "에스크로 상태")
    private EscrowStatus escrow_status;

    @Schema(description = "에스크로 현재 상태에 대한 언어별 응답")
    private String escrow_status_local;

    @Schema(description = "배송시작일자")
    private LocalDateTime shipping_started_at;

    @Schema(description = "구매자가 배송을 받고 구매 승인을 한 시각")
    private LocalDateTime receipt_confirmed_at;
}
