package com.example.demo.service;

import com.example.demo.model.Cita;
import java.util.List;

public interface CitaService {
    Cita guarda(Cita usuarios);

    void delete(Integer IdCita);

    Cita buscarporId(Integer IdCita);

    List<Cita> buscar();
}