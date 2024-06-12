package com.almacen.service;

import com.almacen.model.Almacen;

import java.util.List;

public interface AlmacenService {
    List<Almacen> findAll();
    Almacen findById(Integer id);
    Almacen save(Almacen almacen);
    void deleteById(Integer id);
}