package com.almacen.service;

import com.almacen.model.Solicitud;
import com.almacen.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public List<Solicitud> findAll() {
        return solicitudRepository.findAll();
    }

    @Override
    public Solicitud findById(Integer id) {
        return solicitudRepository.findById(id).orElse(null);
    }

    @Override
    public Solicitud save(Solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }

    @Override
    public void deleteById(Integer id) {
        solicitudRepository.deleteById(id);
    }
}
