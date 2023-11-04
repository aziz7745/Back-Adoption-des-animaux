package com.example.demo.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.petrepo;
import com.example.demo.persistance.entities.pet;
import com.example.demo.services.interfaces.Ipet;

@Service
public class petservice implements Ipet
{


//injection de dépéndance de l'interface Ipet qui hérite de l'interface petrepo
    @Autowired
    public petrepo IPet;

    
    //methode qui permet d'ajouter un pet
    public boolean savepet(pet pett)
    {
        try
        {
       IPet.save(pett);
       return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    
    //methode qui permet de supprimer un pet
    public boolean deletepet(pet pett)
    {

        try
        {
        IPet.delete(pett);
        return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de modifier un pet
    public boolean updatepet(pet pett)
    {
        try
        {
            IPet.save(pett);
            return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //find all pet
    public List<pet> findallpet()
    {
        return(IPet.findAll());
    }

    
}
