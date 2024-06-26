package com.almacen.controller;

import com.almacen.model.Solicitud;
import com.almacen.service.SolicitudService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/solicitudes")
@Tag(name = "Solicitudes", description = "Operaciones relacionadas con las solicitudes")
public class SolicitudController {

    @Autowired
    private SolicitudService solicitudService;

    @GetMapping
    @Operation(summary = "Obtener todas las solicitudes", description = "Devuelve una lista de todas las solicitudes")
    public List<Solicitud> getAll() {
        return solicitudService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una solicitud por ID", description = "Devuelve los detalles de una solicitud específica")
    public Solicitud getById(@PathVariable Integer id) {
        return solicitudService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva solicitud", description = "Crea una nueva solicitud en la base de datos")
    public Solicitud create(@RequestBody Solicitud solicitud) {
        return solicitudService.save(solicitud);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una solicitud existente", description = "Actualiza los detalles de una solicitud existente")
    public Solicitud update(@PathVariable Integer id, @RequestBody Solicitud solicitud) {
        solicitud.setIdSolicitud(id);
        return solicitudService.save(solicitud);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una solicitud", description = "Elimina una solicitud de la base de datos")
    public void delete(@PathVariable Integer id) {
        solicitudService.deleteById(id);
    }
}
