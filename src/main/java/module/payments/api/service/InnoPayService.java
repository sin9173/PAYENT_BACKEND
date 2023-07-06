package module.payments.api.service;

import lombok.RequiredArgsConstructor;
import module.payments.api.InnoPayUrl;
import module.payments.api.model.request.innopay.VBankRequestReqDto;
import module.payments.api.model.response.innopay.VBankRequestResDto;
import module.payments.api.util.WebClientServiceInnoPay;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class InnoPayService {

    private final WebClientServiceInnoPay webClientServiceInnoPay;

    @Value("${webclient.innopay.license-key}")
    private String licenseKey;

    @Value("${webclient.innopay.mid}")
    private String mid;

    public void vbankAccount() {
        System.out.println("lisense Key : " + licenseKey);
        System.out.println("mid : " + mid);

        VBankRequestReqDto vBankRequestReqDto = new VBankRequestReqDto(mid, licenseKey,
                "2023062702", "1", "테스트상품", "1000",
                "테스트구매자", "01063232704", "dev@frankit.shop",
                "003", "1234567890123", "",
                "테스트구매자", "KR", "910101", "서울시 금천구 가산디지털2로 53", "01063232704",
                "1000", "1000", "2", "01063232704", "testCompany", "", "", "");

        webClientServiceInnoPay.connect(InnoPayUrl.VBANK_REQUEST.getUrl(), vBankRequestReqDto, VBankRequestResDto.class);
    }
}
