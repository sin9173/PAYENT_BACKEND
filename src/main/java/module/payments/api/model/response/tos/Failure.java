package module.payments.api.model.response.tos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import module.payments.api.model.response.Response;

@Getter
@Setter
@ToString
public class Failure implements Response {

    private String code;

    private String message;
}
