package com.example.libreria.exceptions;


public class EntidadNoEncontradaException extends RuntimeException{

    public EntidadNoEncontradaException(String message) {
        super(message);
    }

    public EntidadNoEncontradaException(String message, Throwable cause) {
        super(message, cause);
    }

}
