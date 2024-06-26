package com.almacen.service;

import com.almacen.model.ComprobanteSalida;

import java.util.List;

public interface ComprobanteSalidaService {
    List<ComprobanteSalida> findAll();
    ComprobanteSalida findById(Integer id);
    ComprobanteSalida save(ComprobanteSalida comprobanteSalida);
    void deleteById(Integer id);
}
