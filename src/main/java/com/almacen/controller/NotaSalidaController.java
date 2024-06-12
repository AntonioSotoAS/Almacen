package com.almacen.controller;

import com.almacen.model.NotaSalida;
import com.almacen.service.NotaSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notassalida")
public class NotaSalidaController {

    @Autowired
    private NotaSalidaService notaSalidaService;

    @GetMapping
    public List<NotaSalida> getAll() {
        return notaSalidaService.findAll();
    }

    @GetMapping("/{id}")
    public NotaSalida getById(@PathVariable Integer id) {
        return notaSalidaService.findById(id);
    }

    @PostMapping
    public NotaSalida create(@RequestBody NotaSalida notaSalida) {
        return notaSalidaService.save(notaSalida);
    }

    @PutMapping("/{id}")
    public NotaSalida update(@PathVariable Integer id, @RequestBody NotaSalida notaSalida) {
        notaSalida.setIdNotaSalida(id);
        return notaSalidaService.save(notaSalida);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        notaSalidaService.deleteById(id);
    }
}