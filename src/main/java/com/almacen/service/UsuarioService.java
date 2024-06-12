package com.almacen.service;

import com.almacen.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Integer id);
    Usuario save(Usuario usuario);
    void deleteById(Integer id);
}
