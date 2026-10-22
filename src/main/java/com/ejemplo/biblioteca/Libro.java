package com.ejemplo.biblioteca; // Paquete donde vive la clase

public class Libro { // El molde: define cómo es un libro

    // Atributos: los datos que tiene cada libro
    private String titulo; // Título del libro (private: solo se usa desde dentro de la clase)
    private String autor; // Autor del libro
    private int anio; // Año de publicación

    // Constructor: se ejecuta al crear un libro con new y le da sus valores iniciales
    public Libro(String titulo, String autor, int anio) { // Mismo nombre de la clase, sin tipo de retorno
        this.titulo = titulo; // this.titulo es el atributo; titulo es el dato que llegó
        this.autor = autor; // Guarda el autor recibido en el atributo
        this.anio = anio; // Guarda el año recibido en el atributo
    }

    // Getters: métodos para LEER los atributos privados
    public String getTitulo() { // Devuelve el título
        return titulo; // Entrega el valor del atributo titulo
    }

    public String getAutor() { // Devuelve el autor
        return autor; // Entrega el valor del atributo autor
    }

    public int getAnio() { // Devuelve el año
        return anio; // Entrega el valor del atributo anio
    }


    // Métodos propios: acciones que hace un libro con sus propios datos
    public boolean esAntiguo() { // Devuelve true o false
        return anio < 2000; // true si el año es menor a 2000; false en caso contrario
    }

    public String resumen() { // Devuelve un texto
        return titulo + " de " + autor + " (" + anio + ")"; // Une título, autor y año con el formato pedido
    }


}
