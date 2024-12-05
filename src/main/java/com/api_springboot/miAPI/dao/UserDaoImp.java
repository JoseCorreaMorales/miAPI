package com.api_springboot.miAPI.dao;

import com.api_springboot.miAPI.models.UserModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository // acceder a la bd
@Transactional // brinda la capasidad de poder armar manualmente las consultas SQL para la BD
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager; // conexion con la bd


    /*
    * 1.  En HQL (Hibernate Query Language), se debe usar el nombre de la entidad,
    *  no el nombre de la tabla de la base de datos.
    *
    * 2. Al utilizar HQL, se puede omitir SELECT * porque se trabajan con clases de entidad
    *  en lugar de tablas.
     * */
    @Override
    public List<UserModel> getUsersDao() {
        String sql = "FROM UserModel";
         return entityManager.createQuery(sql, UserModel.class).getResultList();
    }

    @Override
    public void deleteUsersDao(Long id) {
        String sql = "DELETE FROM UserModel u WHERE u.id = :id";
        entityManager.createQuery(sql)
                .setParameter("id", id)
                .executeUpdate();

        //UserModel user = entityManager.find(UserModel.class, id);
        //entityManager.remove(user);
    }


}
