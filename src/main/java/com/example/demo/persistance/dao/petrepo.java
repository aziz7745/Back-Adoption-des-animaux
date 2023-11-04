package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistance.entities.pet;

@Repository
public interface petrepo extends JpaRepository<pet,Integer> 
{
    
}
