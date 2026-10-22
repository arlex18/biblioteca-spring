package com.ejemplo.biblioteca; // Paquete donde vive esta clase (igual que BibliotecaApplication)

public class Practica { // Clase para practicar Java puro, sin servidor

    public static void main(String[] args) { // Punto de entrada: lo primero que Java ejecuta

        String titulo = "Cien años de soledad"; // Caja de texto: el título del libro
        int anio = 1967; // Caja de entero: el año de publicación
        boolean disponible = true; // Caja de verdadero/falso: si el libro está disponible

        System.out.println("Título: " + titulo); // Muestra el título
        System.out.println("Año: " + anio); // Muestra el año
        System.out.println("Disponible: " + disponible); // Muestra si está disponible

        if (anio < 2000) { // Pregunta: ¿el año es menor que 2000?
            System.out.println("Clásico"); // Si es cierto, muestra este mensaje
        } else { // Si no es cierto (el año es 2000 o más)
            System.out.println("Contemporáneo"); // Muestra este otro
        }

        for (int i = 1; i <= 5; i++) { // Crea i en 1; repite mientras i sea menor o igual a 5; en cada vuelta suma 1
            System.out.println("Ejemplar " + i); // Muestra "Ejemplar" junto con el valor actual de i
        } // Aquí termina lo que se repite

        int multa1 = calcularMulta(3); // Llama al método con 3 días de retraso y guarda el resultado
        int multa2 = calcularMulta(10); // Lo llama otra vez, con 10 días
        int multa3 = calcularMulta(0); // Y otra vez, con 0 días (sin retraso)

        System.out.println("Multa 3 días: $" + multa1); // Muestra el primer resultado
        System.out.println("Multa 10 días: $" + multa2); // Muestra el segundo resultado
        System.out.println("Multa 0 días: $" + multa3); // Muestra el tercer resultado
        // ===== Etapa 3: crear y usar objetos Libro =====
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967); // Crea el primer libro (antes del 2000)
        Libro libro2 = new Libro("El coronel no tiene quien le escriba", "Gabriel García Márquez", 1961); // Crea el segundo libro (antes del 2000)
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", 2015); // Crea el tercer libro (después del 2000; año de ejemplo)

        System.out.println(libro1.resumen()); // Muestra el resumen del libro 1
        System.out.println(libro2.resumen()); // Muestra el resumen del libro 2
        System.out.println(libro3.resumen()); // Muestra el resumen del libro 3

        System.out.println("¿Libro 1 es antiguo? " + libro1.esAntiguo()); // true porque 1967 < 2000
        System.out.println("¿Libro 2 es antiguo? " + libro2.esAntiguo()); // true porque 1961 < 2000
        System.out.println("¿Libro 3 es antiguo? " + libro3.esAntiguo()); // false porque 2015 no es menor a 2000
    } // Fin del main

    public static int calcularMulta(int diasRetraso) { // Recibe los días de retraso y devuelve un entero
        return diasRetraso * 500; // Multiplica los días por 500 pesos y entrega el resultado
    } // Aquí termina el método

} // Fin de la clase


