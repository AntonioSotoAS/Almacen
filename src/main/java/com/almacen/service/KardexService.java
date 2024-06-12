package com.almacen.service;

import com.almacen.model.Kardex;

import java.util.List;

public interface KardexService {
    List<Kardex> findAll();
    Kardex findById(Integer id);
    Kardex save(Kardex kardex);
    void deleteById(Integer id);
}