package co.id.zahir.nutech.simsppob.app.modules.memberships.model;

import co.id.zahir.nutech.simsppob.core.model.AuditEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity extends AuditEntity {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String profileImage;
}
