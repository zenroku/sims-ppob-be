package co.id.zahir.nutech.simsppob.app.modules.informations.repository;

import co.id.zahir.nutech.simsppob.app.modules.informations.model.entity.ServiceEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@AllArgsConstructor
public class ServicesRepository {
    private final EntityManager entityManager;
    public List<ServiceEntity> get() {
        String jpql = "SELECT * from services";
        return entityManager.createNativeQuery(jpql, ServiceEntity.class).getResultList();
    }
}
