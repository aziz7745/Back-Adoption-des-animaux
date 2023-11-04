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

import com.example.demo.persistance.entities.adoptant;
import com.example.demo.persistance.entities.users;
import com.example.demo.services.service.adoptantservice;
import com.example.demo.services.service.usersservice;


@RestController
@RequestMapping("/adoptant")
public class AdoptantController  
{

    @Autowired
    public adoptantservice AdoptantService;

  
    @Autowired
    public usersservice UserService;

     @PostMapping("/save")
    public boolean saveadoptant(@RequestBody adoptant adop) 
    {
      if(AdoptantService.exists(adop)==false)
        {
          UserService.saveuser(new users(adop.getEmail(),adop.getPassword(),"adoptant"));
          return(AdoptantService.saveadoptant(adop));
        }

        else 
        {
        return false;
        }
      
    }

    @DeleteMapping("/delete")
    public boolean deleteadmin(@RequestBody adoptant ad) 
    {
      return(AdoptantService.deleteadoptant(ad));
    }

     @PutMapping("/update")
    public boolean updateadmin(@RequestBody adoptant ad) 
    {
       return(AdoptantService.updateadoptant(ad));
    }


     @GetMapping("/getbyusername/{mail}")
    public adoptant finbyusername(@PathVariable("mail") String mail) 
    {
       return(AdoptantService.finbyusername(mail));
    }
    
}
