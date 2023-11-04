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

import com.example.demo.persistance.entities.admin;
import com.example.demo.persistance.entities.users;
import com.example.demo.services.service.adminservice;
import com.example.demo.services.service.usersservice;

@RestController
@RequestMapping("/admin")
public class AdminController
{

    //injection de dépendance de service adminservice
    @Autowired
    public adminservice AdminService;

    @Autowired
    public usersservice UserService;

    @PostMapping("/add")
    public boolean saveadmin(@RequestBody admin admin) 
    {
        if(AdminService.exists(admin)==false)
        {
            UserService.saveuser(new users(admin.getEmail(),admin.getPassword(),"admin"));
         return(AdminService.saveadmin(admin));
        }
        else
        {
        return false;
        }
    }

     @DeleteMapping("/delete")
    public boolean deleteadmin(@RequestBody admin ad) 
    {
        return (AdminService.deleteadmin(ad));
        
    }

   @PutMapping("/update")
    public boolean updateadmin(@RequestBody admin ad) 
    {
        return(AdminService.updateadmin(ad));
       
    }

    
    @GetMapping("/getbyusername/{mail}")
    public admin finbyusername(@PathVariable("mail") String mail) 
    {
        return(AdminService.finbyusername(mail));
        
    } 


}
