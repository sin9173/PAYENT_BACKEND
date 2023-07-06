package module.payments.api.model.response.tos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CashReceipts { // 현금영수증 발행 및 취소 이력이 담기는 배열입니다. 계좌이체는 결제 즉시 현금영수증 정보를 확인할 수 있습니다. 가상계좌는 고객이 입금을 완료하면 현금영수증 정보를 확인할 수 있습니다.

    private String receiptKey; //현금영수증의 키 값입니다. 최대 길이는 200자입니다.

    private String orderId; //주문 ID입니다. 최소 길이는 6자, 최대 길이는 64자입니다.

    private String orderName; // 주문명입니다. 예를 들면 생수 외 1건 같은 형식입니다. 최대 길이는 100자입니다.

    private String type; // 현금영수증의 종류입니다. 소득공제, 지출증빙 중 하나입니다.

    private String issueNumber; // 현금영수증 발급 번호입니다. 최대 길이는 9자입니다.

    private String receiptUrl; // 발행된 현금영수증을 확인할 수 있는 주소입니다.

    private String businessNumber; // 현금영수증을 발급한 사업자등록번호입니다. 길이는 10자입니다.

    private String transactionType; // 현금영수증 발급 종류입니다. 현금영수증 발급(CONFIRM)·취소(CANCEL) 건을 구분합니다.

    private String amount; // 현금영수증 처리된 금액입니다.

    private String taxFreeAmount; // 면세 처리된 금액입니다.

    private String issueStatus; // 현금영수증 발급 상태입니다. 발급 승인 여부는 요청 후 1-2일 뒤 조회할 수 있습니다. IN_PROGRESS, SENT, COMPLETED, FAILED 중 하나입니다. 각 상태의 자세한 설명은 CashReceipt 객체에서 확인할 수 있습니다.

    private Object failure;

    private String customerIdentityNumber; // 현금영수증 발급에 필요한 소비자 인증수단입니다. 현금영수증을 발급한 주체를 식별합니다. 최대 길이는 30자입니다. 현금영수증 종류에 따라 휴대폰 번호, 주민등록번호, 사업자등록번호, 현금영수증 카드 번호 등을 입력할 수 있습니다.

    private String requestedAt; // 결제가 일어난 날짜와 시간 정보입니다. ISO 8601 형식인 yyyy-MM-dd'T'HH:mm:ss±hh:mm으로 돌아옵니다. (e.g. 2022-01-01T00:00:00+09:00)
}
