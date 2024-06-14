package com.almacen.controller;

import com.almacen.model.Existencia;
import com.almacen.service.ExistenciaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/existencias")
@Tag(name = "Existencias", description = "Operaciones relacionadas con las existencias")
public class ExistenciaController {

    @Autowired
    private ExistenciaService existenciaService;

    @GetMapping
    @Operation(summary = "Obtener todas las existencias", description = "Devuelve una lista de todas las existencias")
    public List<Existencia> getAll() {
        return existenciaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una existencia por ID", description = "Devuelve los detalles de una existencia específica")
    public Existencia getById(@PathVariable Integer id) {
        return existenciaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva existencia", description = "Crea una nueva existencia en la base de datos")
    public Existencia create(@RequestBody Existencia existencia) {
        return existenciaService.save(existencia);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una existencia existente", description = "Actualiza los detalles de una existencia existente")
    public Existencia update(@PathVariable Integer id, @RequestBody Existencia existencia) {
        existencia.setIdExistencia(id);
        return existenciaService.save(existencia);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una existencia", description = "Elimina una existencia de la base de datos")
    public void delete(@PathVariable Integer id) {
        existenciaService.deleteById(id);
    }
}
