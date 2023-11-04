package com.example.demo.persistance.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class users implements Serializable
{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
public int id;
public String username;
public String password;
public String type;


public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public String getUsername() {
    return username;
}
public String getPassword() {
    return password;
}

public void setUsername(String username) {
    this.username = username;
}
public void setPassword(String password) {
    this.password = password;
}
public users(String username, String password,String type) {
    this.type=type;
    this.username = username;
    this.password = password;
}
public users() {
}
    
}
