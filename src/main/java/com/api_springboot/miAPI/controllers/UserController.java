package com.api_springboot.miAPI.controllers;


import com.api_springboot.miAPI.models.UserModel;
import com.api_springboot.miAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    //@Autowired inyeccion de dependecias para hacer uso del servicio que obtiene los datos de la bd
    @Autowired
    private UserService userService;

    // GetAll
    @GetMapping
    public ArrayList<UserModel> getUsers() {
        return this.userService.getusers();
    }

    // Save
    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    // Get by id
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable long id) {
        return this.userService.getUserById(id);
    }

    // Update byId
    @PutMapping(path = "/{id}")
    public Optional<UserModel> updateById(@RequestBody UserModel request, @PathVariable Long id) {
        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable Long id) {
        boolean ok =  this.userService.deleteUser(id);
        if(ok) {
            return "Deleted";
        }else {
            return "Something went wrong";
        }
    }

}
