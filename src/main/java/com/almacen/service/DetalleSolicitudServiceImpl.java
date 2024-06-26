package com.almacen.service;

import com.almacen.model.DetalleSolicitud;
import com.almacen.repository.DetalleSolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleSolicitudServiceImpl implements DetalleSolicitudService {

    @Autowired
    private DetalleSolicitudRepository detalleSolicitudRepository;

    @Override
    public List<DetalleSolicitud> findAll() {
        return detalleSolicitudRepository.findAll();
    }

    @Override
    public DetalleSolicitud findById(Integer id) {
        return detalleSolicitudRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleSolicitud save(DetalleSolicitud detalleSolicitud) {
        return detalleSolicitudRepository.save(detalleSolicitud);
    }

    @Override
    public void deleteById(Integer id) {
        detalleSolicitudRepository.deleteById(id);
    }
}
