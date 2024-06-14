package com.almacen.controller;

import com.almacen.model.Kardex;
import com.almacen.service.KardexService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kardex")
@Tag(name = "Kardex", description = "Operaciones relacionadas con el kardex")
public class KardexController {

    @Autowired
    private KardexService kardexService;

    @GetMapping
    @Operation(summary = "Obtener todos los kardex", description = "Devuelve una lista de todos los kardex")
    public List<Kardex> getAll() {
        return kardexService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un kardex por ID", description = "Devuelve los detalles de un kardex específico")
    public Kardex getById(@PathVariable Integer id) {
        return kardexService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo kardex", description = "Crea un nuevo kardex en la base de datos")
    public Kardex create(@RequestBody Kardex kardex) {
        return kardexService.save(kardex);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un kardex existente", description = "Actualiza los detalles de un kardex existente")
    public Kardex update(@PathVariable Integer id, @RequestBody Kardex kardex) {
        kardex.setIdKardex(id);
        return kardexService.save(kardex);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un kardex", description = "Elimina un kardex de la base de datos")
    public void delete(@PathVariable Integer id) {
        kardexService.deleteById(id);
    }
}
