package com.example.demo.service;

import com.example.demo.model.Principal;
import java.util.List;

public interface PirncipalService {
    
    public Principal guarda(Principal usuarios);
    public void delete(Integer id);
    public Principal buscarporId(Integer id);
    public List<Principal>buscar();
    
}
