package com.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almacen.model.Comprobante;

public interface ComprobanteRepository extends JpaRepository<Comprobante, Integer> {
}