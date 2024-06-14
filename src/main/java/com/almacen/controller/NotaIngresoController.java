package com.almacen.controller;

import com.almacen.model.NotaIngreso;
import com.almacen.service.NotaIngresoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notasingreso")
@Tag(name = "Notas de Ingreso", description = "Operaciones relacionadas con las notas de ingreso")
public class NotaIngresoController {

    @Autowired
    private NotaIngresoService notaIngresoService;

    @GetMapping
    @Operation(summary = "Obtener todas las notas de ingreso", description = "Devuelve una lista de todas las notas de ingreso")
    public List<NotaIngreso> getAll() {
        return notaIngresoService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una nota de ingreso por ID", description = "Devuelve los detalles de una nota de ingreso específica")
    public NotaIngreso getById(@PathVariable Integer id) {
        return notaIngresoService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva nota de ingreso", description = "Crea una nueva nota de ingreso en la base de datos")
    public NotaIngreso create(@RequestBody NotaIngreso notaIngreso) {
        return notaIngresoService.save(notaIngreso);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una nota de ingreso existente", description = "Actualiza los detalles de una nota de ingreso existente")
    public NotaIngreso update(@PathVariable Integer id, @RequestBody NotaIngreso notaIngreso) {
        notaIngreso.setIdNotaIngreso(id);
        return notaIngresoService.save(notaIngreso);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una nota de ingreso", description = "Elimina una nota de ingreso de la base de datos")
    public void delete(@PathVariable Integer id) {
        notaIngresoService.deleteById(id);
    }
}
