package com.example.demo.persistance.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistance.entities.admin;



@Repository
public interface adminrepo extends JpaRepository<admin,Integer>
{

    public admin findByEmail(String email);
    public boolean existsByEmail(String email);
}
