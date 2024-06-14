package com.almacen.controller;

import com.almacen.model.Proveedor;
import com.almacen.service.ProveedorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
@Tag(name = "Proveedores", description = "Operaciones relacionadas con los proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    @Operation(summary = "Obtener todos los proveedores", description = "Devuelve una lista de todos los proveedores")
    public List<Proveedor> getAll() {
        return proveedorService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un proveedor por ID", description = "Devuelve los detalles de un proveedor específico")
    public Proveedor getById(@PathVariable Integer id) {
        return proveedorService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo proveedor", description = "Crea un nuevo proveedor en la base de datos")
    public Proveedor create(@RequestBody Proveedor proveedor) {
        return proveedorService.save(proveedor);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un proveedor existente", description = "Actualiza los detalles de un proveedor existente")
    public Proveedor update(@PathVariable Integer id, @RequestBody Proveedor proveedor) {
        proveedor.setIdProveedor(id);
        return proveedorService.save(proveedor);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un proveedor", description = "Elimina un proveedor de la base de datos")
    public void delete(@PathVariable Integer id) {
        proveedorService.deleteById(id);
    }
}
