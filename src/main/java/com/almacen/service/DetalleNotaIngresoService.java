package com.almacen.service;

import com.almacen.model.DetalleNotaIngreso;

import java.util.List;

public interface DetalleNotaIngresoService {
    List<DetalleNotaIngreso> findAll();
    DetalleNotaIngreso findById(Integer id);
    DetalleNotaIngreso save(DetalleNotaIngreso detalleNotaIngreso);
    void deleteById(Integer id);
}