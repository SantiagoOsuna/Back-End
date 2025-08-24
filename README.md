🎮 Proyecto API REST - Videojuegos

Este proyecto es una API REST desarrollada en **Spring Boot** y **Maven** que permite gestionar videojuegos en una base de datos MySQL.  

La API expone 5 endpoints principales para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar/Deshabilitar) sobre videojuegos.

🛠️ Tecnologías utilizadas

- Java 17
- Spring Boot (framework principal para construir la API REST)
- Maven (gestor de dependencias y build)
- MySQL (base de datos relacional)
- JPA / Hibernate (mapeo objeto-relacional)
- Postman (para pruebas de los endpoints)
- Git & GitHub (control de versiones y repositorio remoto)

📌 Endpoints de la API

La API expone los siguientes endpoints para la gestión de videojuegos:  

1️⃣ Obtener todos los videojuegos
- Método: GET  
- URL: `http://localhost:8080/videojuegos`  
- Ejemplo en Postman:  
  <img width="930" height="637" alt="image" src="https://github.com/user-attachments/assets/cae8320c-474e-4750-80c5-bb25a704b18f" />

2️⃣ Obtener un videojuego por ID
- Método: GET  
- URL: `http://localhost:8080/videojuegos/{id}`  
- Ejemplo:  
  - `http://localhost:8080/videojuegos/1`  
- Respuesta JSON:
```json
{
  "id": 2,
  "titulo": "The Last of us",
  "plataforma": "Playstation 4 y 5",
  "genero": "Accion",
  "anioLanzamiento": 2022,
  "precio": 49.99,
  "desarrollador": "Playstation"
}
```
3️⃣ Crear un nuevo videojuego
- Método: POST  
- URL: `http://localhost:8080/videojuegos`
- Ejemplo en Postman:
  <img width="931" height="642" alt="image" src="https://github.com/user-attachments/assets/3341548e-185f-4d96-ad95-46ac047ffc4b" />
  
- Body (JSON):
```json
{
  "id": 3,
  "titulo": "EA FC 26 ",
  "plataforma": "Playstation 4, 5, xbox series x, xbox series s",
  "genero": "Deportes",
  "anioLanzamiento": 2025,
  "precio": 79.99,
  "desarrollador": "Ea Sports"
}
```
4️⃣ Actualizar un videojuego existente

- Método: PUT
- URL: `http://localhost:8080/videojuegos/{id}`
- Ejemplo:
http://localhost:8080/videojuegos/2
- Ejemplo en Postman:
  <img width="924" height="630" alt="image" src="https://github.com/user-attachments/assets/3f16f4ed-448e-4432-bea0-699f23cd3d5c" />

- Body (JSON):
```json
{
  "titulo": "The last of us",
  "plataforma": "PLAYSTATION",
  "genero": "Accion, supervivencia",
  "anioLanzamiento": 2022,
  "precio": 69.99,
  "desarrollador": "Playstation"
}

```
5️⃣ Eliminar un videojuego (Deshabilitar)

- Método: DELETE
- URL: `http://localhost:8080/videojuegos/{id}`
- Ejemplo:
http://localhost:8080/videojuegos/3
- Ejemplo Postman:
  <img width="927" height="612" alt="image" src="https://github.com/user-attachments/assets/b6c2f23b-d38c-4faf-82cd-b883a1c101b5" />

Esto seria todo sobre el proyecto.
