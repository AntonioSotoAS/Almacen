package com.almacen.service;

import com.almacen.model.DetalleKardex;

import java.util.List;

public interface DetalleKardexService {
    List<DetalleKardex> findAll();
    DetalleKardex findById(Integer id);
    DetalleKardex save(DetalleKardex detalleKardex);
    void deleteById(Integer id);
}