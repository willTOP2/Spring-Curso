package com.example.api.services.Impl;

import com.example.api.domain.User;
import com.example.api.repositories.UserRepository;
import com.example.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
     private UserRepository repository;
    @Override
    public User findById(Integer id) {

        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);

    }
}
