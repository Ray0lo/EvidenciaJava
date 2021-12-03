package com.example.demo.dao;

import com.example.demo.model.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface PacienteDao extends CrudRepository<Paciente,Integer> {
}
