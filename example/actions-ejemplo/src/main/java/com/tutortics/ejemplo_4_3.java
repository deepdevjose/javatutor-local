package com.tutortics;
// src/ejemplo_4.3.java

import java.util.Arrays;

public class ejemplo_4_3 {

    /**
     * Crea y popula un arreglo de enteros. Para este ejemplo, cada elemento
     * será su índice multiplicado por 10.
     *
     * @param tamano El número de elementos que tendrá el arreglo.
     * @return El arreglo populado.
     */
    public int[] crearArreglo(int tamano) {
        // ARRE = ARREGLO [1..70] DE enteros
        // En Java, la declaración es la siguiente:
        int[] arre = new int[tamano];

        // Llenamos el arreglo con valores de ejemplo
        for (int i = 0; i < tamano; i++) {
            // Asignamos un valor a cada posición.
            arre[i] = (i + 1) * 10;
        }
        return arre;
    }

    /**
     * Método principal para demostrar el uso del arreglo.
     */
    public static void main(String[] args) {
        ejemplo_4_3 ejemplo = new ejemplo_4_3();
        
        // Creamos un arreglo de 70 elementos como en la Figura 4.3
        final int N_ELEMENTOS = 70;
        int[] miArreglo = ejemplo.crearArreglo(N_ELEMENTOS);

        System.out.println("Demostración del Ejemplo 4.3 - Arreglos");
        System.out.println("=========================================");

        // Accediendo a elementos específicos como se describe.
        // Recordar: Java usa índice 0 para la primera posición.
        // ARRE[1] en el libro es miArreglo[0] en Java.
        System.out.println("El valor en la primera posición (índice 0) es: " + miArreglo[0]);
        
        // ARRE[2] en el libro es miArreglo[1] en Java.
        System.out.println("El valor en la segunda posición (índice 1) es: " + miArreglo[1]);

        // ARRE[70] en el libro es miArreglo[69] en Java.
        System.out.println("El valor en la última posición (índice 69) es: " + miArreglo[69]);
        
        System.out.println("-----------------------------------------");
        System.out.println("Contenido completo del arreglo:");
        // Arrays.toString() es una forma fácil de imprimir todos los elementos.
        System.out.println(Arrays.toString(miArreglo));
        System.out.println("=========================================");
    }
}
