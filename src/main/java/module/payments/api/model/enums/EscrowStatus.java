package module.payments.api.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum EscrowStatus {

    DELIVERY_BEFORE(0, "배송전"),

    ORDER_CONFIRM(1, "구매확정"),

    DELIVERY_STANDBY(2, "배송준비중"),

    DELIVERY_START(3, "배송시작"),

    CALCULATE_PUT_OFF(-1, "정산보류"),

    ORDER_CANCEL(-2, "구매취소");

    private Integer code;

    private String desc;

    @JsonCreator
    public static EscrowStatus find(Integer code) {
        return Arrays.stream(values()).filter(enu -> enu.getCode().equals(code))
                .findAny().orElseThrow(() -> new IllegalArgumentException("잘못된 에스크로상태 입니다."));
    }
}
