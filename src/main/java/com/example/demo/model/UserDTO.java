package com.example.demo.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user") //create a user table
public class UserDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name = "user_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}