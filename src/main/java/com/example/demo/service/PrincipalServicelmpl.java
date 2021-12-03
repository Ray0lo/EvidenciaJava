package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Principal;
import com.example.demo.dao.PrincipalDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrincipalServicelmpl implements PirncipalService{
    
    @Autowired
private PrincipalDao PrincipalDao;



    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = false)
    public Principal guarda(Principal principal) {
        return PrincipalDao.save(principal);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = false)
    public void delete(Integer id) {
        PrincipalDao.deleteById(id);


    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public Principal buscarporId(Integer id) {
        return PrincipalDao.findById(id).orElse(null);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<Principal> buscar() {
        return (List <Principal>) PrincipalDao.findAll();
}
}
