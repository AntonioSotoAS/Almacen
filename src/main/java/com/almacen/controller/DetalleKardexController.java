package com.almacen.controller;

import com.almacen.model.DetalleKardex;
import com.almacen.service.DetalleKardexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallekardex")
public class DetalleKardexController {

    @Autowired
    private DetalleKardexService detalleKardexService;

    @GetMapping
    public List<DetalleKardex> getAll() {
        return detalleKardexService.findAll();
    }

    @GetMapping("/{id}")
    public DetalleKardex getById(@PathVariable Integer id) {
        return detalleKardexService.findById(id);
    }

    @PostMapping
    public DetalleKardex create(@RequestBody DetalleKardex detalleKardex) {
        return detalleKardexService.save(detalleKardex);
    }

    @PutMapping("/{id}")
    public DetalleKardex update(@PathVariable Integer id, @RequestBody DetalleKardex detalleKardex) {
        detalleKardex.setIdDetailKardex(id);
        return detalleKardexService.save(detalleKardex);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        detalleKardexService.deleteById(id);
    }
}
