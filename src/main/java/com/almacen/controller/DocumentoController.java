package com.almacen.controller;

import com.almacen.model.Documento;
import com.almacen.service.DocumentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documentos")
@Tag(name = "Documentos", description = "Operaciones relacionadas con los documentos")
public class DocumentoController {

    @Autowired
    private DocumentoService documentoService;

    @GetMapping
    @Operation(summary = "Obtener todos los documentos", description = "Devuelve una lista de todos los documentos")
    public List<Documento> getAll() {
        return documentoService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un documento por ID", description = "Devuelve los detalles de un documento específico")
    public Documento getById(@PathVariable Integer id) {
        return documentoService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo documento", description = "Crea un nuevo documento en la base de datos")
    public Documento create(@RequestBody Documento documento) {
        return documentoService.save(documento);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un documento existente", description = "Actualiza los detalles de un documento existente")
    public Documento update(@PathVariable Integer id, @RequestBody Documento documento) {
        documento.setIdDocumento(id);
        return documentoService.save(documento);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un documento", description = "Elimina un documento de la base de datos")
    public void delete(@PathVariable Integer id) {
        documentoService.deleteById(id);
    }
}
