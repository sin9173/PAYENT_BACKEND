package module.payments.api.model.response.tos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VirtualAccount { // 가상계좌로 결제하면 제공되는 가상계좌 관련 정보입니다.

    private String accountNumber; //발급된 계좌 번호입니다. 최대 길이는 20자입니다.

    private String accountType; //가상계좌 타입을 나타냅니다. 일반, 고정 중 하나입니다.

    private String bankCode; //가상계좌 은행 숫자 코드입니다. 은행 코드를 참고하세요.

    private String customerName; //가상계좌를 발급한 고객 이름입니다. 최대 길이는 100자입니다.

    private String dueDate; //입금 기한입니다.

    private String expired;//가상계좌가 만료되었는지 여부입니다.

    private String settlementStatus; // 정산 상태입니다. 정산이 아직 되지 않았다면 INCOMPLETED, 정산이 완료됐다면 COMPLETED 값이 들어옵니다.

    private String refundStatus;//환불 처리 상태입니다. 아래와 같은 상태 값을 가질 수 있습니다.
    /**
     * - NONE: 환불 요청이 없는 상태입니다.
     *
     * - PENDING: 환불을 처리 중인 상태입니다.
     *
     * - FAILED: 환불에 실패한 상태입니다.
     *
     * - PARTIAL_FAILED: 부분 환불에 실패한 상태입니다.
     *
     * - COMPLETED: 환불이 완료된 상태입니다.
     */

    private String refundReceiveAccount; //

}
