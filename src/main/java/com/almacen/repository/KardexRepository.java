package com.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almacen.model.Kardex;

public interface KardexRepository extends JpaRepository<Kardex, Integer> {
}
