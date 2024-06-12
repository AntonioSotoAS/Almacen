package com.almacen.service;

import com.almacen.model.DetalleComprobante;
import com.almacen.repository.DetalleComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleComprobanteServiceImpl implements DetalleComprobanteService {

    @Autowired
    private DetalleComprobanteRepository detalleComprobanteRepository;

    @Override
    public List<DetalleComprobante> findAll() {
        return detalleComprobanteRepository.findAll();
    }

    @Override
    public DetalleComprobante findById(Integer id) {
        return detalleComprobanteRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleComprobante save(DetalleComprobante detalleComprobante) {
        return detalleComprobanteRepository.save(detalleComprobante);
    }

    @Override
    public void deleteById(Integer id) {
        detalleComprobanteRepository.deleteById(id);
    }
}