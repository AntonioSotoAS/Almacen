package com.almacen.service;

import com.almacen.model.Marca;
import com.almacen.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    @Override
    public Marca findById(Integer id) {
        return marcaRepository.findById(id).orElse(null);
    }

    @Override
    public Marca save(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public void deleteById(Integer id) {
        marcaRepository.deleteById(id);
    }
}
