package com.almacen.controller;

import com.almacen.model.Persona;
import com.almacen.service.PersonaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
@Tag(name = "Personas", description = "Operaciones relacionadas con las personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    @Operation(summary = "Obtener todas las personas", description = "Devuelve una lista de todas las personas")
    public List<Persona> getAll() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una persona por ID", description = "Devuelve los detalles de una persona específica")
    public Persona getById(@PathVariable Integer id) {
        return personaService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear una nueva persona", description = "Crea una nueva persona en la base de datos")
    public Persona create(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar una persona existente", description = "Actualiza los detalles de una persona existente")
    public Persona update(@PathVariable Integer id, @RequestBody Persona persona) {
        persona.setIdPersona(id);
        return personaService.save(persona);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una persona", description = "Elimina una persona de la base de datos")
    public void delete(@PathVariable Integer id) {
        personaService.deleteById(id);
    }
}
