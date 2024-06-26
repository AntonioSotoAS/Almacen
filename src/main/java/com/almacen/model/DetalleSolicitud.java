package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class DetalleSolicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_solicitud", nullable = false)
    private Solicitud solicitud;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false, precision = 10, scale = 3)
    private BigDecimal total;
}
