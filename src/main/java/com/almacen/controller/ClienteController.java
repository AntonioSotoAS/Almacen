package com.almacen.controller;

import com.almacen.model.Cliente;
import com.almacen.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@Tag(name = "Clientes", description = "Operaciones relacionadas con los clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    @Operation(summary = "Obtener todos los clientes", description = "Devuelve una lista de todos los clientes")
    public List<Cliente> getAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un cliente por ID", description = "Devuelve los detalles de un cliente específico")
    public Cliente getById(@PathVariable Integer id) {
        return clienteService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo cliente", description = "Crea un nuevo cliente en la base de datos")
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PatchMapping("/{id}")
    @Operation(summary = "Actualizar un cliente existente", description = "Actualiza los detalles de un cliente existente")
    public Cliente update(@PathVariable Integer id, @RequestBody Cliente cliente) {
        cliente.setIdCliente(id);
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un cliente", description = "Elimina un cliente de la base de datos")
    public void delete(@PathVariable Integer id) {
        clienteService.deleteById(id);
    }
}
