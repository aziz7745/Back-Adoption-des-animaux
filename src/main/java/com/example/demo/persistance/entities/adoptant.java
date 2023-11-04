package com.example.demo.persistance.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class adoptant extends user
{

    public String revenu_mensuelle;
    @OneToMany(targetEntity = pet.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="id_adoptant",referencedColumnName = "id")
    public List<pet> listpets;



    public String getRevenu_mensuelle() 
    {
       return revenu_mensuelle;
   
    }

    public void setRevenu_mensuelle(String revenu_mensuelle) {
        this.revenu_mensuelle = revenu_mensuelle;
    }

    public List<pet> getListpets() {
        return listpets;
    }

    public void setListpets(ArrayList<pet> listpets) {
        this.listpets = listpets;
    }

  
    public adoptant() 
    {
    }

    public adoptant(String nom, String prenom, String email, String ville, String adresse, String numTel,String revune,String password) 
    {
        super(nom, prenom, email, ville, adresse, numTel,password);
        this.revenu_mensuelle=revune;
    }
    
    
}
