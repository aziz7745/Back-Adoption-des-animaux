package com.example.demo.persistance.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user implements Serializable
{
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    public int id;
    public String nom;
    public String prenom;
    public String email;
    public String ville;
    public String adresse;
    public String numTel;
    public String password;
    
    public user() 
    {

    }

    public user(String nom, String prenom, String email, String ville, String adresse, String numTel,String password) 
    {
        
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.ville = ville;
        this.adresse = adresse;
        this.numTel = numTel;
        this.password=password;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getEmail() {
        return email;
    }
    public String getVille() {
        return ville;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getNumTel() {
        return numTel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
