package com.almacen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @ManyToOne
    @JoinColumn(name = "id_marca", nullable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_unimed", nullable = false)
    private UnidadMedida unidadMedida;

    @Column(nullable = false, length = 8)
    private String cod;

    @Column(nullable = false, length = 80)
    private String descripcion;

    @Column(precision = 8, scale = 3)
    private BigDecimal precio;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado estado;

    public enum Estado {
        HABILITADO, DESHABILITADO
    }
}
