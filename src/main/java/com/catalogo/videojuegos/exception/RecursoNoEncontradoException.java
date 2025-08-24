package com.catalogo.videojuegos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecursoNoEncontradoException extends RuntimeException {
	public RecursoNoEncontradoException(String recurso, Object id) {
		super(recurso + " con id " + id + " no encontrado");
	}
}
