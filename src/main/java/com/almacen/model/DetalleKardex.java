package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetalleKardex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailKardex;

    @ManyToOne
    @JoinColumn(name = "id_existencia", nullable = false)
    private Existencia existencia;

    @ManyToOne
    @JoinColumn(name = "id_kardex", nullable = false)
    private Kardex kardex;

    private Integer cantidadIngreso;

    private Integer cantidadSalida;

    private Integer saldo;
}