package co.id.zahir.nutech.simsppob.app.modules.informations.model.entity;

import co.id.zahir.nutech.simsppob.core.model.AuditEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "services")
public class ServiceEntity extends AuditEntity {
    private String serviceCode;
    private String serviceName;
    private String serviceIcon;
    private BigDecimal serviceTariff;
}
