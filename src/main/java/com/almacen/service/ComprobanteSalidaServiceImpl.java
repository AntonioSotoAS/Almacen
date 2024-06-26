package com.almacen.service;

import com.almacen.model.ComprobanteSalida;
import com.almacen.repository.ComprobanteSalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteSalidaServiceImpl implements ComprobanteSalidaService {

    @Autowired
    private ComprobanteSalidaRepository comprobanteSalidaRepository;

    @Override
    public List<ComprobanteSalida> findAll() {
        return comprobanteSalidaRepository.findAll();
    }

    @Override
    public ComprobanteSalida findById(Integer id) {
        return comprobanteSalidaRepository.findById(id).orElse(null);
    }

    @Override
    public ComprobanteSalida save(ComprobanteSalida comprobanteSalida) {
        return comprobanteSalidaRepository.save(comprobanteSalida);
    }

    @Override
    public void deleteById(Integer id) {
        comprobanteSalidaRepository.deleteById(id);
    }
}
