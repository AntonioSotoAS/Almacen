package com.almacen.service;

import com.almacen.model.NotaIngreso;

import java.util.List;

public interface NotaIngresoService {
    List<NotaIngreso> findAll();
    NotaIngreso findById(Integer id);
    NotaIngreso save(NotaIngreso notaIngreso);
    void deleteById(Integer id);
}