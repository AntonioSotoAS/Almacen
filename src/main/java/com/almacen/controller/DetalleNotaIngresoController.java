package com.almacen.controller;

import com.almacen.model.DetalleNotaIngreso;
import com.almacen.service.DetalleNotaIngresoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallenotasingreso")
@Tag(name = "Detalle Notas de Ingreso", description = "Operaciones relacionadas con los detalles de las notas de ingreso")
public class DetalleNotaIngresoController {

    @Autowired
    private DetalleNotaIngresoService detalleNotaIngresoService;

    @GetMapping
    @Operation(summary = "Obtener todos los detalles de notas de ingreso", description = "Devuelve una lista de todos los detalles de notas de ingreso")
    public List<DetalleNotaIngreso> getAll() {
        return detalleNotaIngresoService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un detalle de nota de ingreso por ID", description = "Devuelve los detalles de una nota de ingreso específica")
    public DetalleNotaIngreso getById(@PathVariable Integer id) {
        return detalleNotaIngresoService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo detalle de nota de ingreso", description = "Crea un nuevo detalle de nota de ingreso en la base de datos")
    public DetalleNotaIngreso create(@RequestBody DetalleNotaIngreso detalleNotaIngreso) {
        return detalleNotaIngresoService.save(detalleNotaIngreso);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un detalle de nota de ingreso existente", description = "Actualiza los detalles de una nota de ingreso existente")
    public DetalleNotaIngreso update(@PathVariable Integer id, @RequestBody DetalleNotaIngreso detalleNotaIngreso) {
        detalleNotaIngreso.setIdDetailNotIng(id);
        return detalleNotaIngresoService.save(detalleNotaIngreso);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un detalle de nota de ingreso", description = "Elimina un detalle de nota de ingreso de la base de datos")
    public void delete(@PathVariable Integer id) {
        detalleNotaIngresoService.deleteById(id);
    }
}
