package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetalleNotaIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailNotIng;

    @ManyToOne
    @JoinColumn(name = "id_notaIngreso", nullable = false)
    private NotaIngreso notaIngreso;

    @ManyToOne
    @JoinColumn(name = "id_Producto", nullable = false)
    private Producto producto;

    private Integer cantidad;
}
