package module.payments.api.model.response.tos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cancel { // 결제 취소 이력이 담기는 배열입니다.

    private Long cancelAmount; // 결제를 취소한 금액입니다.

    private String cancelReason; // 결제를 취소한 이유입니다. 최대 길이는 200자입니다.

    private Long taxFreeAmount; // 취소된 금액 중 면세 금액입니다.

    private String taxExemptionAmount; // 취소된 금액 중 과세 제외 금액(컵 보증금 등)입니다.

    private String refundableAmount; // 결제 취소 후 환불 가능한 잔액입니다.

    private String easyPayDiscountAmount; // 간편결제 서비스의 포인트, 쿠폰, 즉시할인과 같은 적립식 결제수단에서 취소된 금액입니다.

    private String canceledAt; // 결제 취소가 일어난 날짜와 시간 정보입니다. ISO 8601 형식인 yyyy-MM-dd'T'HH:mm:ss±hh:mm입니다.

    private String transactionKey; // 취소 건의 키 값입니다. 여러 건의 취소 거래를 구분하는데 사용됩니다. 최대 길이는 64자입니다.

    private String receiptKey; // 취소 건의 현금영수증 키 값입니다. 최대 길이는 200자입니다.
}
