package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UnidadMedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUnimed;

    @Column(nullable = false, length = 20)
    private String nombreCategoria;
}
