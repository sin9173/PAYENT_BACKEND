package module.payments.api.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HeaderDto {

    private String key;

    private String value;

    public HeaderDto(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
