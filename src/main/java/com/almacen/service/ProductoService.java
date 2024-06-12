package com.almacen.service;

import com.almacen.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> findAll();
    Producto findById(Integer id);
    Producto save(Producto producto);
    void deleteById(Integer id);
}