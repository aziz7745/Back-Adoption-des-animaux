package com.example.demo.services.interfaces;

import com.example.demo.persistance.entities.users;

public interface Iuser
{
    public boolean saveuser(users userr);
    public boolean deleteuser(users userr);
    public boolean updateuser(users user);
    public boolean exists(users user);
    public users finbyusername(String username);
    
}
