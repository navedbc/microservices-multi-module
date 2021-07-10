package com.in2min.userservice.service;


import com.in2min.userservice.model.User;
import com.in2min.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository repository;


    public User getUser(Long id) {
       return repository.getById(id);
    }


    public User saveUser(User user){
        return repository.save(user);
    }
}
