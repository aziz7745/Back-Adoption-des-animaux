package com.example.demo.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.propretairerepo;
import com.example.demo.persistance.entities.propretaire;
import com.example.demo.services.interfaces.Ipropretaire;


@Service
public class propretaireservice implements Ipropretaire 
{


    //injection de dépendance de l'interface Iproprétaire qui hériyte de l'interface proprétairerepo 
    @Autowired
    public propretairerepo IProprétaire;


    
    //methode qui permet d'ajouter un proprétaire
    public boolean saveproprétaire(propretaire prop)
    {
        try
        {
       IProprétaire.save(prop);
       return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    
    //methode qui permet de supprimer un proprétaire
    public boolean deleteproprétaire(propretaire prop)
    {

        try
        {
        IProprétaire.delete(prop);
        return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de modifier un proprétaire
    public boolean updateproprétaire(propretaire prop)
    {
        try
        {
            IProprétaire.save(prop);
            return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de vérifier l'éxistance de proprétaire
    public boolean exists(propretaire prop)
    {
    return(IProprétaire.existsByEmail(prop.getEmail()));
    }


   //méthode qui permet de find admin by email
    public propretaire finbyusername(String mail)
    {

        try
        {
           

            return(IProprétaire.findByEmail(mail));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
   
    }

    
}
