package com.almacen.service;

import com.almacen.model.Dependencia;

import java.util.List;

public interface DependenciaService {
    List<Dependencia> findAll();
    Dependencia findById(Integer id);
    Dependencia save(Dependencia dependencia);
    void deleteById(Integer id);
}
