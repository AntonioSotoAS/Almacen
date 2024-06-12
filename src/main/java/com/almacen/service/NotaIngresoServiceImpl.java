package com.almacen.service;

import com.almacen.model.NotaIngreso;
import com.almacen.repository.NotaIngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaIngresoServiceImpl implements NotaIngresoService {

    @Autowired
    private NotaIngresoRepository notaIngresoRepository;

    @Override
    public List<NotaIngreso> findAll() {
        return notaIngresoRepository.findAll();
    }

    @Override
    public NotaIngreso findById(Integer id) {
        return notaIngresoRepository.findById(id).orElse(null);
    }

    @Override
    public NotaIngreso save(NotaIngreso notaIngreso) {
        return notaIngresoRepository.save(notaIngreso);
    }

    @Override
    public void deleteById(Integer id) {
        notaIngresoRepository.deleteById(id);
    }
}