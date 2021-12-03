package com.example.demo.controller;

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;
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
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    public DoctorController() {
    }

    @PostMapping({"/guardarDoctor"})
    public Doctor guarda(@RequestBody Doctor doctor) {
        return this.doctorService.guarda(doctor);
    }

    @GetMapping({"/mostrarDoctor"})
    public List<Doctor> mostrarUsuarios() {
        return this.doctorService.buscar();
    }

    @GetMapping({"/buscarDoctor/{id}"})
    public Doctor buscaUsuarios(@PathVariable Integer IDcedula) {
        return this.doctorService.buscarporId(IDcedula);
    }
}
