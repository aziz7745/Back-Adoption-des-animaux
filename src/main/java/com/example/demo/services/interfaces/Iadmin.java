package com.example.demo.services.interfaces;


import com.example.demo.persistance.entities.admin;

public interface Iadmin 
{
    public boolean saveadmin(admin admi);
    public boolean deleteadmin(admin ad);
    public boolean updateadmin(admin ad);
    public boolean exists(admin ad);
    public admin finbyusername(String mail);
}
