package com.example.demo.persistance.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class propretaire extends user 
{
    @OneToMany(targetEntity = pet.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="id_propretaire",referencedColumnName = "id")
    public List<pet> listpets;
    
    public propretaire() 
    {
    }

    public propretaire(String nom, String prenom, String email, String ville, String adresse, String numTel,String password) {
        super(nom, prenom, email, ville, adresse, numTel,password);
    }

    public List<pet> getListpets() {
        return listpets;
    }

    public void setListpets(ArrayList<pet> listpets) {
        this.listpets = listpets;
    }
    public propretaire(String nom, String prenom, String email, String ville, String adresse, String numTel,ArrayList<pet> listpet,String password) {
        super(nom, prenom, email, ville, adresse, numTel,password);
        this.listpets=listpet;

    }
}