package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    private String nombre;

    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    private String unidMedida;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    public enum Estado {
        Activo, Desactivo
    }
}