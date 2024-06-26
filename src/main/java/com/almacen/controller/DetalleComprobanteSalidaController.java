package com.almacen.controller;

import com.almacen.model.DetalleComprobanteSalida;
import com.almacen.service.DetalleComprobanteSalidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle_comprobante_salida")
@Tag(name = "Detalles de Comprobante de Salida", description = "Operaciones relacionadas con los detalles de comprobantes de salida")
public class DetalleComprobanteSalidaController {

    @Autowired
    private DetalleComprobanteSalidaService detalleComprobanteSalidaService;

    @GetMapping
    @Operation(summary = "Obtener todos los detalles de comprobantes de salida", description = "Devuelve una lista de todos los detalles de comprobantes de salida")
    public List<DetalleComprobanteSalida> getAll() {
        return detalleComprobanteSalidaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un detalle de comprobante de salida por ID", description = "Devuelve los detalles de un detalle de comprobante de salida específico")
    public DetalleComprobanteSalida getById(@PathVariable Integer id) {
        return detalleComprobanteSalidaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo detalle de comprobante de salida", description = "Crea un nuevo detalle de comprobante de salida en la base de datos")
    public DetalleComprobanteSalida create(@RequestBody DetalleComprobanteSalida detalleComprobanteSalida) {
        return detalleComprobanteSalidaService.save(detalleComprobanteSalida);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un detalle de comprobante de salida existente", description = "Actualiza los detalles de un detalle de comprobante de salida existente")
    public DetalleComprobanteSalida update(@PathVariable Integer id, @RequestBody DetalleComprobanteSalida detalleComprobanteSalida) {
        detalleComprobanteSalida.setIdDetalleCompSalida(id);
        return detalleComprobanteSalidaService.save(detalleComprobanteSalida);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un detalle de comprobante de salida", description = "Elimina un detalle de comprobante de salida de la base de datos")
    public void delete(@PathVariable Integer id) {
        detalleComprobanteSalidaService.deleteById(id);
    }
}
