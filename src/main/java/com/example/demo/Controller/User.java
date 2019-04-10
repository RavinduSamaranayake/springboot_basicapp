package com.example.demo.Controller;
import com.example.demo.model.UserDTO;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDTO> allUsers() {
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO Userdata){
        return userServices.saveUser(Userdata);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDTO curUserdata){
        return userServices.modifyUser(curUserdata);
    }

}
