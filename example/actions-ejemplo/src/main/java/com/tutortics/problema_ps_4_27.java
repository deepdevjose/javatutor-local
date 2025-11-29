package com.tutortics;
// src/problema_ps_4_27.java

import java.util.Scanner;
import java.util.Arrays;

public class problema_ps_4_27 {

    /**
     * Genera un vector B a partir de una matriz A según las reglas del PS 4.27.
     *
     * @param a La matriz cuadrada de entrada.
     * @param n El orden de la matriz.
     * @return El vector B generado (como un arreglo de doubles).
     */
    public double[] generarVectorB(int[][] a, int n) {
        double[] b = new double[n];

        for (int i = 0; i < n; i++) {
            int i_uno_basado = i + 1;

            if (i_uno_basado % 3 == 1) {
                // Caso 1: Suma de la fila i
                b[i] = sumarFila(a, n, i);
            } else if (i_uno_basado % 3 == 2) {
                // Caso 2: Producto de la columna i
                b[i] = multiplicarColumna(a, n, i);
            } else { // i_uno_basado % 3 == 0
                // Caso 3: (Producto de col i-1) / (Suma de fila i-2)
                long productoColumnaAnterior = multiplicarColumna(a, n, i - 1);
                long sumaFilaAnteriorAnterior = sumarFila(a, n, i - 2);

                if (sumaFilaAnteriorAnterior == 0) {
                    System.out.println("Advertencia: División por cero en el índice " + i_uno_basado + ". Asignando 0.");
                    b[i] = 0;
                } else {
                    b[i] = (double) productoColumnaAnterior / sumaFilaAnteriorAnterior;
                }
            }
        }
        return b;
    }

    // Helper para sumar los elementos de una fila
    private long sumarFila(int[][] matriz, int n, int filaIndex) {
        long suma = 0;
        for (int k = 0; k < n; k++) {
            suma += matriz[filaIndex][k];
        }
        return suma;
    }

    // Helper para multiplicar los elementos de una columna
    private long multiplicarColumna(int[][] matriz, int n, int colIndex) {
        long producto = 1;
        for (int k = 0; k < n; k++) {
            producto *= matriz[k][colIndex];
        }
        return producto;
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problema_ps_4_27 problema = new problema_ps_4_27();

        // a) Lea la matriz A
        System.out.println("Ingrese el orden de la matriz (N) [1-50]:");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 50) {
            int[][] matrizA = new int[n][n];
            System.out.println("Ingrese los elementos de la matriz " + n + "x" + n + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrizA[i][j] = scanner.nextInt();
                }
            }

            // b) Genere el vector B
            double[] vectorB = problema.generarVectorB(matrizA, n);

            // c) Escriba el vector B
            System.out.println("\n=========================================");
            System.out.println("El vector B generado es:");
            System.out.println(Arrays.toString(vectorB));
            System.out.println("=========================================");

        } else {
            System.out.println("Error: N debe estar entre 1 y 50.");
        }
        scanner.close();
    }
}
