package com.example.libreria.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.dto.TransaccionDTO;
import com.example.libreria.entity.Transaccion;
import com.example.libreria.service.TransaccionService;

@RestController
@RequestMapping("/transacciones")
public class TransaccionController {
    @Autowired
    private TransaccionService transaccionService;

    @PostMapping(value = "/crear")
    public void crearTransaccion(@RequestBody Transaccion transaccion) {
        TransaccionDTO newTransaccion = new TransaccionDTO(transaccion);
        this.transaccionService.createTransaccion(newTransaccion);
    }

    @GetMapping(value = "/todas")
    public Iterable<Transaccion> obtenerTransacciones() {
        return this.transaccionService.listaTransacciones();
    }

    @GetMapping(params = "id")
    public Optional<Transaccion> obtenerTransaccionesId(@RequestParam("id") Long id) {
        return this.transaccionService.transaccionId(id);
    }
}