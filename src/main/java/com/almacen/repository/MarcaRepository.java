package com.almacen.repository;

import com.almacen.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
