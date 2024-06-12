package com.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almacen.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
