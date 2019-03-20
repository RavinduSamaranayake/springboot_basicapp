package com.example.demo.services.impl;

import com.example.demo.services.UserServices;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserServices {
    @Override
    public String findAllUsers() {
        //search db and reurn all users

        return "These are the all users";
    }
}
