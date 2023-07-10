package module.payments.api.model.bootpay.webhook;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CardDataDto { //카드 결제 정보

    @Schema(description = "PG 에서 발급한 결제 고유 식별 ID")
    private String tid;

    @Schema(description = "카드 승인 번호")
    private String card_approve_no;

    @Schema(description = "가운데 자리가 마스킹된 카드번호")
    private String card_no;

    @Schema(description = "할부 개월수")
    private String card_quota;

    @Schema(description = "PG 사에서 정의한 카드사 코드")
    private String card_company_code;

    @Schema(description = "카드사명")
    private String card_company;

    @Schema(description = "카드 무이자 할부 개월수")
    private String card_interest;

    @Schema(description = "카드 종류 0 - 신용카드, 1 - 체크카드")
    private String card_type;

    @Schema(description = "PG 에서 제공하는 영수증 URL * 현재 다날, 나이스페이만 제공")
    private String receipt_url;

    @Schema(description = "카드 소유 종류 1 - 개인카드, 2 - 법인카드, 3 - 해외카드")
    private String card_owner_type;

    @Schema(description = "결제시 사용한 카드사 포인트 금액")
    private Long point;

    @Schema(description = "취소된 포인트 금액")
    private Long cancelled_point;

    @Schema(description = "결제시 카드사에서 발급된 쿠폰금액")
    private Long coupon;

    @Schema(description = "취소된 쿠폰 금액")
    private Long cancelled_coupon;

    @Schema(description = "취소시 PG 에서 리턴하는 취소 고유 TID 값")
    private String cancel_tid;

}
