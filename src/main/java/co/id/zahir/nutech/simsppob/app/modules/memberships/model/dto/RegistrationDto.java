package co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RegistrationDto {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
}