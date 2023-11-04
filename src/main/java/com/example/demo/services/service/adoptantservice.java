package com.example.demo.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.adoptantrepo;
import com.example.demo.persistance.entities.adoptant;
import com.example.demo.services.interfaces.IAdoptant;

@Service
public class adoptantservice implements IAdoptant 
{
    
    //injection de dépendance de l'interface IAdoptant qui hérite de l'interface adoptanrepo
    @Autowired
    public adoptantrepo IAdoptantt;


    
    //methode qui permet d'ajouter un adoptant
    public boolean saveadoptant(adoptant adop)
    {
        try
        {
       IAdoptantt.save(adop);
       return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    
    //methode qui permet de supprimer un adoptant
    public boolean deleteadoptant(adoptant ad)
    {

        try
        {
        IAdoptantt.delete(ad);
        return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de modifier un adoptant
    public boolean updateadoptant(adoptant ad)
    {
        try
        {
            IAdoptantt.save(ad);
            return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de vérifier l'éxistance d'un adoptant
    public boolean exists(adoptant ad)
    {
    return(IAdoptantt.existsByEmail(ad.getEmail()));
    }


   //méthode qui permet de find adoptant by email
    public adoptant finbyusername(String mail)
    {

        try
        {

            return(IAdoptantt.findByEmail(mail));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
   
    }

    
}
