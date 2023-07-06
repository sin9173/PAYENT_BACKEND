package module.payments.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TosUrl { //토스페이먼츠 URL

    VIRTUAL_ACCOUNT("/v1/virtual-accounts", "가상계좌 발급"),
    PAYMENTS("/v1/payments", "paymentKey 로 결제 조회"),
    PAYMENTS_ORDERS("/v1/payments/orders", "orderId로 결제 조회");

    private String url; //URL
    private String desc; // 기능명

    public String getUrl(String param) { //URL 파라미터 추가
        return getUrl() + "/" + param;
    }
}
