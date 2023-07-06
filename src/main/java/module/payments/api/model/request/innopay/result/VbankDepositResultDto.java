package module.payments.api.model.request.innopay.result;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VbankDepositResultDto {
    
    private String tid; //거래고유번호
    
    private String shopCode; //상점 아이디
    
    private String moid; //가맹점 주문번호
    
    private String goodsName; //상품명
    
    private String goodsAmt; //상품금액
    
    private String buyerName; //구매자명
    
    private String buyerCode; // 거래처코드
    
    private String buyerPhoneNo; //구매자 연락처
    
    private String buyerEmail; //구매자 이메일 주소
    
    private String pgName; //결제대행 PG 사명

    private String payMethodName; //결제수단명(가상계좌, 신용카드 등)

    private String pgMid; //PG 사 mid

    private String status; //거래상태 (25:결제완료, 85:결제취소)

    private String statusName; //가래상태명 (결제완료, 결제취소)

    private String cashReceiptType; //현금영수증 발급 구분 (1:소득공제, 2:지출증빙)

    private String cashReceiptSupplyAmt; //현금영수증 공급가액

    private String cashReceiptVat; //현금영수증 부가세

    private String pgAppDate; //승인일자

    private String pgAppTime; //승인시간

    private String pgTid; //PG사 거래고유번호

    private String vaccNo; //가상계좌번호

    private String vbankBankCd; //가상계좌은행코드

    private String vbankAcctNm; //입금자명

    private String vbankRefundAcctNo; //가상계좌 환불계좌 번호

    private String vbankRefundBankCd; //가상계좌 환불은행코드

    private String vbankRefundAcctNm; //가상계좌 환불 예금주명

}
