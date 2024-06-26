package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Unidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUnidad;

    @Column(nullable = false, length = 120)
    private String jefeUnidad;

    @Column(nullable = false, length = 50)
    private String nombreUnidad;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_dependencia", nullable = false)
    private Dependencia dependencia;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor proveedor;
}
