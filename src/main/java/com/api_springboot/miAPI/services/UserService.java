package com.api_springboot.miAPI.services;

import com.api_springboot.miAPI.models.UserModel;
import com.api_springboot.miAPI.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired // inyeccion de dependecias
    IUserRepository userRepository;

    public ArrayList<UserModel> getusers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<UserModel> updateById(UserModel request, Long id) {
        Optional<UserModel> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            UserModel user = userOptional.get();
            user.setName(request.getName());
            user.setLastname(request.getLastname());
            user.setAge(request.getAge());

            userRepository.save(user);
            return Optional.of(user);
        }
        return Optional.empty(); // si es Null
    }

    public Boolean deleteUser(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            System.out.println("Error al eliminar.");
            return  false;
        }
    }


}















