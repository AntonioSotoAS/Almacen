package com.almacen.controller;

import com.almacen.model.Dependencia;
import com.almacen.service.DependenciaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dependencias")
@Tag(name = "Dependencias", description = "Operaciones relacionadas con las dependencias")
public class DependenciaController {

    @Autowired
    private DependenciaService dependenciaService;

    @GetMapping
    @Operation(summary = "Obtener todas las dependencias", description = "Devuelve una lista de todas las dependencias")
    public List<Dependencia> getAll() {
        return dependenciaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una dependencia por ID", description = "Devuelve los detalles de una dependencia específica")
    public Dependencia getById(@PathVariable Integer id) {
        return dependenciaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva dependencia", description = "Crea una nueva dependencia en la base de datos")
    public Dependencia create(@RequestBody Dependencia dependencia) {
        return dependenciaService.save(dependencia);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una dependencia existente", description = "Actualiza los detalles de una dependencia existente")
    public Dependencia update(@PathVariable Integer id, @RequestBody Dependencia dependencia) {
        dependencia.setIdDependencia(id);
        return dependenciaService.save(dependencia);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una dependencia", description = "Elimina una dependencia de la base de datos")
    public void delete(@PathVariable Integer id) {
        dependenciaService.deleteById(id);
    }
}
