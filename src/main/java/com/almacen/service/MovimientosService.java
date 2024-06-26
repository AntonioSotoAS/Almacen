package com.almacen.service;

import com.almacen.model.Movimientos;

import java.util.List;

public interface MovimientosService {
    List<Movimientos> findAll();
    Movimientos findById(Integer id);
    Movimientos save(Movimientos movimientos);
    void deleteById(Integer id);
}
