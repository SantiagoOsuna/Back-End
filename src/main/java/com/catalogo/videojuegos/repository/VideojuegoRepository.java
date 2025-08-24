package com.catalogo.videojuegos.repository;

import com.catalogo.videojuegos.entity.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {

}
