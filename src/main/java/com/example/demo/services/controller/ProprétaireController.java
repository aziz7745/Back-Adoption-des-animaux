package com.example.demo.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.persistance.entities.propretaire;
import com.example.demo.persistance.entities.users;
import com.example.demo.services.service.propretaireservice;
import com.example.demo.services.service.usersservice;

@RestController
@RequestMapping("/proprétaire")
public class ProprétaireController 
{
    
    @Autowired
    public propretaireservice PropréétaireService;
    
    
 
    @Autowired
    public usersservice UserService;

   

    @PostMapping("/add")
    public boolean saveproprétaire(@RequestBody propretaire prop) 
    {


        if(PropréétaireService.exists(prop)==false)
        {
          UserService.saveuser(new users(prop.getEmail(),prop.getPassword(),"propretaire"));
          return (PropréétaireService.saveproprétaire(prop));
        }
        else 
        return false;
      
    }

@DeleteMapping("/delete")
    public boolean deleteproprétaire(@RequestBody propretaire prop) {
       return (PropréétaireService.deleteproprétaire(prop));
    }

 @PutMapping("/update")
    public boolean updateproprétaire(@RequestBody propretaire prop) {
    return (PropréétaireService.updateproprétaire(prop));
    }


  @GetMapping("/getbyusername/{mail}")
    public propretaire finbyusername(@PathVariable("mail") String mail) {
    return (PropréétaireService.finbyusername(mail));
    }


}
