package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @OneToOne
    @JoinColumn(name = "id_persona", unique = true, nullable = false)
    private Persona persona;

    private String nameUser;

    private String pass;

    private String rol;

    private Date fechaNacimiento;

    private char sexo;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    public enum Estado {
        Activo, Desactivo
    }
}