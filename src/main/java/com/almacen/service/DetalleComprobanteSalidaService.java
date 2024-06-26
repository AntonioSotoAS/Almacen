package com.almacen.service;

import com.almacen.model.DetalleComprobanteSalida;

import java.util.List;

public interface DetalleComprobanteSalidaService {
    List<DetalleComprobanteSalida> findAll();
    DetalleComprobanteSalida findById(Integer id);
    DetalleComprobanteSalida save(DetalleComprobanteSalida detalleComprobanteSalida);
    void deleteById(Integer id);
}
