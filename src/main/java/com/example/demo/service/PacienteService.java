package com.example.demo.service;

import com.example.demo.model.Paciente;

import java.util.List;

public interface PacienteService {
    public Paciente guardaP(Paciente pacientes);
    public void delete(Integer IDpaciente);
    public Paciente buscarporIdP(Integer IDpaciente);
    public List<Paciente> buscarP();
}
