package com.example.demo.model;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "testmodeltable") //create a user table
public class testmodel{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "idtest")
    private Integer id;

    @Column(name = "firstname")
    private String fname;

    @Column(name = "lastname")
    private String lname;

    @Column(name = "email")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setFName(String fname)
    {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
