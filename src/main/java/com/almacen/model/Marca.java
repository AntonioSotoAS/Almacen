package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMarca;

    @Column(nullable = false, length = 20)
    private String nombreMarca;
}
