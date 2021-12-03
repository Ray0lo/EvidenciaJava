package com.example.demo.controller;

import com.example.demo.model.Cita;
import com.example.demo.service.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping({"/api"})
public class CitaController {
    @Autowired
    private CitaService citaService;

    public CitaController() {
    }

    @PostMapping({"/guardarCita"})
    public Cita guarda(@RequestBody Cita cita) {
        return this.citaService.guarda(cita);
    }

    @GetMapping({"/mostrarCita"})
    public List<Cita> mostrarUsuarios() {
        return this.citaService.buscar();
    }

    @GetMapping({"/buscarCita/{id}"})
    public Cita buscaUsuarios(@PathVariable Integer IdCita) {
        return this.citaService.buscarporId(IdCita);
    }
}