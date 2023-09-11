package com.example.libreria.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.libreria.entity.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Long> {
}
