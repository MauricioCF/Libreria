package com.example.libreria.dto;

import java.time.LocalDate;

import com.example.libreria.entity.Transaccion;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TransaccionDTO {

    private Long id;
    private Long cliente_id;
    private Long libro_id;
    private LocalDate fecha;

    public TransaccionDTO() {
    }

    public TransaccionDTO(Transaccion transaccion) {
        this.cliente_id = transaccion.getCliente_id();
        this.libro_id = transaccion.getLibro_id();
        this.fecha = transaccion.getFecha();
    }

}
