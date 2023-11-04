package com.example.demo.services.interfaces;

import com.example.demo.persistance.entities.adoptant;

public interface IAdoptant
{

   public boolean saveadoptant(adoptant adop);
   public boolean deleteadoptant(adoptant ad);
   public boolean updateadoptant(adoptant ad);
   public boolean exists(adoptant ad);
   public adoptant finbyusername(String mail);



}
