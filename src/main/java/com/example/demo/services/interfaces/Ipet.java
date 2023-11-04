package com.example.demo.services.interfaces;

import java.util.List;

import com.example.demo.persistance.entities.pet;

public interface Ipet  
{
    public boolean savepet(pet pett);
    public boolean deletepet(pet pett);
    public boolean updatepet(pet pett);
    public List<pet> findallpet();

    
    
}
