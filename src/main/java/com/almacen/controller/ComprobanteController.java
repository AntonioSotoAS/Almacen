package com.almacen.controller;

import com.almacen.model.Comprobante;
import com.almacen.service.ComprobanteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comprobantes")
@Tag(name = "Comprobantes", description = "Operaciones relacionadas con los comprobantes")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    @GetMapping
    @Operation(summary = "Obtener todos los comprobantes", description = "Devuelve una lista de todos los comprobantes")
    public List<Comprobante> getAll() {
        return comprobanteService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un comprobante por ID", description = "Devuelve los detalles de un comprobante específico")
    public Comprobante getById(@PathVariable Integer id) {
        return comprobanteService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo comprobante", description = "Crea un nuevo comprobante en la base de datos")
    public Comprobante create(@RequestBody Comprobante comprobante) {
        return comprobanteService.save(comprobante);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un comprobante existente", description = "Actualiza los detalles de un comprobante existente")
    public Comprobante update(@PathVariable Integer id, @RequestBody Comprobante comprobante) {
        comprobante.setIdComprobante(id);
        return comprobanteService.save(comprobante);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un comprobante", description = "Elimina un comprobante de la base de datos")
    public void delete(@PathVariable Integer id) {
        comprobanteService.deleteById(id);
    }
}
