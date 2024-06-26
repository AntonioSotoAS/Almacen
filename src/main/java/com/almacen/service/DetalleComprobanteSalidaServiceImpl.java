package com.almacen.service;

import com.almacen.model.DetalleComprobanteSalida;
import com.almacen.repository.DetalleComprobanteSalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleComprobanteSalidaServiceImpl implements DetalleComprobanteSalidaService {

    @Autowired
    private DetalleComprobanteSalidaRepository detalleComprobanteSalidaRepository;

    @Override
    public List<DetalleComprobanteSalida> findAll() {
        return detalleComprobanteSalidaRepository.findAll();
    }

    @Override
    public DetalleComprobanteSalida findById(Integer id) {
        return detalleComprobanteSalidaRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleComprobanteSalida save(DetalleComprobanteSalida detalleComprobanteSalida) {
        return detalleComprobanteSalidaRepository.save(detalleComprobanteSalida);
    }

    @Override
    public void deleteById(Integer id) {
        detalleComprobanteSalidaRepository.deleteById(id);
    }
}
