package com.api_springboot.miAPI.dao;

import com.api_springboot.miAPI.models.UserModel;

import java.util.List;

public interface UserDao {

    // GetAllUsers
    List<UserModel> getUsersDao();

    // DeleteUser
    void deleteUsersDao(Long id);
}
