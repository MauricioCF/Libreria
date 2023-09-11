package com.example.libreria.dto;

import com.example.libreria.entity.Cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClienteDTO {

    private Long id;
    private String nombre;
    private String email;

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente cliente) {
        this.nombre = cliente.getNombre();
        this.email = cliente.getEmail();
    }
}
