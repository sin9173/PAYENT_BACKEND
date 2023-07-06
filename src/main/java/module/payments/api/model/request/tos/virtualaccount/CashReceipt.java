package module.payments.api.model.request.tos.virtualaccount;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CashReceipt { //현금영수증 발급 정보를 담는 객체입니다.

    private String type; //현금영수증 발급 용도입니다. 소득공제, 지출증빙, 미발행 중 하나입니다.

    private String registrationNumber;
    /**
     * 현금영수증 발급에 필요한 개인 식별 번호입니다.
     * 최대 길이는 30자입니다.
     * 현금영수증 종류에 따라 휴대폰 번호, 주민등록번호, 사업자등록번호, 카드 번호 등을 입력할 수 있습니다.
     */
}
