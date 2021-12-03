package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.DoctorDao;
import com.example.demo.model.Doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServicelmpl implements DoctorService {

    @Autowired
private DoctorDao doctorDao;



    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = false)
    public Doctor guarda(Doctor doctor) {
        return doctorDao.save(doctor);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = false)
    public void delete(Integer IDcedula) {
        doctorDao.deleteById(IDcedula);

    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public Doctor buscarporId(Integer IDcedula) {
        return doctorDao.findById(IDcedula).orElse(null);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<Doctor> buscar() {
        return (List <Doctor>) doctorDao.findAll();
    }
}
