package module.payments.api.model.response.tos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CashReceipt { // 현금영수증 정보 입니다.

    private String type; //현금영수증의 종류입니다. 소득공제, 지출증빙 중 하나입니다.

    private String receiptKey; // 현금영수증의 키 값입니다. 최대 길이는 200자입니다.

    private String issueNumber; // 현금영수증 발급 번호입니다. 최대 길이는 9자입니다.

    private String receiptUrl; // 발행된 현금영수증을 확인할 수 있는 주소입니다.

    private String amount; // 현금영수증 처리된 금액입니다.

    private String taxFreeAmount; // 면세 처리된 금액입니다.

}
