package com.example.demo.services.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.usersrepo;
import com.example.demo.persistance.entities.users;
import com.example.demo.services.interfaces.Iuser;

@Service
public class usersservice implements Iuser
{
    
//injection de dépendance de l'interface Iuser qui hérite de l'interface userrepo
    @Autowired
public usersrepo IUser;

@Autowired
public EmailService mailservices;


    //methode qui permet d'ajouter un user
    public boolean saveuser(users userr)
    {
        try
        {
         IUser.save(userr);
         mailservices.sendSimpleEmail(userr.getUsername(),"Your Password is:"+userr.getPassword(),"Your account is Created");

       return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    
    //methode qui permet de supprimer un user
    public boolean deleteuser(users userr)
    {

        try
        {
         IUser.delete(userr);
        return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de modifier un user
    public boolean updateuser(users user)
    {
        try
        {
            IUser.save(user);
            return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    //méthode qui permet de vérifier l'éxistance de l'admin
    public boolean exists(users user)
    {
    return(IUser.existsByUsername(user.getUsername()));
    }


   //méthode qui permet de find admin by email
    public users finbyusername(String username)
    {

        try
        {

            return(IUser.findByUsername(username));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
   
    }

    //methode qui permet déidentifier un user
    public users login(String mail,String password)
    {
     
        try
        {
            users us=IUser.findUser(mail,password);
            return(us);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }

    }

//méthode qui permet de générer un mot de passe
    public String resetpassword(String mail)
    {
        String caracteres = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newPassword="";
        Random rande = new Random();
        int depart=rande.nextInt(10);
      for (int i=depart;i<caracteres.length();i++)
      {
        Random rand = new Random();
        int position=rand.nextInt(i);
        newPassword=newPassword+caracteres.charAt(position);
      }

      return newPassword;
    }


}
