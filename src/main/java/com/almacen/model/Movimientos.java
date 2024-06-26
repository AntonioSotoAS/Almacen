package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Movimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMovimiento;

    @ManyToOne
    @JoinColumn(name = "id_detalle_comp_salida", nullable = false)
    private DetalleComprobanteSalida detalleCompSalida;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Tipo tipo;

    @Column(nullable = false)
    private Integer stockActual;

    public enum Tipo {
        ENTRADA, SALIDA
    }
}
