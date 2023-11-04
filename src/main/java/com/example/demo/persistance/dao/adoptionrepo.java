package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistance.entities.adoption;

@Repository
public interface adoptionrepo extends JpaRepository<adoption,Integer> 
{
    
}
