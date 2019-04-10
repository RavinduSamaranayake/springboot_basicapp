package com.example.demo.services.impl;

import com.example.demo.model.UserDTO;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;  // to use the database functions

    @Override
    public List<UserDTO> findAllUsers() {
        List<UserDTO> allusers = userRepository.findAll(); //get the data from user table
        return allusers;
    }

    @Override
    public String saveUser(UserDTO userdata) {
        userRepository.save(userdata); // save the data to user table
        return "Data Saved";

    }

    @Override
    public String modifyUser(UserDTO curUserdata) {
        String msg = null;
        if(curUserdata.getId() != null){ //check when user is existing or not... if user is existing then updated user is replace
            userRepository.save(curUserdata);
            msg = "Data Updated";
        }
        else{
            msg = "Error";
        }
        return msg;
    }
}
