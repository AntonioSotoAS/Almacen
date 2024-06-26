package com.almacen.service;

import com.almacen.model.Solicitud;

import java.util.List;

public interface SolicitudService {
    List<Solicitud> findAll();
    Solicitud findById(Integer id);
    Solicitud save(Solicitud solicitud);
    void deleteById(Integer id);
}
