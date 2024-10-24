package co.id.zahir.nutech.simsppob.app.modules.memberships.repository;

import co.id.zahir.nutech.simsppob.app.modules.informations.model.entity.BannerEntity;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepository {

    private final EntityManager entityManager;

    @Transactional
    public void createUser(UserEntity user){

        String jpql = "INSERT INTO users (email,first_name,last_name,password,profile_image) VALUES (:email,:firstName,:lastName,:password,:profileImage)";
        Query query = entityManager.createNativeQuery(jpql);

        query.setParameter("email",user.getEmail());
        query.setParameter("firstName",user.getFirstName());
        query.setParameter("lastName",user.getLastName());
        query.setParameter("password",user.getPassword());
        query.setParameter("profileImage",user.getProfileImage());

        query.executeUpdate();
    }

    public UserEntity getUserByEmail(String email){
        String jpql = "SELECT * FROM users where email=:email limit 1";
        List<UserEntity> list = entityManager.createNativeQuery(jpql, UserEntity.class).setParameter("email",email).getResultList();
        return list.isEmpty() ? null : list.get(0);
    }
}
