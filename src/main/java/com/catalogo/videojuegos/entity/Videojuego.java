package com.catalogo.videojuegos.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "videojuegos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Videojuego {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 150)
	private String titulo;
	
	@Column(nullable = false, length = 60)
	private String plataforma;
	
	@Column(nullable = false, length = 60)
	private String genero;
	
	@Column(name = "anio_lanzamiento", nullable = false)
	private Integer anioLanzamiento;
	
	@Column(nullable = false)
	private Double precio;
	
	@Column(length = 100)
	private String desarrollador;
	
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Integer getAnioLanzamiento() { return anioLanzamiento; }
    public void setAnioLanzamiento(Integer anioLanzamiento) { this.anioLanzamiento = anioLanzamiento; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public String getDesarrollador() { return desarrollador; }
    public void setDesarrollador(String desarrollador) { this.desarrollador = desarrollador; }
}
