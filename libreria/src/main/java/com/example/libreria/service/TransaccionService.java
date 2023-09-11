package com.example.libreria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreria.dao.TransaccionDAO;
import com.example.libreria.dto.TransaccionDTO;
import com.example.libreria.entity.Transaccion;

@Service
public class TransaccionService extends AbstractApiService<Transaccion>  {
    
    @Autowired
    private TransaccionDAO transaccionDAO;

    public void createTransaccion(TransaccionDTO transaccionDTO) {
        this.transaccionDAO.save(new Transaccion(transaccionDTO));
    }

    public Iterable<Transaccion> listaTransacciones() {
        Iterable<Transaccion> clientes = this.transaccionDAO.findAll();
        return clientes;
    }

    public Optional<Transaccion> transaccionId(Long id) {
        return this.transaccionDAO.findById(id);
    }
}
