package com.almacen.service;

import com.almacen.model.Unidad;

import java.util.List;

public interface UnidadService {
    List<Unidad> findAll();
    Unidad findById(Integer id);
    Unidad save(Unidad unidad);
    void deleteById(Integer id);
}
