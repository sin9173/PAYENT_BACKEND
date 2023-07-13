package module.payments.api.model.bootpay;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import module.payments.api.model.bootpay.webhook.*;
import module.payments.api.model.enums.EscrowStatus;
import module.payments.api.model.enums.WebHookStatus;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Getter
@Setter
@ToString
public class WebhookDto { //결제 결과 통지, 결제 조회 데이터

    @Schema(description = "결제 요청했던 application_id", example = "59a568d3e13f3336c21bf707", required = true)
    private String application_id; // 결제 요청했던 application_id (필수)

    @Schema(description = "부트페이가 부여하는 고유 영수증 ID, 이 값을 기반으로 REST API 로 결제조회, 결제취소가 가능", example = "624e725b1fc19202e4746fdf")
    private String receipt_id;

    @Schema(description = "가맹점에서 보낸 주문 ID입니다. 중복결제 방지 로직이 필요하신 경우, 이 값을 기반으로 중복결제 방지 로직을 만드시길 추천합니다.", example = "1649308254184")
    private String order_id;

    @Schema(description = "결제 요청/승인된 금액입니다.", example = "1000")
    private Long price;

    @Schema(description = "비과세 요청/승인된 금액입니다.", example = "0")
    private Long tax_free;

    @Schema(description = "결제 취소된 금액입니다. 결제 완료시에는 취소된 금액이 없으므로 0원으로 리턴됩니다.", example = "0")
    private Long cancelled_price;

    @Schema(description = "비과세 취소된 금액입니다. 결제 완료시에는 취소된 금액이 없으므로 0원으로 리턴됩니다.")
    private Long cancelled_tax_free;

    @Schema(description = "구매자에게 노출한 판매아이템 이름입니다.", example = "테스트상품")
    private String order_name;

    @Schema(description = "부트페이에 가입된 가맹점 이름입니다.", example = "가맹점")
    private String company_name;

    @Schema(description = "PG로 요청된 부트페이 URL입니다. 부트페이 내부적으로 사용되는 값이며, PG사에 referer로 전달되는 값입니다.", example = "https://gw.bootpay.co.kr")
    private String gateway_url;

    @Schema(description = "가맹점에서 보낸 초기 전달 데이터입니다. 보낸 데이터 그대로 metadata가 전달됩니다.", example = "{test : 1}")
    private Map<String, Object> metadata;

    @Schema(description = "true - 테스트결제 false - 실결제", example = "true")
    private Boolean sandbox;

    @Schema(description = "결제가 완료된 PG사 명입니다.", example = "이니시스")
    private String pg;

    @Schema(description = "결제가 완료된 결제수단명입니다.", example = "카드")
    private String method;

    @Schema(description = "결제수단의 영문 symbol 값입니다.", example = "card")
    private String method_symbol;

    @Schema(description = "결제가 완료된 원 결제수단명입니다. 카드자동결제의 경우 method_origin - 카드자동, method - 카드로 전달됩니다.", example = "네이버페이(결제형)")
    private String method_origin;

    @Schema(description = "원 결제수단의 영문 symbol 값입니다.", example = "naverpay")
    private String method_origin_symbol;

    @Schema(description = "결제가 진행된 통화 정보입니다. 원화 - KRW, 달러 - USD", example = "KRW")
    private String currency;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    @Schema(description = "결제 완료된 시간입니다. ( PG에서 주는 데이터 기반으로 저장 )", example = "2022-04-07T14:11:35+09:00")
    private LocalDateTime purchased_at;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    @Schema(description = "결제 취소된 시간입니다. ( PG에서 주는 데이터 기반으로 저장 )", example = "null")
    private LocalDateTime canceled_at;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    @Schema(description = "결제 요청된 시간입니다. ( 부트페이 서버 기준시간으로 저장 )", example = "2022-04-07T14:10:51+09:00")
    private LocalDateTime requested_at;

    @Schema(description = "PG사에서 제공하는 결제 영수증 혹은 부트페이에서 제공하는 영수증 URL 입니다.", example = "https://door.bootpay.co.kr/receipt/WWlMbmFWRmlxcGUwb3Y3T1Q5b0R5clBjc2ZyUVhHVGpwamZBNS9KYXNhbmdB%0AZz09LS1zM1ZueWpsY0hCT3VPSmxsLS1EcVVGcitsVFBoQ3hCR1UyNFNhK0tB%0APT0%3D%0A")
    private String receipt_url;

    @Schema(description = "현재 결제 건의 상태값입니다.")
    private WebHookStatus status;

    /** 에스크로 정보 */
    @Schema(description = "에스크로 상태")
    private EscrowStatus escrow_status;

    @Schema(description = "에스크로 현재 상태에 대한 언어별 응답")
    private String escrow_status_local;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    @Schema(description = "배송시작일자")
    private LocalDateTime shipping_started_at;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    @Schema(description = "구매자가 배송을 받고 구매 승인을 한 시각")
    private LocalDateTime receipt_confirmed_at;

    /** 에스크로 정보 END */

    /** 결제 정보 */
    private CardDataDto card_data;

    private PhoneDataDto phone_data;

    private BankDataDto bank_data;

    private VBankDataDto vbank_data;

    private NaverPointDataDto naver_point_data;

    private KakaoMoneyDataDto kakao_money_data;

    private PaycoPointDataDto payco_point_data;

    private TossPointDataDto toss_point_data;
    /** 결제정보 END */

    @Schema(description = "에스크로 상태 변경 웹훅* 구매확정, 구매거절인 경우에는 true 로 전달되고 에스크로 웹훅이 아니면 이 데이터가 전달되지 않습니다.")
    private Boolean escrow_webhook;



}
