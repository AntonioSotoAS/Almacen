package com.almacen.service;

import com.almacen.model.Documento;

import java.util.List;

public interface DocumentoService {
    List<Documento> findAll();
    Documento findById(Integer id);
    Documento save(Documento documento);
    void deleteById(Integer id);
}