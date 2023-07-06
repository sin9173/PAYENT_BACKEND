package module.payments.api.model.request.tos.virtualaccount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class EscrowProduct { //

    /**
     * 각 상품의 상세 정보를 담는 배열입니다.
     * 예를 들어 사용자가 세 가지 종류의 상품을 구매했다면 길이가 3인 배열이어야 합니다.
     * 에스크로 결제를 사용할 때만 필요한 파라미터입니다.
     */

    private String id; //상품의 ID입니다. 이 값은 유니크해야 합니다.

    private String name; // 상품 이름입니다.

    private String code; // 상점에서 사용하는 상품 관리 코드입니다.

    private String unitPrice; // 상품의 가격입니다. 전체를 합한 가격이 아닌 상품의 개당 가격입니다.

    private Long quantity; // 상품 구매 수량입니다.


}
