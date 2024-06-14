package com.almacen.controller;

import com.almacen.model.DetalleNotaSalida;
import com.almacen.service.DetalleNotaSalidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallenotassalida")
@Tag(name = "Detalle Notas de Salida", description = "Operaciones relacionadas con los detalles de las notas de salida")
public class DetalleNotaSalidaController {

    @Autowired
    private DetalleNotaSalidaService detalleNotaSalidaService;

    @GetMapping
    @Operation(summary = "Obtener todos los detalles de notas de salida", description = "Devuelve una lista de todos los detalles de notas de salida")
    public List<DetalleNotaSalida> getAll() {
        return detalleNotaSalidaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un detalle de nota de salida por ID", description = "Devuelve los detalles de una nota de salida específica")
    public DetalleNotaSalida getById(@PathVariable Integer id) {
        return detalleNotaSalidaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo detalle de nota de salida", description = "Crea un nuevo detalle de nota de salida en la base de datos")
    public DetalleNotaSalida create(@RequestBody DetalleNotaSalida detalleNotaSalida) {
        return detalleNotaSalidaService.save(detalleNotaSalida);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un detalle de nota de salida existente", description = "Actualiza los detalles de una nota de salida existente")
    public DetalleNotaSalida update(@PathVariable Integer id, @RequestBody DetalleNotaSalida detalleNotaSalida) {
        detalleNotaSalida.setIdDetailNotSal(id);
        return detalleNotaSalidaService.save(detalleNotaSalida);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un detalle de nota de salida", description = "Elimina un detalle de nota de salida de la base de datos")
    public void delete(@PathVariable Integer id) {
        detalleNotaSalidaService.deleteById(id);
    }
}
