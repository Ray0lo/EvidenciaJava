package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Usuarios;
import org.springframework.stereotype.Service;

public interface UsuarioService {
    public Usuarios guarda(Usuarios usuarios);
    public void delete(Integer id);
    public Usuarios buscarporId(Integer id);
    public List<Usuarios>buscar();
    
}
