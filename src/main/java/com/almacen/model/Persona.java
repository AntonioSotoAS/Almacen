package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    private String nombre;

    private String tipoDocumento;

    private String docIdentidad;

    private String direccion;

    @Column(unique = true)
    private String telefono;

    @Column(unique = true)
    private String email;
}