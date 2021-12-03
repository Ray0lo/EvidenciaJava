package com.example.demo.service;

import com.example.demo.model.Doctor;
import java.util.List;

public interface DoctorService {
    Doctor guarda(Doctor usuarios);

    void delete(Integer IDcedula);

    Doctor buscarporId(Integer IDcedula);

    List<Doctor> buscar();
}
