package co.id.zahir.nutech.simsppob.app.modules.informations.model.entity;

import co.id.zahir.nutech.simsppob.core.model.AuditEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "banners")
public class BannerEntity extends AuditEntity {
    private String bannerName;
    private String bannerImage;
    private String description;
}
