package com.almacen.controller;

import com.almacen.model.DetalleNotaSalida;
import com.almacen.service.DetalleNotaSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallenotassalida")
public class DetalleNotaSalidaController {

    @Autowired
    private DetalleNotaSalidaService detalleNotaSalidaService;

    @GetMapping
    public List<DetalleNotaSalida> getAll() {
        return detalleNotaSalidaService.findAll();
    }

    @GetMapping("/{id}")
    public DetalleNotaSalida getById(@PathVariable Integer id) {
        return detalleNotaSalidaService.findById(id);
    }

    @PostMapping
    public DetalleNotaSalida create(@RequestBody DetalleNotaSalida detalleNotaSalida) {
        return detalleNotaSalidaService.save(detalleNotaSalida);
    }

    @PutMapping("/{id}")
    public DetalleNotaSalida update(@PathVariable Integer id, @RequestBody DetalleNotaSalida detalleNotaSalida) {
        detalleNotaSalida.setIdDetailNotSal(id);
        return detalleNotaSalidaService.save(detalleNotaSalida);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        detalleNotaSalidaService.deleteById(id);
    }
}