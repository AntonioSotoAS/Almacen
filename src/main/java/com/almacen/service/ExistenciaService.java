package com.almacen.service;

import com.almacen.model.Existencia;

import java.util.List;

public interface ExistenciaService {
    List<Existencia> findAll();
    Existencia findById(Integer id);
    Existencia save(Existencia existencia);
    void deleteById(Integer id);
}