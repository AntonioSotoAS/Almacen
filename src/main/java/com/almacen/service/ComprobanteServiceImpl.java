package com.almacen.service;

import com.almacen.model.Comprobante;
import com.almacen.repository.ComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteServiceImpl implements ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    @Override
    public List<Comprobante> findAll() {
        return comprobanteRepository.findAll();
    }

    @Override
    public Comprobante findById(Integer id) {
        return comprobanteRepository.findById(id).orElse(null);
    }

    @Override
    public Comprobante save(Comprobante comprobante) {
        return comprobanteRepository.save(comprobante);
    }

    @Override
    public void deleteById(Integer id) {
        comprobanteRepository.deleteById(id);
    }
}