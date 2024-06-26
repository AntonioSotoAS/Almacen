package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(length = 18, nullable = false)
    private String username;

    @Column(length = 15, nullable = false)
    private String clave;

    @Column(length = 12, nullable = false)
    private String rol;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado estado;

    public enum Estado {
        HABILITADO, DESHABILITADO
    }
}
