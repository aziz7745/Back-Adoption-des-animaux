package com.example.demo.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistance.entities.adoption;
import com.example.demo.services.service.adoptionservice;

@RestController
@RequestMapping("/adoption")
public class AdoptionController
{

@Autowired
public adoptionservice AdoptionService;
 

     @PostMapping("/add")
    public boolean saveadoption(@RequestBody adoption adoptionn) 
    {
        return(AdoptionService.saveadoption(adoptionn));
     
    }

     @DeleteMapping("/delete")
    public boolean deleteadoption(@RequestBody adoption adoptionn) 
    {
        return(AdoptionService.deleteadoption(adoptionn));
      
    }

     @PutMapping("/update")
    public boolean updateadoption(@RequestBody adoption adoptionn) 
    {
        return(AdoptionService.updateadoption(adoptionn));
        
    }

  @GetMapping("/getall")
    public List<adoption> findalladoption() 
    {
       return(AdoptionService.findalladoption());
         
    }

    
    public adoption findadoptionbyadoptant() 
    {
        return null;
       
    }

  
    public adoption findadoptionbyproprétaire() 
    {
        return null;
       
    }

    
}
