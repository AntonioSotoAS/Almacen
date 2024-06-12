package com.almacen.repository;

import com.almacen.model.NotaIngreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaIngresoRepository extends JpaRepository<NotaIngreso, Integer> {
}