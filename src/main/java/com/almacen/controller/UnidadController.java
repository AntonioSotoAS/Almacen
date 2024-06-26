package com.almacen.controller;

import com.almacen.model.Unidad;
import com.almacen.service.UnidadService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unidades")
@Tag(name = "Unidades", description = "Operaciones relacionadas con las unidades")
public class UnidadController {

    @Autowired
    private UnidadService unidadService;

    @GetMapping
    @Operation(summary = "Obtener todas las unidades", description = "Devuelve una lista de todas las unidades")
    public List<Unidad> getAll() {
        return unidadService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una unidad por ID", description = "Devuelve los detalles de una unidad específica")
    public Unidad getById(@PathVariable Integer id) {
        return unidadService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva unidad", description = "Crea una nueva unidad en la base de datos")
    public Unidad create(@RequestBody Unidad unidad) {
        return unidadService.save(unidad);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una unidad existente", description = "Actualiza los detalles de una unidad existente")
    public Unidad update(@PathVariable Integer id, @RequestBody Unidad unidad) {
        unidad.setIdUnidad(id);
        return unidadService.save(unidad);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una unidad", description = "Elimina una unidad de la base de datos")
    public void delete(@PathVariable Integer id) {
        unidadService.deleteById(id);
    }
}
