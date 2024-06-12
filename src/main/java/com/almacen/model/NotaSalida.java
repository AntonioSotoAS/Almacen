package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class NotaSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotaSalida;

    @ManyToOne
    @JoinColumn(name = "id_documento", nullable = false)
    private Documento documento;

    private String tipoMov;

    private Date fechaSalida;

    private Date fechaTipoMov;
}