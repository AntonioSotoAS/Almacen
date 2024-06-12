package com.almacen.service;

import com.almacen.model.DetalleComprobante;

import java.util.List;

public interface DetalleComprobanteService {
    List<DetalleComprobante> findAll();
    DetalleComprobante findById(Integer id);
    DetalleComprobante save(DetalleComprobante detalleComprobante);
    void deleteById(Integer id);
}
