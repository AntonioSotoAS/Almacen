package com.almacen.service;

import com.almacen.model.Documento;
import com.almacen.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoServiceImpl implements DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    @Override
    public List<Documento> findAll() {
        return documentoRepository.findAll();
    }

    @Override
    public Documento findById(Integer id) {
        return documentoRepository.findById(id).orElse(null);
    }

    @Override
    public Documento save(Documento documento) {
        return documentoRepository.save(documento);
    }

    @Override
    public void deleteById(Integer id) {
        documentoRepository.deleteById(id);
    }
}