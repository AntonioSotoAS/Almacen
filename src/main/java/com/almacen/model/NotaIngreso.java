package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class NotaIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotaIngreso;

    @ManyToOne
    @JoinColumn(name = "id_documento", nullable = false)
    private Documento documento;

    private String dctoReferecica;

    private Date fechaIni;

    private Date fechaTipoMov;

    private String tipoMov;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor proveedor;
}