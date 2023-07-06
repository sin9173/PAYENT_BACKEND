package module.payments.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InnoPayUrl {

    /** 가상계좌 */
    VBANK_REQUEST_STATUS("/vacctInquery", "가상계좌 발급상태 조회"),
    VBANK_REQUEST("/vbankReq", "가상계좌 발급요청"),
    VBANK_CANCEL("/vbankCancel", "가상계좌 취소요청"),
    VBANK_PAMENT_RESULT("", "가상계좌 입금결과 (가맹점 URL)");

    private String url; //URL
    private String desc; // 기능명

}
