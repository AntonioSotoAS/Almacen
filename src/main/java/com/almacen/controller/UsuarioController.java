package com.almacen.controller;

import com.almacen.model.Usuario;
import com.almacen.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@Tag(name = "Usuarios", description = "Operaciones relacionadas con los usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    @Operation(summary = "Obtener todos los usuarios", description = "Devuelve una lista de todos los usuarios")
    public List<Usuario> getAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un usuario por ID", description = "Devuelve los detalles de un usuario específico")
    public Usuario getById(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo usuario", description = "Crea un nuevo usuario en la base de datos")
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un usuario existente", description = "Actualiza los detalles de un usuario existente")
    public Usuario update(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuario.setIdUsuario(id);
        return usuarioService.save(usuario);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un usuario", description = "Elimina un usuario de la base de datos")
    public void delete(@PathVariable Integer id) {
        usuarioService.deleteById(id);
    }
}
