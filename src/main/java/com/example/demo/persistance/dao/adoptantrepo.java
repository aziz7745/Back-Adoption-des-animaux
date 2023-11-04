package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistance.entities.adoptant;

@Repository
public interface adoptantrepo extends JpaRepository<adoptant,Integer> 
{
    
   public adoptant findByEmail(String email);  
   public boolean existsByEmail(String email);
    
}
