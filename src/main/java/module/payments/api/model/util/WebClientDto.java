package module.payments.api.model.util;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WebClientDto<T> {

    private Integer status; //HTTP 응답코드

    private String message; // 응답메세지

    private T data; //데이터

    public WebClientDto(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
