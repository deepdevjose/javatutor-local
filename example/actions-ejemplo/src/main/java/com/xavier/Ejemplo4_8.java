package com.xavier;

/**
 * Ejemplo 4.8 - Manejo de matrices con rangos negativos
 *
 * Instrucciones para el alumno:
 * ----------------------------------------------------
 * Este ejercicio utiliza una matriz cuyas posiciones
 * lógicas van desde:
 *
 *  - Filas: de -11 a 3
 *  - Columnas: de -17 a -13
 *
 * El objetivo es:
 *   1. Crear una matriz con las dimensiones correctas
 *      calculadas a partir de esos rangos.
 *   2. Llenarla con valores consecutivos empezando en 1.0
 *   3. Contar el número total de elementos (NTE)
 *   4. Comprender cómo se mapea un índice lógico negativo
 *      a un índice real dentro del arreglo.
 *
 * NO implementar la solución final completa:
 * solo dejar la estructura.
 */
public class Ejemplo4_8 {

    /**
     * Crea una matriz basada en los rangos:
     * filas: -11 a 3
     * columnas: -17 a -13
     *
     * TODO: Calcular correctamente las dimensiones y llenar la matriz.
     */
    public static double[][] crearMatriz() {

        // TODO: calcular número de filas
        // int filas = (valorA - valorB) + 1;

        // TODO: calcular número de columnas
        // int columnas = ...

        // TODO: crear la matriz con las dimensiones calculadas
        // double[][] matriz = new double[filas][columnas];

        // TODO: llenar la matriz con valores consecutivos (1.0, 2.0, 3.0, ...)

        return null; // TODO: reemplazar por la matriz creada
    }

    /**
     * Cuenta el número total de elementos de la matriz.
     *
     * TODO: implementar el contador.
     */
    public static int contarElementos(double[][] matriz) {

        // TODO: recorrer la matriz y contar sus elementos

        return 0; // TODO: reemplazar con el total contado
    }

    public static void main(String[] args) {

        // TODO: generar la matriz usando crearMatriz()
        double[][] matriz = null;

        // TODO: calcular el total de elementos
        int total = 0;

        // TODO: imprimir los datos
        System.out.println("Número total de elementos (NTE): " + total);

        // TODO: imprimir dimensiones de la matriz
        // System.out.println("Dimensiones: X filas x Y columnas");

        // TODO: calcular ejemplo de acceso (explicado según libro)
        // System.out.println("Ejemplo de acceso lógico vs físico...");
    }
}
