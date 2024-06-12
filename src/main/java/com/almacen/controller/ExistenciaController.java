package com.almacen.controller;

import com.almacen.model.Existencia;
import com.almacen.service.ExistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/existencias")
public class ExistenciaController {

    @Autowired
    private ExistenciaService existenciaService;

    @GetMapping
    public List<Existencia> getAll() {
        return existenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Existencia getById(@PathVariable Integer id) {
        return existenciaService.findById(id);
    }

    @PostMapping
    public Existencia create(@RequestBody Existencia existencia) {
        return existenciaService.save(existencia);
    }

    @PutMapping("/{id}")
    public Existencia update(@PathVariable Integer id, @RequestBody Existencia existencia) {
        existencia.setIdExistencia(id);
        return existenciaService.save(existencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        existenciaService.deleteById(id);
    }
}
