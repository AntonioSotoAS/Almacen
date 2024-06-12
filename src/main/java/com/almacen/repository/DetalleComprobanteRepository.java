package com.almacen.repository;

import com.almacen.model.DetalleComprobante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleComprobanteRepository extends JpaRepository<DetalleComprobante, Integer> {
}