package com.almacen.controller;

import com.almacen.model.DetalleNotaIngreso;
import com.almacen.service.DetalleNotaIngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallenotasingreso")
public class DetalleNotaIngresoController {

    @Autowired
    private DetalleNotaIngresoService detalleNotaIngresoService;

    @GetMapping
    public List<DetalleNotaIngreso> getAll() {
        return detalleNotaIngresoService.findAll();
    }

    @GetMapping("/{id}")
    public DetalleNotaIngreso getById(@PathVariable Integer id) {
        return detalleNotaIngresoService.findById(id);
    }

    @PostMapping
    public DetalleNotaIngreso create(@RequestBody DetalleNotaIngreso detalleNotaIngreso) {
        return detalleNotaIngresoService.save(detalleNotaIngreso);
    }

    @PutMapping("/{id}")
    public DetalleNotaIngreso update(@PathVariable Integer id, @RequestBody DetalleNotaIngreso detalleNotaIngreso) {
        detalleNotaIngreso.setIdDetailNotIng(id);
        return detalleNotaIngresoService.save(detalleNotaIngreso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        detalleNotaIngresoService.deleteById(id);
    }
}