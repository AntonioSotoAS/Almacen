package com.almacen.service;

import com.almacen.model.Movimientos;
import com.almacen.repository.MovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientosServiceImpl implements MovimientosService {

    @Autowired
    private MovimientosRepository movimientosRepository;

    @Override
    public List<Movimientos> findAll() {
        return movimientosRepository.findAll();
    }

    @Override
    public Movimientos findById(Integer id) {
        return movimientosRepository.findById(id).orElse(null);
    }

    @Override
    public Movimientos save(Movimientos movimientos) {
        return movimientosRepository.save(movimientos);
    }

    @Override
    public void deleteById(Integer id) {
        movimientosRepository.deleteById(id);
    }
}
