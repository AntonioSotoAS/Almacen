package com.almacen.controller;

import com.almacen.model.Kardex;
import com.almacen.service.KardexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kardex")
public class KardexController {

    @Autowired
    private KardexService kardexService;

    @GetMapping
    public List<Kardex> getAll() {
        return kardexService.findAll();
    }

    @GetMapping("/{id}")
    public Kardex getById(@PathVariable Integer id) {
        return kardexService.findById(id);
    }

    @PostMapping
    public Kardex create(@RequestBody Kardex kardex) {
        return kardexService.save(kardex);
    }

    @PutMapping("/{id}")
    public Kardex update(@PathVariable Integer id, @RequestBody Kardex kardex) {
        kardex.setIdKardex(id);
        return kardexService.save(kardex);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        kardexService.deleteById(id);
    }
}