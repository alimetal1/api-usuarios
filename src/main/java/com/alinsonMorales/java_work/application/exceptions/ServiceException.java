package com.alinsonMorales.java_work.application.exceptions;

import lombok.Getter;

@Getter
public class ServiceException extends Exception {
    private final String mensaje;

    public ServiceException(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }
}
