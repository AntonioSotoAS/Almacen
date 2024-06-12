package com.almacen.service;

import com.almacen.model.Comprobante;

import java.util.List;

public interface ComprobanteService {
    List<Comprobante> findAll();
    Comprobante findById(Integer id);
    Comprobante save(Comprobante comprobante);
    void deleteById(Integer id);
}