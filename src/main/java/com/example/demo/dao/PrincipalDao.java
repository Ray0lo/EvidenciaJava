package com.example.demo.dao;

import com.example.demo.model.Principal;

import org.springframework.data.repository.CrudRepository;

public interface PrincipalDao extends CrudRepository<Principal,Integer>{
    
}
