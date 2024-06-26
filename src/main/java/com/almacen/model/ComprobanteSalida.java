package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class ComprobanteSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComprobanteSalida;

    @Column(nullable = false, length = 20)
    private String nombreCategoria;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado estado;

    public enum Estado {
        APROBADO, ANULADO
    }
}
