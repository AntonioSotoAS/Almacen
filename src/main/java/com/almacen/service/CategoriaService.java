package com.almacen.service;

import com.almacen.model.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> findAll();
    Categoria findById(Integer id);
    Categoria save(Categoria categoria);
    void deleteById(Integer id);
}
