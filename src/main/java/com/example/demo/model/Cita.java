package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "Cita"
)
public class Cita {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer IdCita;
    private Integer IdPaciente;
    private Integer Consultorio;
    private Integer IdDoctor;
    private String Motivo;
    private String HoraCita;
    private Integer FechaCita;

    public Cita() {
    }

    public Cita(Integer IdCita, Integer IdPaciente, Integer Consultorio, Integer IdDoctor, String Motivo, String HoraCita, Integer FechaCita) {
        this.IdCita = IdCita;
        this.IdPaciente = IdPaciente;
        this.Consultorio = Consultorio;
        this.IdDoctor = IdDoctor;
        this.Motivo = Motivo;
        this.HoraCita = HoraCita;
        this.FechaCita = FechaCita;
    }

    public Integer getIdCita() {
        return this.IdCita;
    }

    public void setIdCita(Integer IdCita) {
        this.IdCita = IdCita;
    }

    public Integer getIdPaciente() {
        return this.IdPaciente;
    }

    public void setIdPaciente(Integer IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public Integer getConsultorio() {
        return this.Consultorio;
    }

    public void setConsultorio(Integer Consultorio) {
        this.Consultorio = Consultorio;
    }

    public Integer getIdDoctor() {
        return this.IdDoctor;
    }

    public void setIdDoctor(Integer IdDoctor) {
        this.IdDoctor = IdDoctor;
    }

    public String getMotivo() {
        return this.Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getHoraCita() {
        return this.HoraCita;
    }

    public void setHoraCita(String HoraCita) {
        this.HoraCita = HoraCita;
    }

    public Integer getFechaCita() {
        return this.FechaCita;
    }

    public void setFechaCita(Integer FechaCita) {
        this.FechaCita = FechaCita;
    }
}
