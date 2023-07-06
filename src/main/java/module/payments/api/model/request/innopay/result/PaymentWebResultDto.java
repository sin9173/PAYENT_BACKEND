package module.payments.api.model.request.innopay.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentWebResultDto {

    private String PayMethod; //결제수단

    private String MID; //상점아이디

    private String TID; //거래번호

    private String mallUserID; //가맹점 고객 ID

    private String BuyerName; //고객명

    private String Amt; //결제금액 (과세)

    private String name; //

    private String OID; //

    private String MOID; //주문번호

    private String AuthDate; // 승인일자

    private String AuthCode; // 승인번호

    private String ResultCode; // 결과코드 (PG)

    private String ResultMsg; // 결과메세지 (PG)

    private String VbankNum;

    private String VbankName;

    private String MerchantReserved;

    private String MallReserved;

    private String BuyerAuthNum;

    private String ReceiptType;

    private String ReceitType;

    private String SUB_ID;

    private String VbankExpDate;

    private String VBankAccountName;
}
