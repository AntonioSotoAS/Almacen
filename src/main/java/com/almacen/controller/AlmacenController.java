package com.almacen.controller;

import com.almacen.model.Almacen;
import com.almacen.service.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/almacenes")
public class AlmacenController {

    @Autowired
    private AlmacenService almacenService;

    @GetMapping
    public List<Almacen> getAll() {
        return almacenService.findAll();
    }

    @GetMapping("/{id}")
    public Almacen getById(@PathVariable Integer id) {
        return almacenService.findById(id);
    }

    @PostMapping
    public Almacen create(@RequestBody Almacen almacen) {
        return almacenService.save(almacen);
    }

    @PutMapping("/{id}")
    public Almacen update(@PathVariable Integer id, @RequestBody Almacen almacen) {
        almacen.setIdAlmacen(id);
        return almacenService.save(almacen);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        almacenService.deleteById(id);
    }
}
