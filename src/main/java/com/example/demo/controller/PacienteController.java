package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.Paciente;
import com.example.demo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")

public class PacienteController {

    @Autowired
    private PacienteService pacienteService;


    @PostMapping("/guardarPaciente")
    public Paciente guardaP(@RequestBody Paciente paciente)
    {
        return pacienteService.guardaP(paciente);

    }

    @GetMapping("/mostrarPaciente")

    public List<Paciente> mostrarPaciente()
    {
        return pacienteService.buscarP();

    }

    @GetMapping("/buscarPaciente/{id}")
    public Paciente buscaPaciente(@PathVariable Integer IDpaciente){
        return pacienteService.buscarporIdP(IDpaciente);

    }
}
