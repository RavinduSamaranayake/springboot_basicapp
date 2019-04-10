package com.example.demo.repositories;

import com.example.demo.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer> {

    //getAll users
    //findBy Id
    //delete
    //update
    //custom query
}
