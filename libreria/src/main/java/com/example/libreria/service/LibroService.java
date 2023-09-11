package com.example.libreria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreria.dao.LibroDAO;
import com.example.libreria.dto.LibroDTO;
import com.example.libreria.entity.Libro;


@Service
public class LibroService extends AbstractApiService<Libro>  {
    
    @Autowired
    private LibroDAO libroDAO;

    public void agregarLibro(LibroDTO libroDTO) {
        this.libroDAO.save(new Libro(libroDTO));
    }

    public Iterable<Libro> listaLibros() {
        Iterable<Libro> libros = this.libroDAO.findAll();
        return libros;
    }

    public Optional<Libro> libroId(Long id) {
        return this.libroDAO.findById(id);
    }
}
