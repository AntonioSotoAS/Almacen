package com.almacen.controller;

import com.almacen.model.Comprobante;
import com.almacen.service.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comprobantes")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    @GetMapping
    public List<Comprobante> getAll() {
        return comprobanteService.findAll();
    }

    @GetMapping("/{id}")
    public Comprobante getById(@PathVariable Integer id) {
        return comprobanteService.findById(id);
    }

    @PostMapping
    public Comprobante create(@RequestBody Comprobante comprobante) {
        return comprobanteService.save(comprobante);
    }

    @PutMapping("/{id}")
    public Comprobante update(@PathVariable Integer id, @RequestBody Comprobante comprobante) {
        comprobante.setIdComprobante(id);
        return comprobanteService.save(comprobante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        comprobanteService.deleteById(id);
    }
}
