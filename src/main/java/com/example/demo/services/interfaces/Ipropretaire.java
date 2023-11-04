package com.example.demo.services.interfaces;

import com.example.demo.persistance.entities.propretaire;

public interface Ipropretaire 
{
    public boolean saveproprétaire(propretaire prop);
    public boolean deleteproprétaire(propretaire prop);
    public boolean updateproprétaire(propretaire prop);
    public boolean exists(propretaire prop);
    public propretaire finbyusername(String mail);
}
