package com.example.libreria.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.dto.ClienteDTO;
import com.example.libreria.entity.Cliente;
import com.example.libreria.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping(value = "/crear")
    public void clienteAdd(@RequestBody Cliente cliente) {
        ClienteDTO newCliente = new ClienteDTO(cliente);
        this.clienteService.crearCliente(newCliente);
    }

    @GetMapping(value = "/todos")
    public Iterable<Cliente> obtenerClientes() {
      return this.clienteService.listaClientes();
    }

    @GetMapping(params = "id")
    public Optional<Cliente> obtenerClientesId(@RequestParam("id") Long id) {
      return this.clienteService.clienteId(id);
    }
}