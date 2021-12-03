package com.example.demo.dao;

import com.example.demo.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorDao extends CrudRepository<Doctor, Integer> {
}

