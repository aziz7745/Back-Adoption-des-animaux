package com.example.demo.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.adoptionrepo;
import com.example.demo.persistance.entities.adoption;
import com.example.demo.services.interfaces.IAdoption;

@Service
public class adoptionservice implements IAdoption 
{


    //injection de dépendance de l'interface IAdoption qui hérite de l'interface adoptionrepo; 
    @Autowired
    public adoptionrepo Iadoption;

    
    //methode qui permet d'ajouter une adoption
    public boolean saveadoption(adoption adoptionn)
    {
        try
        {
           Iadoption.save(adoptionn);
       return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    
    //methode qui permet de supprimer une adoption
    public boolean deleteadoption(adoption adoptionn)
    {

        try
        {
        Iadoption.delete(adoptionn);
        return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de modifier un admin
    public boolean updateadoption(adoption adoptionn)
    {
        try
        {
            Iadoption.save(adoptionn);
            return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


//find all adoption
  public List<adoption> findalladoption()
  {
    try
    {
        return(Iadoption.findAll());
    }
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
        return null;

    }    
  }

 //find adoption by adoptant
  public adoption findadoptionbyadoptant()
  {
    return null;
  }


  //find adoption by proprétaire
  public adoption findadoptionbyproprétaire()
  {
    return null;
  }
    
}
