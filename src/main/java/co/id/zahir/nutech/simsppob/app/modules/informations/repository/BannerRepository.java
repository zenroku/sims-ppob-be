package co.id.zahir.nutech.simsppob.app.modules.informations.repository;

import co.id.zahir.nutech.simsppob.app.modules.informations.model.entity.BannerEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@AllArgsConstructor
public class BannerRepository {
    private final EntityManager entityManager;
    public List<BannerEntity> get() {
        String jpql = "SELECT * from banners";
        return entityManager.createNativeQuery(jpql, BannerEntity.class).getResultList();
    }
}
