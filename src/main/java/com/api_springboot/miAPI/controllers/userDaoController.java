package com.api_springboot.miAPI.controllers;


import com.api_springboot.miAPI.dao.UserDao;
import com.api_springboot.miAPI.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users-dao")
public class userDaoController {

    @Autowired // inyeccion de depenecias userDao
    private UserDao userDao;

    @GetMapping()
    public List<UserModel> getUserDao() {
        return userDao.getUsersDao();
    }

   @DeleteMapping(path = "/{id}")
    public void deleteUsersDao(@PathVariable Long id) {
        userDao.deleteUsersDao(id);
    }
}
