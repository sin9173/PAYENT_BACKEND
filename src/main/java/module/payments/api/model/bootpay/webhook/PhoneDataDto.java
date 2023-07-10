package module.payments.api.model.bootpay.webhook;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PhoneDataDto { //휴대폰 결제 정보

    @Schema(description = "PG 에서 발급한 결제 고유 식별 ID")
    private String tid;

    @Schema(description = "휴대폰 소액결제 승인 번호")
    private String auth_no;

    @Schema(description = "소액결제한 휴대폰 번호")
    private String phone;

    @Schema(description = "PG 에서 제공하는 영수증 URL * 현재 나이스페이만 제공")
    private String receipt_url;
}
