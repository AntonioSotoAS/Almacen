package com.almacen.service;

import com.almacen.model.UnidadMedida;
import com.almacen.repository.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadMedidaServiceImpl implements UnidadMedidaService {

    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    @Override
    public List<UnidadMedida> findAll() {
        return unidadMedidaRepository.findAll();
    }

    @Override
    public UnidadMedida findById(Integer id) {
        return unidadMedidaRepository.findById(id).orElse(null);
    }

    @Override
    public UnidadMedida save(UnidadMedida unidadMedida) {
        return unidadMedidaRepository.save(unidadMedida);
    }

    @Override
    public void deleteById(Integer id) {
        unidadMedidaRepository.deleteById(id);
    }
}
