package com.catalogo.videojuegos.controller;

import com.catalogo.videojuegos.entity.Videojuego;
import com.catalogo.videojuegos.service.VideojuegoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class VideojuegoController {
	
	private final VideojuegoService service;
	
	public VideojuegoController(VideojuegoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Videojuego> listar() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Videojuego obtenerPorId(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Videojuego> crear(@RequestBody Videojuego body) {
		Videojuego creado = service.create(body);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(creado.getId())
				.toUri();
		return ResponseEntity.created(location).body(creado);
	}

	@PutMapping("/{id}")
    public Videojuego actualizar(@PathVariable Long id, @RequestBody Videojuego body) {
        return service.update(id, body);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
