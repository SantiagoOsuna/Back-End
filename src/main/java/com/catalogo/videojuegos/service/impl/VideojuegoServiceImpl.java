package com.catalogo.videojuegos.service.impl;

import com.catalogo.videojuegos.entity.Videojuego;
import com.catalogo.videojuegos.exception.RecursoNoEncontradoException;
import com.catalogo.videojuegos.repository.VideojuegoRepository;
import com.catalogo.videojuegos.service.VideojuegoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoServiceImpl implements VideojuegoService {

    private final VideojuegoRepository repo;

  
    public VideojuegoServiceImpl(VideojuegoRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Videojuego> findAll() {
        return repo.findAll();
    }

    @Override
    public Videojuego findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Videojuego", id));
    }

    @Override
    public Videojuego create(Videojuego v) {
        
        v.setId(null);
        return repo.save(v);
    }

    @Override
    public Videojuego update(Long id, Videojuego v) {
        Videojuego actual = findById(id);
        actual.setTitulo(v.getTitulo());
        actual.setPlataforma(v.getPlataforma());
        actual.setGenero(v.getGenero());
        actual.setAnioLanzamiento(v.getAnioLanzamiento());
        actual.setPrecio(v.getPrecio());
        actual.setDesarrollador(v.getDesarrollador());
        return repo.save(actual);
    }

    @Override
    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new RecursoNoEncontradoException("Videojuego", id);
        }
        repo.deleteById(id);
    }
}
