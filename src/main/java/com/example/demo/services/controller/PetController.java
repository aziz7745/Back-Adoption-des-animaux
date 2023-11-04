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

import com.example.demo.persistance.entities.pet;
import com.example.demo.services.service.petservice;

@RestController
@RequestMapping("/pet")
public class PetController  
{
    @Autowired
    public petservice PetService;

    

    @PostMapping("/add")
    public boolean savepet(@RequestBody pet pett) 
    {
        return PetService.savepet(pett);
      
    }

   @DeleteMapping("/delete")
    public boolean deletepet(@RequestBody pet pett) 
    {
       return PetService.deletepet(pett);
    }

    @PutMapping("/update")
    public boolean updatepet(@RequestBody pet pett) 
    {
      return PetService.updatepet(pett);
    }

  @GetMapping("/getall")
    public List<pet> findallpet() 
    {
        return (PetService.findallpet());
       
    }


    
}
