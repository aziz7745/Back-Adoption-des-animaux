package com.example.demo.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.adminrepo;
import com.example.demo.persistance.entities.admin;
import com.example.demo.services.interfaces.Iadmin;

@Service
public class adminservice implements Iadmin 
{
 

    //injection de dépondance de l'interface IAdmin qui extend adminrepo 
    @Autowired
    public adminrepo IAdmin;


    //methode qui permet d'ajouter un admin
    public boolean saveadmin(admin admi)
    {
        try
        {
       IAdmin.save(admi);
       return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    
    //methode qui permet de supprimer un admin
    public boolean deleteadmin(admin ad)
    {

        try
        {
        IAdmin.delete(ad);
        return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de modifier un admin
    public boolean updateadmin(admin ad)
    {
        try
        {
            IAdmin.save(ad);
            return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de vérifier l'éxistance de l'admin
    public boolean exists(admin ad)
    {
    return(IAdmin.existsByEmail(ad.getEmail()));
    }


   //méthode qui permet de find admin by email
    public admin finbyusername(String mail)
    {

        try
        {

            return(IAdmin.findByEmail(mail));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
   
    }

}
