package com.almacen.repository;

import com.almacen.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {
}
