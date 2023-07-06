package module.payments.api.model.response.tos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import module.payments.api.model.response.Response;

import java.util.List;

@Getter
@Setter
@ToString
public class Payment implements Response {

    private String mId; //상점아이디(MID)입니다. 토스페이먼츠에서 발급합니다. 최대 길이는 14자입니다.

    private String version; //응답 버전

    private String paymentKey; //결제의 키 값, 최대 길이는 200

    private String lastTransactionKey; //마지막 거래의 키 값입니다. 한 결제 건의 승인 거래와 취소 거래를 구분하는데 사용됩니다.

    private String orderId; //주문 ID입니다. 최소 길이는 6자, 최대 길이는 64자입니다.

    private String orderName; //주문명입니다. 예를 들면 생수 외 1건 같은 형식입니다. 최대 길이는 100자입니다.

    private String currency; //결제할 때 사용한 통화 단위입니다. 원화인 KRW만 사용합니다.

    private String method; //결제할 때 사용한 결제수단입니다. 카드, 가상계좌, 간편결제, 휴대폰, 계좌이체, 문화상품권, 도서문화상품권, 게임문화상품권 중 하나입니다.

    private String status; //결제 처리 상태입니다.

    /**
     * - READY: 결제를 생성하면 가지게 되는 초기 상태 입니다. 인증 전까지는 READY 상태를 유지합니다.
     *
     * - IN_PROGRESS: 결제수단 정보와 해당 결제수단의 소유자가 맞는지 인증을 마친 상태입니다. 결제 승인 API를 호출하면 결제가 완료됩니다.
     *
     * - WAITING_FOR_DEPOSIT: 가상계좌 결제 흐름에만 있는 상태로, 결제 고객이 발급된 가상계좌에 입금하는 것을 기다리고 있는 상태입니다.
     *
     * - DONE: 인증된 결제수단 정보, 고객 정보로 요청한 결제가 승인된 상태입니다.
     *
     * - CANCELED: 승인된 결제가 취소된 상태입니다.
     *
     * - PARTIAL_CANCELED: 승인된 결제가 부분 취소된 상태입니다.
     *
     * - ABORTED: 결제 승인이 실패한 상태입니다.
     *
     * - EXPIRED: 결제 유효 시간 30분이 지나 거래가 취소된 상태입니다. IN_PROGRESS 상태에서 결제 승인 API를 호출하지 않으면 EXPIRED가 됩니다.
     */

    private String requestedAt; //결제가 일어난 날짜와 시간 정보입니다. ISO 8601 형식인 yyyy-MM-dd'T'HH:mm:ss±hh:mm으로 돌아옵니다.

    private String approvedAt; // 결제 승인이 일어난 날짜와 시간 정보입니다. ISO 8601 형식인 yyyy-MM-dd'T'HH:mm:ss±hh:mm으로 돌아옵니다.

    private boolean useEscrow; // 에스크로 사용 여부입니다.

    private boolean cultureExpense; // 문화비(도서, 공연 티켓, 박물관·미술관 입장권 등) 지출 여부입니다. 계좌이체, 가상계좌를 사용할 때만 설정하세요.

    private Object card; // 카드로 결제하면 제공되는 카드 관련 정보입니다.

    private VirtualAccount virtualAccount; //가상계좌 관련 정보

    private Object transfer; //계좌이체로 결제했을 때 이체 정보가 담기는 객체입니다.

    private MobilePhone mobilePhone; // 휴대폰으로 결제하면 제공되는 휴대폰 결제 관련 정보입니다.

    private GiftCertificate giftCertificate; //상품권으로 결제하면 제공되는 상품권 결제 관련 정보입니다.

    private Object foreignEasyPay;

    private CashReceipt cashReceipt; // 현금영수증 정보입니다.

    private List<CashReceipts> cashReceipts; // 현금영수증 발행 및 취소 이력이 담기는 배열입니다

    private Url receipt; //발행된 영수증 정보입니다.

    private Url checkout; //결제창 정보입니다.

    private Object discount; //

    private List<Cancel> cancels; //결제 취소 이력이 담기는 배열입니다.

    private String secret; //가상계좌 웹훅이 정상적인 요청인지 검증하는 값입니다. 이 값이 가상계좌 웹훅 이벤트 본문으로 돌아온 secret과 같으면 정상적인 요청입니다. 최대 길이는 50자입니다.

    private String type; // 결제 타입 정보입니다. NORMAL(일반 결제), BILLING(자동 결제), BRANDPAY(브랜드페이) 중 하나입니다.

    private Object easyPay; //간편결제 정보입니다.

    private String country; // 결제한 국가 정보입니다. ISO-3166의 두 자리 국가 코드 형식입니다.

    private Failure failure; // 결제 실패 정보입니다.

    private String totalAmount; // 총 결제 금액입니다.

    private String balanceAmount; // 취소할 수 있는 금액(잔고)입니다.

    private Long suppliedAmount; //공급가액입니다.

    private Long vat; //부가세입니다. (결제 금액 amount - 면세 금액 taxFreeAmount) / 11 후 소수점 첫째 자리에서 반올림해서 계산합니다.

    private String taxFreeAmount;
    /**
     * 결제 금액 중 면세 금액입니다.
     *
     * *일반 상점일 때는 면세 금액으로 0이 돌아옵니다. 면세 상점, 복합 과세 상점일 때만 면세 금액이 돌아옵니다. 더 자세한 내용은 세금 처리하기에서 살펴보세요.
     */

    private String taxExemptionAmount;
    /**
     * 결제 금액 중 과세 제외 금액(컵 보증금 등)입니다.
     *
     * *과세 제외 금액이 있는 카드 결제는 부분 취소가 안 됩니다.
     */


}
