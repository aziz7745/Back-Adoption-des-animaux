package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistance.entities.propretaire;

@Repository
public interface propretairerepo extends JpaRepository<propretaire,Integer> 
{

    public propretaire findByEmail(String email);
    public boolean existsByEmail(String email);
    
}
