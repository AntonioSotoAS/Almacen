package com.almacen.controller;

import com.almacen.model.DetalleSolicitud;
import com.almacen.service.DetalleSolicitudService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle_solicitud")
@Tag(name = "Detalles de Solicitud", description = "Operaciones relacionadas con los detalles de solicitudes")
public class DetalleSolicitudController {

    @Autowired
    private DetalleSolicitudService detalleSolicitudService;

    @GetMapping
    @Operation(summary = "Obtener todos los detalles de solicitudes", description = "Devuelve una lista de todos los detalles de solicitudes")
    public List<DetalleSolicitud> getAll() {
        return detalleSolicitudService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un detalle de solicitud por ID", description = "Devuelve los detalles de un detalle de solicitud específico")
    public DetalleSolicitud getById(@PathVariable Integer id) {
        return detalleSolicitudService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo detalle de solicitud", description = "Crea un nuevo detalle de solicitud en la base de datos")
    public DetalleSolicitud create(@RequestBody DetalleSolicitud detalleSolicitud) {
        return detalleSolicitudService.save(detalleSolicitud);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un detalle de solicitud existente", description = "Actualiza los detalles de un detalle de solicitud existente")
    public DetalleSolicitud update(@PathVariable Integer id, @RequestBody DetalleSolicitud detalleSolicitud) {
        detalleSolicitud.setId(id);
        return detalleSolicitudService.save(detalleSolicitud);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un detalle de solicitud", description = "Elimina un detalle de solicitud de la base de datos")
    public void delete(@PathVariable Integer id) {
        detalleSolicitudService.deleteById(id);
    }
}
