package com.almacen.repository;

import com.almacen.model.Movimientos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientosRepository extends JpaRepository<Movimientos, Integer> {
}
