package com.example.kameleoontrialtask.service;

import com.example.kameleoontrialtask.model.MyUser;
import com.example.kameleoontrialtask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void create(MyUser u) {
        u.setReg_date(new Date());
        userRepository.save(u);
    }
}