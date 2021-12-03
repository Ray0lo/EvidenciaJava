package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Usuarios;
import com.example.demo.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    

    @PostMapping("/guardarUsuario")
    public Usuarios guarda(@RequestBody Usuarios usuarios)
    {

        return usuarioService.guarda(usuarios);

    }

    @GetMapping("/mostrarUsuarios")

    public List <Usuarios> mostrarUsuarios()
    {
        return usuarioService.buscar();

    }

    @GetMapping("/buscarUsuario/{id}")
    public Usuarios buscaUsuarios(@PathVariable Integer id){
        return usuarioService.buscarporId(id);

    }
    
}
