package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Dependencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDependencia;

    @Column(nullable = false, length = 120)
    private String jefeDependencia;

    @Column(nullable = false, length = 50)
    private String nombreDependencia;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado estado;

    public enum Estado {
        HABILITADO, DESHABILITADO
    }
}
