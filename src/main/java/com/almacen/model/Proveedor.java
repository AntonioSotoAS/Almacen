package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProveedor;

    @OneToOne
    @JoinColumn(name = "id_persona", unique = true, nullable = false)
    private Persona persona;
}