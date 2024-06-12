package com.almacen.controller;

import com.almacen.model.DetalleComprobante;
import com.almacen.service.DetalleComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallecomprobantes")
public class DetalleComprobanteController {

    @Autowired
    private DetalleComprobanteService detalleComprobanteService;

    @GetMapping
    public List<DetalleComprobante> getAll() {
        return detalleComprobanteService.findAll();
    }

    @GetMapping("/{id}")
    public DetalleComprobante getById(@PathVariable Integer id) {
        return detalleComprobanteService.findById(id);
    }

    @PostMapping
    public DetalleComprobante create(@RequestBody DetalleComprobante detalleComprobante) {
        return detalleComprobanteService.save(detalleComprobante);
    }

    @PutMapping("/{id}")
    public DetalleComprobante update(@PathVariable Integer id, @RequestBody DetalleComprobante detalleComprobante) {
        detalleComprobante.setIdDetail(id);
        return detalleComprobanteService.save(detalleComprobante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        detalleComprobanteService.deleteById(id);
    }
}