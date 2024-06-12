package com.almacen.service;

import com.almacen.model.Proveedor;

import java.util.List;

public interface ProveedorService {
    List<Proveedor> findAll();
    Proveedor findById(Integer id);
    Proveedor save(Proveedor proveedor);
    void deleteById(Integer id);
}