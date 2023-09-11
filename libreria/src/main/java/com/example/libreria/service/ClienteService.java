package com.example.libreria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreria.dao.ClienteDAO;
import com.example.libreria.dto.ClienteDTO;
import com.example.libreria.entity.Cliente;


@Service
public class ClienteService extends AbstractApiService<Cliente>  {
    
    @Autowired
    private ClienteDAO clienteDAO;

    public void crearCliente(ClienteDTO clienteDTO) {
        this.clienteDAO.save(new Cliente(clienteDTO));
    }

    public Iterable<Cliente> listaClientes() {
        Iterable<Cliente> clientes = this.clienteDAO.findAll();
        return clientes;
    }

    public Optional<Cliente> clienteId(Long id) {
        return this.clienteDAO.findById(id);
    }
}
