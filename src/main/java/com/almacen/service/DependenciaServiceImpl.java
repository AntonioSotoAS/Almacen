package com.almacen.service;

import com.almacen.model.Dependencia;
import com.almacen.repository.DependenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DependenciaServiceImpl implements DependenciaService {

    @Autowired
    private DependenciaRepository dependenciaRepository;

    @Override
    public List<Dependencia> findAll() {
        return dependenciaRepository.findAll();
    }

    @Override
    public Dependencia findById(Integer id) {
        return dependenciaRepository.findById(id).orElse(null);
    }

    @Override
    public Dependencia save(Dependencia dependencia) {
        return dependenciaRepository.save(dependencia);
    }

    @Override
    public void deleteById(Integer id) {
        dependenciaRepository.deleteById(id);
    }
}
