package com.almacen.service;

import com.almacen.model.DetalleNotaSalida;
import com.almacen.repository.DetalleNotaSalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleNotaSalidaServiceImpl implements DetalleNotaSalidaService {

    @Autowired
    private DetalleNotaSalidaRepository detalleNotaSalidaRepository;

    @Override
    public List<DetalleNotaSalida> findAll() {
        return detalleNotaSalidaRepository.findAll();
    }

    @Override
    public DetalleNotaSalida findById(Integer id) {
        return detalleNotaSalidaRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleNotaSalida save(DetalleNotaSalida detalleNotaSalida) {
        return detalleNotaSalidaRepository.save(detalleNotaSalida);
    }

    @Override
    public void deleteById(Integer id) {
        detalleNotaSalidaRepository.deleteById(id);
    }
}