package com.almacen.service;

import com.almacen.model.Existencia;
import com.almacen.repository.ExistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExistenciaServiceImpl implements ExistenciaService {

    @Autowired
    private ExistenciaRepository existenciaRepository;

    @Override
    public List<Existencia> findAll() {
        return existenciaRepository.findAll();
    }

    @Override
    public Existencia findById(Integer id) {
        return existenciaRepository.findById(id).orElse(null);
    }

    @Override
    public Existencia save(Existencia existencia) {
        return existenciaRepository.save(existencia);
    }

    @Override
    public void deleteById(Integer id) {
        existenciaRepository.deleteById(id);
    }
}