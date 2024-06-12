package com.almacen.controller;

import com.almacen.model.Documento;
import com.almacen.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documentos")
public class DocumentoController {

    @Autowired
    private DocumentoService documentoService;

    @GetMapping
    public List<Documento> getAll() {
        return documentoService.findAll();
    }

    @GetMapping("/{id}")
    public Documento getById(@PathVariable Integer id) {
        return documentoService.findById(id);
    }

    @PostMapping
    public Documento create(@RequestBody Documento documento) {
        return documentoService.save(documento);
    }

    @PutMapping("/{id}")
    public Documento update(@PathVariable Integer id, @RequestBody Documento documento) {
        documento.setIdDocumento(id);
        return documentoService.save(documento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        documentoService.deleteById(id);
    }
}