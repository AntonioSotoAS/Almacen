package com.almacen.service;

import com.almacen.model.Persona;
import java.util.List;

public interface PersonaService {
    List<Persona> findAll();
    Persona findById(Integer id);
    Persona save(Persona persona);
    void deleteById(Integer id);
}