package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetalleNotaSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailNotSal;

    @ManyToOne
    @JoinColumn(name = "id_notaSalida", nullable = false)
    private NotaSalida notaSalida;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    private Integer cantidad;
}