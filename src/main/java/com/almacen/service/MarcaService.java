package com.almacen.service;

import com.almacen.model.Marca;

import java.util.List;

public interface MarcaService {
    List<Marca> findAll();
    Marca findById(Integer id);
    Marca save(Marca marca);
    void deleteById(Integer id);
}
