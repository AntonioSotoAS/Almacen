package com.almacen.controller;

import com.almacen.model.UnidadMedida;
import com.almacen.service.UnidadMedidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unidades_medida")
@Tag(name = "Unidades de Medida", description = "Operaciones relacionadas con las unidades de medida")
public class UnidadMedidaController {

    @Autowired
    private UnidadMedidaService unidadMedidaService;

    @GetMapping
    @Operation(summary = "Obtener todas las unidades de medida", description = "Devuelve una lista de todas las unidades de medida")
    public List<UnidadMedida> getAll() {
        return unidadMedidaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una unidad de medida por ID", description = "Devuelve los detalles de una unidad de medida específica")
    public UnidadMedida getById(@PathVariable Integer id) {
        return unidadMedidaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva unidad de medida", description = "Crea una nueva unidad de medida en la base de datos")
    public UnidadMedida create(@RequestBody UnidadMedida unidadMedida) {
        return unidadMedidaService.save(unidadMedida);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una unidad de medida existente", description = "Actualiza los detalles de una unidad de medida existente")
    public UnidadMedida update(@PathVariable Integer id, @RequestBody UnidadMedida unidadMedida) {
        unidadMedida.setIdUnimed(id);
        return unidadMedidaService.save(unidadMedida);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una unidad de medida", description = "Elimina una unidad de medida de la base de datos")
    public void delete(@PathVariable Integer id) {
        unidadMedidaService.deleteById(id);
    }
}
