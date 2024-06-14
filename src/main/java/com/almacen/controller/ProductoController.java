package com.almacen.controller;

import com.almacen.model.Producto;
import com.almacen.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@Tag(name = "Productos", description = "Operaciones relacionadas con los productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    @Operation(summary = "Obtener todos los productos", description = "Devuelve una lista de todos los productos")
    public List<Producto> getAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un producto por ID", description = "Devuelve los detalles de un producto específico")
    public Producto getById(@PathVariable Integer id) {
        return productoService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo producto", description = "Crea un nuevo producto en la base de datos")
    public Producto create(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un producto existente", description = "Actualiza los detalles de un producto existente")
    public Producto update(@PathVariable Integer id, @RequestBody Producto producto) {
        producto.setIdProducto(id);
        return productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un producto", description = "Elimina un producto de la base de datos")
    public void delete(@PathVariable Integer id) {
        productoService.deleteById(id);
    }
}
