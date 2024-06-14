package com.almacen.controller;

import com.almacen.model.DetalleComprobante;
import com.almacen.service.DetalleComprobanteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallecomprobantes")
@Tag(name = "Detalle Comprobantes", description = "Operaciones relacionadas con los detalles de los comprobantes")
public class DetalleComprobanteController {

    @Autowired
    private DetalleComprobanteService detalleComprobanteService;

    @GetMapping
    @Operation(summary = "Obtener todos los detalles de comprobantes", description = "Devuelve una lista de todos los detalles de comprobantes")
    public List<DetalleComprobante> getAll() {
        return detalleComprobanteService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un detalle de comprobante por ID", description = "Devuelve los detalles de un comprobante específico")
    public DetalleComprobante getById(@PathVariable Integer id) {
        return detalleComprobanteService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo detalle de comprobante", description = "Crea un nuevo detalle de comprobante en la base de datos")
    public DetalleComprobante create(@RequestBody DetalleComprobante detalleComprobante) {
        return detalleComprobanteService.save(detalleComprobante);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un detalle de comprobante existente", description = "Actualiza los detalles de un comprobante existente")
    public DetalleComprobante update(@PathVariable Integer id, @RequestBody DetalleComprobante detalleComprobante) {
        detalleComprobante.setIdDetail(id);
        return detalleComprobanteService.save(detalleComprobante);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un detalle de comprobante", description = "Elimina un detalle de comprobante de la base de datos")
    public void delete(@PathVariable Integer id) {
        detalleComprobanteService.deleteById(id);
    }
}
