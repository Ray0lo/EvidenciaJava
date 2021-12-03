package com.example.demo.dao;

import com.example.demo.model.Usuarios;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuarios,Integer>{
    
}
