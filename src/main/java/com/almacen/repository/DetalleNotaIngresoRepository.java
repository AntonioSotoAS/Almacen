package com.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almacen.model.DetalleNotaIngreso;

public interface DetalleNotaIngresoRepository extends JpaRepository<DetalleNotaIngreso, Integer> {
}