package com.almacen.service;

import com.almacen.model.NotaSalida;

import java.util.List;

public interface NotaSalidaService {
    List<NotaSalida> findAll();
    NotaSalida findById(Integer id);
    NotaSalida save(NotaSalida notaSalida);
    void deleteById(Integer id);
}