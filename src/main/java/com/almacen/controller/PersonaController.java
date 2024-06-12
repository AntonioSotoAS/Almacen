package com.almacen.controller;

import com.almacen.model.Persona;
import com.almacen.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getAll() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public Persona getById(@PathVariable Integer id) {
        return personaService.findById(id);
    }

    @PostMapping
    public Persona create(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @PutMapping("/{id}")
    public Persona update(@PathVariable Integer id, @RequestBody Persona persona) {
        persona.setIdPersona(id);
        return personaService.save(persona);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        personaService.deleteById(id);
    }
}