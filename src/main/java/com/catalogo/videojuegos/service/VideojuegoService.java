package com.catalogo.videojuegos.service;

import com.catalogo.videojuegos.entity.Videojuego;
import java.util.List;

public interface VideojuegoService {
	List<Videojuego> findAll();
	Videojuego findById(Long id);
	Videojuego create(Videojuego v);
	Videojuego update(Long id, Videojuego v);
	void delete(Long id);

}
