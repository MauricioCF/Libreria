package com.example.libreria.dto;

import com.example.libreria.entity.Libro;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LibroDTO {

    private Long id;
    private String titulo;
    private String autor;
    private String isbn;

    public LibroDTO() {
    }

    public LibroDTO(Libro libro) {
        this.titulo = libro.getTitulo();
        this.autor = libro.getAutor();
        this.isbn = libro.getIsbn();
    }
}