package com.example.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "Paciente")
public class Paciente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer IDUsuario;

        private String Nombre;

        private String Apellido;

        private String pwd;

        private String token;

        private Integer Telefono;

        private String Motivo;

        private Integer edad;


        public Paciente() {
        }

    public Paciente(Integer IDUsuario, String nombre, String apellido, String pwd, String token, Integer telefono, String motivo, Integer edad) {
        this.IDUsuario = IDUsuario;
        Nombre = nombre;
        Apellido = apellido;
        this.pwd = pwd;
        this.token = token;
        Telefono = telefono;
        Motivo = motivo;
        this.edad = edad;
    }

    public Integer getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(Integer IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

