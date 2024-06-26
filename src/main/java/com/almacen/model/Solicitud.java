package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSolicitud;

    @ManyToOne
    @JoinColumn(name = "id_dependencia", nullable = false)
    private Dependencia dependencia;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false, precision = 12, scale = 3)
    private BigDecimal importe;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado estado;

    public enum Estado {
        PENDIENTE, APROBADA, RECHAZADA
    }
}
