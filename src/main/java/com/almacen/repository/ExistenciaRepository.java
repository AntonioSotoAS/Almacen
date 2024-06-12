package com.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almacen.model.Existencia;

public interface ExistenciaRepository extends JpaRepository<Existencia, Integer> {
}