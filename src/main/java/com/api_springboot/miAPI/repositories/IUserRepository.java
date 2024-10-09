package com.api_springboot.miAPI.repositories;


import com.api_springboot.miAPI.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // clase que permite hacer querys a una base de datos
public interface IUserRepository extends JpaRepository<UserModel, Long> {
}
