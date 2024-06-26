package com.almacen.controller;

import com.almacen.model.Movimientos;
import com.almacen.service.MovimientosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
@Tag(name = "Movimientos", description = "Operaciones relacionadas con los movimientos")
public class MovimientosController {

    @Autowired
    private MovimientosService movimientosService;

    @GetMapping
    @Operation(summary = "Obtener todos los movimientos", description = "Devuelve una lista de todos los movimientos")
    public List<Movimientos> getAll() {
        return movimientosService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un movimiento por ID", description = "Devuelve los detalles de un movimiento específico")
    public Movimientos getById(@PathVariable Integer id) {
        return movimientosService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo movimiento", description = "Crea un nuevo movimiento en la base de datos")
    public Movimientos create(@RequestBody Movimientos movimientos) {
        return movimientosService.save(movimientos);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un movimiento existente", description = "Actualiza los detalles de un movimiento existente")
    public Movimientos update(@PathVariable Integer id, @RequestBody Movimientos movimientos) {
        movimientos.setIdMovimiento(id);
        return movimientosService.save(movimientos);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un movimiento", description = "Elimina un movimiento de la base de datos")
    public void delete(@PathVariable Integer id) {
        movimientosService.deleteById(id);
    }
}
