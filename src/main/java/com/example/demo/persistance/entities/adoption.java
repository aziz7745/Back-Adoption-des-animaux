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
public class adoption implements Serializable
{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false,updatable = false)
 public int id;

 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "id_adoptant")
 public adoptant adoptant;
 
 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "id_propretaire")
 public propretaire propretaire;
 
 public int getId() 
 {
    return id;
}

public adoption(int id, com.example.demo.persistance.entities.adoptant adoptant, com.example.demo.persistance.entities.propretaire proprétaire) {
    this.id = id;
    this.adoptant = adoptant;
    this.propretaire = proprétaire;
}

public void setId(int id) {
    this.id = id;
}

public adoptant getAdoptant() {
    return adoptant;
}

public void setAdoptant(adoptant adoptant) {
    this.adoptant = adoptant;
}

public propretaire getProprétaire() {
    return propretaire;
}

public void setProprétaire(propretaire proprétaire) {
    this.propretaire = proprétaire;
}

public adoption() {
}
 
 
}
