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
import com.example.demo.persistance.entities.adoptant;
import com.example.demo.persistance.entities.propretaire;
import com.example.demo.persistance.entities.users;
import com.example.demo.services.service.EmailService;
import com.example.demo.services.service.adminservice;
import com.example.demo.services.service.adoptantservice;
import com.example.demo.services.service.propretaireservice;
import com.example.demo.services.service.usersservice;


@RestController
@RequestMapping("/users")
public class UsersController 
{

    @Autowired
    public usersservice UserService;
    @Autowired
    public adminservice AdminService;
    @Autowired
    public adoptantservice AdoptantService;
    @Autowired
    public propretaireservice PropretaireService;
    @Autowired
    public EmailService mailservices;
  

    @PostMapping("/add")
    public boolean saveuser(@RequestBody users userr) 
    {
     
       return (UserService.saveuser(userr));
    }

  @DeleteMapping("/delete")
    public boolean deleteuser(@RequestBody users userr) 
    {
        return (UserService.deleteuser(userr));
    }

  @PutMapping("/update")
    public boolean updateuser(@RequestBody users user) 
    {
      return (UserService.updateuser(user));
    }

  
   @GetMapping("/get{mail}")
    public users finbyusername(@PathVariable("mail") String username) 
    {
        return(UserService.finbyusername(username));
    }



    @GetMapping("/login/{mail}/{password}")
    public users verifUsers(@PathVariable String mail,@PathVariable String password)
    {
      return(UserService.login(mail, password));
    }

   @GetMapping("/reset/{mail}")
    public void getnewpassword(@PathVariable String mail)
    {
      String newpassord=UserService.resetpassword(mail);
      users userss= UserService.finbyusername(mail);
      userss.setPassword(newpassord);
      UserService.updateuser(userss);

    if(userss.getType().equals("admin"))
    {
      System.out.println("admin");
      admin ad=AdminService.finbyusername(mail);
      ad.setPassword(newpassord);
      AdminService.updateadmin(ad);
    }
    else if(userss.getType().equals("adoptant"))
    {
      adoptant adopt=AdoptantService.finbyusername(mail);
      adopt.setPassword(newpassord);
      AdoptantService.updateadoptant(adopt);
    }
    else if(userss.getType().equals("propretaire"))
    {
      propretaire prop=PropretaireService.finbyusername(mail);
      prop.setPassword("");
      PropretaireService.updateproprétaire(prop);
    }
     
      mailservices.sendSimpleEmail(mail,"Your new Password is :"+newpassord,"Updated your last Password");
      
    }
    
}
