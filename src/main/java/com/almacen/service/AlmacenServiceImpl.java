package com.almacen.service;

import com.almacen.model.Almacen;
import com.almacen.repository.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenServiceImpl implements AlmacenService {

    @Autowired
    private AlmacenRepository almacenRepository;

    @Override
    public List<Almacen> findAll() {
        return almacenRepository.findAll();
    }

    @Override
    public Almacen findById(Integer id) {
        return almacenRepository.findById(id).orElse(null);
    }

    @Override
    public Almacen save(Almacen almacen) {
        return almacenRepository.save(almacen);
    }

    @Override
    public void deleteById(Integer id) {
        almacenRepository.deleteById(id);
    }
}