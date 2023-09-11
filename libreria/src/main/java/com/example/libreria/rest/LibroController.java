package com.example.libreria.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.dto.LibroDTO;
import com.example.libreria.entity.Libro;
import com.example.libreria.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @PostMapping(value = "/agregar")
    public void libroAdd(@RequestBody Libro libro) {
        LibroDTO newLibro = new LibroDTO(libro);
        this.libroService.agregarLibro(newLibro);
    }

    @GetMapping(value = "/todos")
    public Iterable<Libro> obtenerClientes() {
        return this.libroService.listaLibros();
    }

    @GetMapping(params = "id")
    public Optional<Libro> obtenerClientesId(@RequestParam("id") Long id) {
        return this.libroService.libroId(id);
    }
}