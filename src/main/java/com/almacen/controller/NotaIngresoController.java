package com.almacen.controller;

import com.almacen.model.NotaIngreso;
import com.almacen.service.NotaIngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notasingreso")
public class NotaIngresoController {

    @Autowired
    private NotaIngresoService notaIngresoService;

    @GetMapping
    public List<NotaIngreso> getAll() {
        return notaIngresoService.findAll();
    }

    @GetMapping("/{id}")
    public NotaIngreso getById(@PathVariable Integer id) {
        return notaIngresoService.findById(id);
    }

    @PostMapping
    public NotaIngreso create(@RequestBody NotaIngreso notaIngreso) {
        return notaIngresoService.save(notaIngreso);
    }

    @PutMapping("/{id}")
    public NotaIngreso update(@PathVariable Integer id, @RequestBody NotaIngreso notaIngreso) {
        notaIngreso.setIdNotaIngreso(id);
        return notaIngresoService.save(notaIngreso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        notaIngresoService.deleteById(id);
    }
}