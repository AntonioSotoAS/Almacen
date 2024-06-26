package com.almacen.controller;

import com.almacen.model.Marca;
import com.almacen.service.MarcaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
@Tag(name = "Marcas", description = "Operaciones relacionadas con las marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping
    @Operation(summary = "Obtener todas las marcas", description = "Devuelve una lista de todas las marcas")
    public List<Marca> getAll() {
        return marcaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una marca por ID", description = "Devuelve los detalles de una marca específica")
    public Marca getById(@PathVariable Integer id) {
        return marcaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva marca", description = "Crea una nueva marca en la base de datos")
    public Marca create(@RequestBody Marca marca) {
        return marcaService.save(marca);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una marca existente", description = "Actualiza los detalles de una marca existente")
    public Marca update(@PathVariable Integer id, @RequestBody Marca marca) {
        marca.setIdMarca(id);
        return marcaService.save(marca);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una marca", description = "Elimina una marca de la base de datos")
    public void delete(@PathVariable Integer id) {
        marcaService.deleteById(id);
    }
}
