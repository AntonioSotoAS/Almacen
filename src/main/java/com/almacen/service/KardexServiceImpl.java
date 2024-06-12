package com.almacen.service;

import com.almacen.model.Kardex;
import com.almacen.repository.KardexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KardexServiceImpl implements KardexService {

    @Autowired
    private KardexRepository kardexRepository;

    @Override
    public List<Kardex> findAll() {
        return kardexRepository.findAll();
    }

    @Override
    public Kardex findById(Integer id) {
        return kardexRepository.findById(id).orElse(null);
    }

    @Override
    public Kardex save(Kardex kardex) {
        return kardexRepository.save(kardex);
    }

    @Override
    public void deleteById(Integer id) {
        kardexRepository.deleteById(id);
    }
}