package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Paciente;
import com.example.demo.dao.PacienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PacienteServicelmpl implements PacienteService{
    @Autowired
    private PacienteDao pacienteDao;

    @Override
    @Transactional(readOnly = false)
    public Paciente guardaP(Paciente paciente) {
        return pacienteDao.save(paciente);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer IDpaciente) {
        pacienteDao.deleteById(IDpaciente);

    }

    @Override
    @Transactional(readOnly = true)
    public Paciente buscarporIdP(Integer IDpaciente) {
        return pacienteDao.findById(IDpaciente).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> buscarP() {
        return (List <Paciente>) pacienteDao.findAll();
    }
}
