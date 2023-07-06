package module.payments.api.model.request.innopay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class VBankRequestReqDto { //가상계좌 발급 요청데이터
    
    private String mid; //상점아이디
    
    private String licenseKey; // API 키
    
    private String moid; // 주문번호 
    
    private String goodsCnt; //상품수량
    
    private String goodsName; //상품명
    
    private String amt; //결제금액
    
    private String buyerName; //구매자명
    
    private String buyerTel; //구매자연락처 (선택)
    
    private String buyerEmail; //구매자 이메일 주소
    
    private String vbankBankCode; //가상계좌 은행코드
    
    private String vbankNum; //가상계좌 번호
    
    private String vbankExpDate; //가상계좌 임금기한 (yyyyMMdd) 없을 경우 가맹점에 설정된 기본값으로 셋팅
    
    private String vbankAccountName; //가상계좌 입금자명
    
    private String countryCode; //국적 (KR, US, CN)
    
    private String socNo; // 생년월일 (여권번호)
    
    private String addr; //주소 (선택)
    
    private String accountTel; //입금자 연락처

    /** 현금 영수증 (선택) */
    private String receiptAmt; //현금 영수증 금액
    
    private String receiptServiceAmt; //현금 영수증 봉사료
    
    private String receiptType; //현금 영수증 발급구분 (0:미발행, 1:소득공제, 2:지출증빙)

    private String receiptIdentity; //현금 영수증 발급 번호

    private String mallReserved; //예비 필드 (결제 완료 후 리턴받을 가맹점별 데이터) (선택)
    
    private String userId; //하위 가맹점명 (선택)
    
    private String buyerCode; //거래처코드 (선택)
    
    private String mallUserId; //가맹점 구매자 아이디


}
