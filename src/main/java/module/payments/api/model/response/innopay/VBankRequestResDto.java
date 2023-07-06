package module.payments.api.model.response.innopay;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import module.payments.api.model.response.Response;

@Getter
@Setter
@ToString
public class VBankRequestResDto implements Response { //가상계좌 발급 응답데이터

    private String tid;

    private String mid;

    private String moid; // 가맹점 주문번호

    private String goodsCnt; //상품 수량

    private String goodsName; //상품명

    private String amt; // 결제금액

    private String buyerName; //구매자명

    private String buyerTel; //구매자연락처

    private String buyerEmail; // 구매자 이메일 주소

    private String authDate; //가상계좌 발급일시

    private String resultCode; //결과 코드

    private String resultMsg; //결과 메세지

    private String vbankNum; //가상계좌 번호

    private String vbankBankNm; //가상계좌 은행명

    private String mallReserved; //예비 필드
}
