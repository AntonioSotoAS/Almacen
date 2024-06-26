package com.almacen.service;

import com.almacen.model.Unidad;
import com.almacen.repository.UnidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadServiceImpl implements UnidadService {

    @Autowired
    private UnidadRepository unidadRepository;

    @Override
    public List<Unidad> findAll() {
        return unidadRepository.findAll();
    }

    @Override
    public Unidad findById(Integer id) {
        return unidadRepository.findById(id).orElse(null);
    }

    @Override
    public Unidad save(Unidad unidad) {
        return unidadRepository.save(unidad);
    }

    @Override
    public void deleteById(Integer id) {
        unidadRepository.deleteById(id);
    }
}
