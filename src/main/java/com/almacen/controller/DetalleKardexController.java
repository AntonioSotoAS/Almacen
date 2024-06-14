package com.almacen.controller;

import com.almacen.model.DetalleKardex;
import com.almacen.service.DetalleKardexService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallekardex")
@Tag(name = "Detalle Kardex", description = "Operaciones relacionadas con los detalles del kardex")
public class DetalleKardexController {

    @Autowired
    private DetalleKardexService detalleKardexService;

    @GetMapping
    @Operation(summary = "Obtener todos los detalles de kardex", description = "Devuelve una lista de todos los detalles de kardex")
    public List<DetalleKardex> getAll() {
        return detalleKardexService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un detalle de kardex por ID", description = "Devuelve los detalles de un kardex específico")
    public DetalleKardex getById(@PathVariable Integer id) {
        return detalleKardexService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo detalle de kardex", description = "Crea un nuevo detalle de kardex en la base de datos")
    public DetalleKardex create(@RequestBody DetalleKardex detalleKardex) {
        return detalleKardexService.save(detalleKardex);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un detalle de kardex existente", description = "Actualiza los detalles de un kardex existente")
    public DetalleKardex update(@PathVariable Integer id, @RequestBody DetalleKardex detalleKardex) {
        detalleKardex.setIdDetailKardex(id);
        return detalleKardexService.save(detalleKardex);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un detalle de kardex", description = "Elimina un detalle de kardex de la base de datos")
    public void delete(@PathVariable Integer id) {
        detalleKardexService.deleteById(id);
    }
}
