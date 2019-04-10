package com.example.demo.services;

import com.example.demo.model.UserDTO;

import java.util.List;

public interface UserServices {
    List<UserDTO> findAllUsers();

    String saveUser(UserDTO userdata);
}
