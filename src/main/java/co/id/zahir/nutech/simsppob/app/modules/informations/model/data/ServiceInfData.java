package co.id.zahir.nutech.simsppob.app.modules.informations.model.data;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ServiceInfData {
    private String serviceCode;
    private String serviceName;
    private String serviceIcon;
    private BigDecimal serviceTariff;
}
