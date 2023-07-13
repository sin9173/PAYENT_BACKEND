package module.payments.api.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum WebHookStatus implements EnumMapperType { //부트페이 Webhook 통지 상태값

    CASH_RECEIPT_CANCEL_FAIL(-61, "현금영수증 발행취소 실패"),

    CASH_RECEIPT_FAIL(-60, "현금영수증 발행 실패"),

    AUTO_PAYMENT_BILLING_KEY_FAIL(-40, "자동결제 빌링키 발급 실패"),

    AUTO_PAYMENT_BILLING_KEY_CANCEL(-11, "자동결제 빌링키 발급 취소"),

    PAYMENT_APPROVE_FAIL(-2, "결제 승인실패 오류"),

    PAYMENT_REQUEST_FAIL(-4, "결제 요청 실패"),

    PAYMENT_STANDBY(0, "결제 대기중"),

    PAYMENT_COMPLETE(1, "결제 완료"),

    PAYMENT_APPROVE_PROCESS(2, "결제승인중"),

    PAYMENT_APPROVE_REQUEST(4, "결제 승인 요청"),

    VACCOUNT_ISSUE_COMPLETE(5, "가상계좌 발급 완료(입금 대기중)"),

    AUTO_PAYMENT_BILLING_KEY_ISSUE(11, "자동결제 빌링키 발급 완료"),

    AUTHENTICATION_COMPLETE(12, "본인인증 완료"),

    PAYMENT_CANCEL(20, "결제 취소"),

    AUTO_PAYMENT_BILLING_KEY_ISSUE_STANDBY(40, "자동결제 빌링키 발급 준비중"),

    AUTO_PAYMENT_BILLING_KEY_ISSUE_BEFORE(41, "자동결제 빌링키 발급 승인중"),

    AUTO_PAYMENT_BILLING_KEY_ISSUE_COMPLETE(42, "자동결제 빌링키 발급 성공"),

    AUTHENTICATION_STANDBY(50, "본인인증 준비중"),

    CASH_RECEIPT_COMPLETE(60, "현금영수증 발행 완료"),

    CASH_RECEIPT_CANCEL_COMPLETE(61, "현금영수증 발행 취소 완료");

    private Integer code;

    private String desc;

    public String getName() {
        return name();
    }

    @JsonCreator
    public static WebHookStatus find(int code) {
        return Arrays.stream(values()).filter(enu -> enu.getCode().equals(code))
                .findAny().orElseThrow(() -> new IllegalArgumentException("잘못된 결제상태 입니다."));
    }


}
