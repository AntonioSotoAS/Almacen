package com.almacen.service;

import com.almacen.model.UnidadMedida;

import java.util.List;

public interface UnidadMedidaService {
    List<UnidadMedida> findAll();
    UnidadMedida findById(Integer id);
    UnidadMedida save(UnidadMedida unidadMedida);
    void deleteById(Integer id);
}
