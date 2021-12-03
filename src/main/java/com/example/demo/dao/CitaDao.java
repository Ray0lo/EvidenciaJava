package com.example.demo.dao;

import com.example.demo.model.Cita;
import org.springframework.data.repository.CrudRepository;

public interface CitaDao extends CrudRepository<Cita, Integer> {
}