package module.payments.api.model.bootpay.webhook;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BankDataDto { //계좌이체 정보

    @Schema(description = "PG 에서 발급한 결제 고유 식별 ID")
    private String tid;

    @Schema(description = "PG 사에서 정의한 은행 코드")
    private String bank_code;

    @Schema(description = "계좌이체 진행이 된 은행명")
    private String bank_name;

    @Schema(description = "입금 계좌번호")
    private String bank_account;

    @Schema(description = "입금자명")
    private String bank_username;

    @Schema(description = "현금영수증 발행시 PG 사 TID")
    private String cash_receipt_tid;

    @Schema(description = "현금영수증 종류 0 - 소득공제, 1 - 지출증빙")
    private Integer cash_receipt_type;

    @Schema(description = "현금영수증 발행번호")
    private String cash_receipt_no;

    @Schema(description = "PG 에서 제공하는 영수증 URL * 현재 나이스페이만 제공")
    private String receipt_url;

    @Schema(description = "PG 에서 제공하는 현금영수증 URL * 현재 나이스페이만 제공")
    private String cash_receipt_url;


}
