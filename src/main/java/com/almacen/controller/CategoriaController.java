package com.almacen.controller;

import com.almacen.model.Categoria;
import com.almacen.service.CategoriaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@Tag(name = "Categorías", description = "Operaciones relacionadas con las categorías")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    @Operation(summary = "Obtener todas las categorías", description = "Devuelve una lista de todas las categorías")
    public List<Categoria> getAll() {
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una categoría por ID", description = "Devuelve los detalles de una categoría específica")
    public Categoria getById(@PathVariable Integer id) {
        return categoriaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva categoría", description = "Crea una nueva categoría en la base de datos")
    public Categoria create(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una categoría existente", description = "Actualiza los detalles de una categoría existente")
    public Categoria update(@PathVariable Integer id, @RequestBody Categoria categoria) {
        categoria.setIdCategoria(id);
        return categoriaService.save(categoria);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una categoría", description = "Elimina una categoría de la base de datos")
    public void delete(@PathVariable Integer id) {
        categoriaService.deleteById(id);
    }
}
