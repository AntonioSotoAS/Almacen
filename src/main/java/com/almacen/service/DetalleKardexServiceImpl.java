package com.almacen.service;

import com.almacen.model.DetalleKardex;
import com.almacen.repository.DetalleKardexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleKardexServiceImpl implements DetalleKardexService {

    @Autowired
    private DetalleKardexRepository detalleKardexRepository;

    @Override
    public List<DetalleKardex> findAll() {
        return detalleKardexRepository.findAll();
    }

    @Override
    public DetalleKardex findById(Integer id) {
        return detalleKardexRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleKardex save(DetalleKardex detalleKardex) {
        return detalleKardexRepository.save(detalleKardex);
    }

    @Override
    public void deleteById(Integer id) {
        detalleKardexRepository.deleteById(id);
    }
}
