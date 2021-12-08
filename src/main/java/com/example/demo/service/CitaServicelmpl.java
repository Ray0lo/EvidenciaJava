package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.CitaDao;
import com.example.demo.model.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CitaServicelmpl implements CitaService{

    @Autowired
    private CitaDao citaDao;



    @Override
    @Transactional(readOnly = false)
    public Cita guarda(Cita cita) {
        return citaDao.save(cita);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        citaDao.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public Cita buscarporId(Integer id) {
        return citaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cita> buscar() {
        return (List <Cita>) citaDao.findAll();
    }

}
