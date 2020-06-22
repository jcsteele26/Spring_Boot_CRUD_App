package com.steele.springbootstarterparent.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
     
    @NotBlank(message = "Name is mandatory")
    private String name;
     
    @NotBlank(message = "Email is mandatory")
    private String email;
 
    // standard constructors / setters / getters / toString

    public User() {
        //Non argument constructor for JPA
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

    @Override
    public String toString() {
        return "User [ name= " + name + ", email= " + email + "]";
    }
    
}