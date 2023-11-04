package com.example.demo.services.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.adoption;

public interface IAdoption 
{
    public boolean saveadoption(adoption adoptionn);
    public boolean deleteadoption(adoption adoptionn);
    public boolean updateadoption(adoption adoptionn);
    public List<adoption> findalladoption();
    public adoption findadoptionbyadoptant();
    public adoption findadoptionbyproprétaire();

}
