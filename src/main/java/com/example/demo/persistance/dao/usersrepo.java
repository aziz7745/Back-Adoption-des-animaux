package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.persistance.entities.users;

@Repository
public interface usersrepo extends JpaRepository<users,Integer> 
{
    public users findByUsername(String username);
    public boolean existsByUsername(String username);

    @Query("SELECT u FROM users u WHERE u.username = ?1 and u.password = ?2")
    public users findUser(String username, String password);
    
}
