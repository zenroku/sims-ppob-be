package co.id.zahir.nutech.simsppob.app.modules.informations.model.data;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BannerInfData {
    private String bannerName;
    private String bannerImage;
    private String description;
}
