package com.example.demo.persistance.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;




@Entity
public class pet implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    public int id;
    public  String nom;
    public String age;
    public String sexe;
    public String description;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_adoptant")
    public adoptant adoptant;

    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "id_propretaire")
    public propretaire propretaire;
    
    public boolean disponible;

    public adoptant getAdoptant() {
        return adoptant;
    }

    public propretaire getProprétaire() {
        return propretaire;
    }

    public void setAdoptant(adoptant adoptant) 
    {
        this.adoptant = adoptant;
    }

    public void setProprétaire(propretaire proprétaire) {
        this.propretaire = proprétaire;
    }

    public pet() 
    {
    }

    public pet(int id, String nom, String age, String sexe, String description,propretaire proprétaire,adoptant adoptant,boolean dispo) 
    {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.description = description;
        this.propretaire=proprétaire;
        this.adoptant=adoptant;
        this.disponible=dispo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getAge() {
        return age;
    }
    public String getSexe() {
        return sexe;
    }
    public String getDescription() {
        return description;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
