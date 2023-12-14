package com.example.kameleoontrialtask.service;

import com.example.kameleoontrialtask.model.MyUser;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * Add a new user
     *
     * @param u - user to be added
     */
    void create(MyUser u);
    // and this is the only function for it described in the trial task so that's all :-)
}