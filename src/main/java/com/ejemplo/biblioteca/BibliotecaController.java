package com.ejemplo.biblioteca; // Mismo paquete que las demás clases (si queda en otro, no funciona)

import org.springframework.web.bind.annotation.GetMapping; // Para crear endpoints GET
import org.springframework.web.bind.annotation.PathVariable; // La usaremos en /prestamo/{dias}
import org.springframework.web.bind.annotation.RestController; // Marca la clase como controlador de la API
import java.util.List; // La usaremos en /libros

@RestController // Le dice a Spring: "esta clase responde peticiones web"
public class BibliotecaController {

    // ===== Endpoint /libro: devuelve un objeto Libro como JSON =====
    @GetMapping("/libro") // Cuando alguien visite /libro, se ejecuta este método
    public Libro libro() { // Devuelve un objeto de tipo Libro
        return new Libro("Cien años de soledad", "Gabriel García Márquez", 1967); // Crea el libro; Spring lo convierte a JSON
    }

    // ===== Endpoint /libros: devuelve una lista de 3 libros como JSON =====
    @GetMapping("/libros") // Cuando alguien visite /libros, se ejecuta este método
    public List<Libro> libros() { // Devuelve una lista de objetos Libro
        return List.of( // List.of crea una lista con los elementos que le des
                new Libro("Cien años de soledad", "Gabriel García Márquez", 1967), // Primer libro
                new Libro("El coronel no tiene quien le escriba", "Gabriel García Márquez", 1961), // Segundo libro
                new Libro("El principito", "Antoine de Saint-Exupéry", 2015) // Tercer libro (el último no lleva coma)
        ); // Aquí termina la lista
    }

    // ===== Endpoint /libro/resumen: devuelve el resumen de un libro como texto =====
    @GetMapping("/libro/resumen") // Cuando alguien visite /libro/resumen, se ejecuta este método
    public String resumenLibro() { // Devuelve un texto (se llama resumenLibro para no repetir el nombre libro)
        Libro l = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967); // Crea un libro
        return l.resumen(); // Devuelve el texto armado por el método resumen()
    }

    // ===== Endpoint /prestamo/{dias}: dice si el préstamo está vigente o vencido =====
    @GetMapping("/prestamo/{dias}") // {dias} es una parte variable de la dirección
    public String prestamo(@PathVariable int dias) { // @PathVariable toma el valor de la dirección y lo guarda en dias

        if (dias > 14) { // Pregunta: ¿pasaron más de 14 días? (estricto: 14 NO cuenta como vencido)
            int diasRetraso = dias - 14; // Calcula cuántos días se pasó del plazo
            int multa = Practica.calcularMulta(diasRetraso); // Reutiliza el método de Practica: diasRetraso * 500
            return "Préstamo vencido. Multa: $" + multa; // Devuelve el mensaje con la multa
        } else { // Si dias es 14 o menos
            return "Préstamo vigente"; // Devuelve este otro mensaje
        }
    }

}