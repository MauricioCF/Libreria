package com.example.libreria.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.libreria.entity.Libro;

public interface LibroDAO extends CrudRepository<Libro, Long> {
}
