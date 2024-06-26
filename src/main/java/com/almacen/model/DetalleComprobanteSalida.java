package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetalleComprobanteSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleCompSalida;

    @ManyToOne
    @JoinColumn(name = "id_comprobante_salida", nullable = false)
    private ComprobanteSalida comprobanteSalida;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private Integer cantidad;
}
