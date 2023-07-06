package module.payments.api.model.request.tos.virtualaccount;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VirtualAccountRequest { //가상계좌 발급 요청 데이터

    /**필수 **/
    private Integer amount; //결제할 금액입니다.

    /**필수 **/
    private String orderId; // 주문 ID입니다. 충분히 무작위한 값을 직접 생성해서 사용하세요. 영문 대소문자, 숫자, 특수문자 -, _로 이루어진 6자 이상 64자 이하의 문자열이어야 합니다.

    /** 필수 **/
    private String orderName; // 주문명입니다. 예를 들면 생수 외 1건 같은 형식입니다. 최대 길이는 100자입니다. 최소 1글자 이상 100글자 이하여야 합니다.

    /** 필수 **/
    private String customerName; // 입금할 고객 이름입니다. 최대 길이는 100자입니다.

    /** 필수 **/
    private String bank; //가상계좌를 발급할 은행입니다. 가상계좌 발급이 가능한 은행을 참고하세요.

//    private String accountType;
//    /**
//     * 가상계좌 타입을 나타냅니다. 일반, 고정 중 하나입니다. 값이 없으면 일반 가상계좌로 발급됩니다.
//     *
//     * - 일반: 임시적으로 발급되어 고객이 입금한 뒤에는 더 이상 사용할 수 없는 일반적인 가상계좌 타입입니다.
//     *
//     * - 고정: 고객이 같은 계좌로 여러 번 입금할 수 있는 특수 가상계좌 타입입니다. 고정 가상계좌를 사용하는 상점으로 계약되어 있어야 사용할 수 있습니다. accountKey 파라미터와 함께 요청을 보내면 같은 계좌를 다시 발급할 수 있습니다.
//     */
//
//    private String accountKey;
//    /**
//     * 고정 가상계좌를 사용하는 고객과 매칭시킨 계좌의 고유한 키 값으로, 특정 고객에게 같은 가상계좌를 발급할 때 사용됩니다. 최대 길이는 13자입니다.
//     *
//     * 같은 가상계좌를 다시 발급하려면 accountType을 고정으로 설정한 뒤 처음 고정 가상계좌를 발급할 때 사용했던 accountKey를 함께 넘겨주어야 합니다.
//     */
//
//    private Integer validHours; //가상계좌가 유효한 시간을 의미합니다. 값을 넣지 않으면 기본값 168시간(7일)으로 설정됩니다. 설정할 수 있는 최대값은 720시간(30일)입니다.
//
//    private String dueDate; //
//    /**
//     * 입금 기한입니다. 현재 시간을 기준으로 720시간(30일) 이내의 특정 시점으로 입금 기한을 직접 설정하고 싶을 때 사용합니다. 720시간 이후로 기한을 설정하면 에러가 발생합니다.
//     *
//     * ISO 8601 형식인 yyyy-MM-dd'T'HH:mm:ss를 사용합니다.
//     *
//     * validHours와 dueDate 중 하나만 사용할 수 있습니다.
//     */
//
//    private String customerEmail; //고객의 이메일 주소입니다. 결제 결과를 알려줄 때 사용합니다. 최대 길이는 100자입니다.
//
//    private String customerMobilePhone; //고객의 휴대폰 번호입니다. 가상계좌 입금 안내가 전송되는 번호입니다.
//
//    private String taxFreeAmount; //면세 금액입니다. 값을 넣지 않으면 기본값인 0으로 설정됩니다.
//    //면세 상점 혹은 복합 과세 상점일 때만 설정한 금액이 적용되고, 일반 과세 상점에는 적용되지 않습니다. 더 자세한 내용은 세금 처리하기에서 살펴보세요.
//
//    private boolean useEscrow; // 에스크로 사용 여부입니다. 값을 넣지 않으면 기본값인 false로 설정되고 사용자가 에스크로 결제 여부를 선택합니다.
//
//    private CashReceipt cashReceipt; //현금영수증 발급 정보를 담는 객체입니다.
//
//    private List<EscrowProduct> escrowProducts; // 각 상품의 상세 정보를 담는 배열입니다.


    public VirtualAccountRequest(Integer amount, String orderId, String orderName, String customerName, String bank) {
        this.amount = amount;
        this.orderId = orderId;
        this.orderName = orderName;
        this.customerName = customerName;
        this.bank = bank;
    }

}
