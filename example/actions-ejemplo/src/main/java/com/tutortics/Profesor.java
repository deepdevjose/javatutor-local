// src/main/java/com/tutortics/Profesor.java
package com.tutortics;

// Hacemos la clase 'public' para que sea accesible desde los tests
public class Profesor {
    public String nombre;
    public int edad;
    public char sexo; // 'F' para mujer, 'M' para hombre

    public Profesor(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
}
