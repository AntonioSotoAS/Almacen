package com.almacen.controller;

import com.almacen.model.Almacen;
import com.almacen.service.AlmacenService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/almacenes")
@Tag(name = "Almacenes", description = "Operaciones relacionadas con los almacenes")
public class AlmacenController {

    @Autowired
    private AlmacenService almacenService;

    @GetMapping
    @Operation(summary = "Obtener todos los almacenes", description = "Devuelve una lista de todos los almacenes")
    public List<Almacen> getAll() {
        return almacenService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un almacén por ID", description = "Devuelve los detalles de un almacén específico")
    public Almacen getById(@PathVariable Integer id) {
        return almacenService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo almacén", description = "Crea un nuevo almacén en la base de datos")
    public Almacen create(@RequestBody Almacen almacen) {
        return almacenService.save(almacen);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un almacén existente", description = "Actualiza los detalles de un almacén existente")
    public Almacen update(@PathVariable Integer id, @RequestBody Almacen almacen) {
        almacen.setIdAlmacen(id);
        return almacenService.save(almacen);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un almacén", description = "Elimina un almacén de la base de datos")
    public void delete(@PathVariable Integer id) {
        almacenService.deleteById(id);
    }
}
