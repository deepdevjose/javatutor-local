package com.example;

import java.util.Scanner;

/**
 *
 * @author Chema
 */
public class PS_4_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de renglones (M) del arreglo A: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el numero de columnas (N) del arreglo A: ");
        int n = scanner.nextInt();

        double[] B = new double[n];

        // Leer los valores del arreglo B
        System.out.println("Ingrese los valores del arreglo B:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor B[" + (i + 1) + "]: ");
            B[i] = scanner.nextDouble();
        }
        scanner.close(); // Cerrar el scanner

        // --- Llamada al método de lógica ---
        double[][] A = generarArregloA(m, n, B);

        // Imprimir el arreglo A
        System.out.println("El arreglo A es:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(); // Salto de línea para el siguiente renglón
        }
    }

    /**
     * Genera la matriz A[m][n] basado en el vector B[n].
     * Esta es la función que probaremos.
     *
     * @param m Renglones de A
     * @param n Columnas de A (y tamaño de B)
     * @param B El vector de entrada
     * @return La matriz A generada
     */
    public static double[][] generarArregloA(int m, int n, double[] B) {
        double[][] A = new double[m][n];

        // Asignar valores a A según los criterios
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    A[i][j] = B[j];
                } else {
                    // i > j
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}