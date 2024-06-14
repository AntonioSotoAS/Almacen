package com.almacen.controller;

import com.almacen.model.NotaSalida;
import com.almacen.service.NotaSalidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notassalida")
@Tag(name = "Notas de Salida", description = "Operaciones relacionadas con las notas de salida")
public class NotaSalidaController {

    @Autowired
    private NotaSalidaService notaSalidaService;

    @GetMapping
    @Operation(summary = "Obtener todas las notas de salida", description = "Devuelve una lista de todas las notas de salida")
    public List<NotaSalida> getAll() {
        return notaSalidaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una nota de salida por ID", description = "Devuelve los detalles de una nota de salida específica")
    public NotaSalida getById(@PathVariable Integer id) {
        return notaSalidaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva nota de salida", description = "Crea una nueva nota de salida en la base de datos")
    public NotaSalida create(@RequestBody NotaSalida notaSalida) {
        return notaSalidaService.save(notaSalida);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una nota de salida existente", description = "Actualiza los detalles de una nota de salida existente")
    public NotaSalida update(@PathVariable Integer id, @RequestBody NotaSalida notaSalida) {
        notaSalida.setIdNotaSalida(id);
        return notaSalidaService.save(notaSalida);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una nota de salida", description = "Elimina una nota de salida de la base de datos")
    public void delete(@PathVariable Integer id) {
        notaSalidaService.deleteById(id);
    }
}
