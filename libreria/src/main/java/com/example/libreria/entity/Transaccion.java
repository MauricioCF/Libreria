package com.example.libreria.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.libreria.dto.TransaccionDTO;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cliente_id;
    private Long libro_id;
    private LocalDate fecha;

    public Transaccion(TransaccionDTO transaccionDTO) {
        this.id = transaccionDTO.getId();
        this.cliente_id = transaccionDTO.getCliente_id();
        this.libro_id = transaccionDTO.getLibro_id();
        this.fecha = transaccionDTO.getFecha();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCliente_id() {
        return cliente_id;
    }
    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }
    public Long getLibro_id() {
        return libro_id;
    }
    public void setLibro_id(Long libro_id) {
        this.libro_id = libro_id;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
