package com.example.demo.persistance.entities;


import javax.persistence.Entity;


@Entity
public class admin extends user 
{

    public admin() 
    {
    }

    public admin(String nom, String prenom, String email, String ville, String adresse, String numTel,String password) 
    {
        super(nom, prenom, email, ville, adresse, numTel,password);
    }
    
}
