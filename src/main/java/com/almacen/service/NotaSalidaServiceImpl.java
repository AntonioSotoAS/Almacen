package com.almacen.service;

import com.almacen.model.NotaSalida;
import com.almacen.repository.NotaSalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaSalidaServiceImpl implements NotaSalidaService {

    @Autowired
    private NotaSalidaRepository notaSalidaRepository;

    @Override
    public List<NotaSalida> findAll() {
        return notaSalidaRepository.findAll();
    }

    @Override
    public NotaSalida findById(Integer id) {
        return notaSalidaRepository.findById(id).orElse(null);
    }

    @Override
    public NotaSalida save(NotaSalida notaSalida) {
        return notaSalidaRepository.save(notaSalida);
    }

    @Override
    public void deleteById(Integer id) {
        notaSalidaRepository.deleteById(id);
    }
}