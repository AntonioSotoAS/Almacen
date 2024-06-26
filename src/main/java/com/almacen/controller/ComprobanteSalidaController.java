package com.almacen.controller;

import com.almacen.model.ComprobanteSalida;
import com.almacen.service.ComprobanteSalidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comprobante_salida")
@Tag(name = "Comprobantes de Salida", description = "Operaciones relacionadas con los comprobantes de salida")
public class ComprobanteSalidaController {

    @Autowired
    private ComprobanteSalidaService comprobanteSalidaService;

    @GetMapping
    @Operation(summary = "Obtener todos los comprobantes de salida", description = "Devuelve una lista de todos los comprobantes de salida")
    public List<ComprobanteSalida> getAll() {
        return comprobanteSalidaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un comprobante de salida por ID", description = "Devuelve los detalles de un comprobante de salida específico")
    public ComprobanteSalida getById(@PathVariable Integer id) {
        return comprobanteSalidaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo comprobante de salida", description = "Crea un nuevo comprobante de salida en la base de datos")
    public ComprobanteSalida create(@RequestBody ComprobanteSalida comprobanteSalida) {
        return comprobanteSalidaService.save(comprobanteSalida);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un comprobante de salida existente", description = "Actualiza los detalles de un comprobante de salida existente")
    public ComprobanteSalida update(@PathVariable Integer id, @RequestBody ComprobanteSalida comprobanteSalida) {
        comprobanteSalida.setIdComprobanteSalida(id);
        return comprobanteSalidaService.save(comprobanteSalida);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un comprobante de salida", description = "Elimina un comprobante de salida de la base de datos")
    public void delete(@PathVariable Integer id) {
        comprobanteSalidaService.deleteById(id);
    }
}
