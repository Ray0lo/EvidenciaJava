package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.Principal;
import com.example.demo.service.PirncipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class PrincipalController {
    @Autowired
    private PirncipalService principalService;
    

    @PostMapping("/guardarPrincipal")
    public Principal guarda(@RequestBody Principal principal)
    {
        return ((PirncipalService) principalService).guarda(principal);

    }

    @GetMapping("/mostrarPrincipal")

    public List <Principal> mostrarPrincipal()
    {
        return ((PirncipalService) principalService).buscar();

    }

    @GetMapping("/buscarPrincipal/{id}")
    public Principal buscaPrincipal(@PathVariable Integer id){
        return ((PirncipalService) principalService).buscarporId(id);

    }
    
}
