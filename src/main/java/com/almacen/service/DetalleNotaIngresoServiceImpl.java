package com.almacen.service;

import com.almacen.model.DetalleNotaIngreso;
import com.almacen.repository.DetalleNotaIngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleNotaIngresoServiceImpl implements DetalleNotaIngresoService {

    @Autowired
    private DetalleNotaIngresoRepository detalleNotaIngresoRepository;

    @Override
    public List<DetalleNotaIngreso> findAll() {
        return detalleNotaIngresoRepository.findAll();
    }

    @Override
    public DetalleNotaIngreso findById(Integer id) {
        return detalleNotaIngresoRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleNotaIngreso save(DetalleNotaIngreso detalleNotaIngreso) {
        return detalleNotaIngresoRepository.save(detalleNotaIngreso);
    }

    @Override
    public void deleteById(Integer id) {
        detalleNotaIngresoRepository.deleteById(id);
    }
}