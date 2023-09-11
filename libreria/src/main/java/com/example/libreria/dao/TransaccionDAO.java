package com.example.libreria.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.libreria.entity.Transaccion;

public interface TransaccionDAO extends CrudRepository<Transaccion, Long> {
}
