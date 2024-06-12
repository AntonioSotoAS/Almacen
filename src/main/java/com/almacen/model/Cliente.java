package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @OneToOne
    @JoinColumn(name = "id_persona", unique = true, nullable = false)
    private Persona persona;

    private Date fechaNac;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public enum Sexo {
        M, F
    }
}