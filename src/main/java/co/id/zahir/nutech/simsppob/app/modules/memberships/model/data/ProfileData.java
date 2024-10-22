package co.id.zahir.nutech.simsppob.app.modules.memberships.model.data;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProfileData {
    private String email;
    private String firstName;
    private String lastName;
    private String profileImage;
}
