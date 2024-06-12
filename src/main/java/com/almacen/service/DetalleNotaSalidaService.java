package com.almacen.service;

import com.almacen.model.DetalleNotaSalida;

import java.util.List;

public interface DetalleNotaSalidaService {
    List<DetalleNotaSalida> findAll();
    DetalleNotaSalida findById(Integer id);
    DetalleNotaSalida save(DetalleNotaSalida detalleNotaSalida);
    void deleteById(Integer id);
}