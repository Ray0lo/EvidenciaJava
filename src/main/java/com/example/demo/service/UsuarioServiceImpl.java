package com.example.demo.service;

import java.util.List;
import com.example.demo.dao.UsuarioDao;
import com.example.demo.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service

public class UsuarioServiceImpl implements UsuarioService{

@Autowired
private UsuarioDao usuarioDao;



    @Override
    @Transactional(readOnly = false)
    public Usuarios guarda(Usuarios usuarios) {
        return usuarioDao.save(usuarios);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        usuarioDao.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public Usuarios buscarporId(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuarios> buscar() {
        return (List <Usuarios>) usuarioDao.findAll();
    }

}
