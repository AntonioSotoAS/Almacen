package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class NotaIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotaIng;

    @Column(nullable = false, length = 25)
    private String dctoRefe;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoMov tipoMov;

    @Column(nullable = false, length = 55)
    private String ocompra;

    @Column(nullable = false, length = 20)
    private String nguia;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor proveedor;

    public enum TipoMov {
        IMPORTACION, REGULARIZACION
    }
}
