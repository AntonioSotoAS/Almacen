package com.almacen.service;

import com.almacen.model.DetalleSolicitud;

import java.util.List;

public interface DetalleSolicitudService {
    List<DetalleSolicitud> findAll();
    DetalleSolicitud findById(Integer id);
    DetalleSolicitud save(DetalleSolicitud detalleSolicitud);
    void deleteById(Integer id);
}
