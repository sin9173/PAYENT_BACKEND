package module.payments.api.model.response.tos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MobilePhone { //휴대폰으로 결제하면 제공되는 휴대폰 결제 관련 정보입니다.

    private String customerMobilePhone; // 결제에 사용한 휴대폰 번호입니다.

    private String settlementStatus; // 정산 상태입니다. 정산이 아직 되지 않았다면 INCOMPLETED, 정산이 완료됐다면 COMPLETED 값이 들어옵니다.

    private String receiptUrl; // 휴대폰 결제 내역 영수증을 확인할 수 있는 주소입니다.
}
