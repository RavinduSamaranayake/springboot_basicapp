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

    @GetMapping("/all") //get all data
    public List<UserDTO> allUsers() {
        return userServices.findAllUsers();
    }

    @PostMapping("/add") //add user
    public String addUser(@RequestBody UserDTO Userdata){
        return userServices.saveUser(Userdata);
    }

    @PutMapping("/update") //update user
    public String updateUser(@RequestBody UserDTO curUserdata){
        return userServices.modifyUser(curUserdata);
    }

    @GetMapping("/delete/{id}") //find user by id
    public String getUserById(@PathVariable Integer id){  //path variable is the Integer Id
         return userServices.DelById(id);
    }

}
