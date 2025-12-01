package com.asatutor;

import java.util.Scanner;

/**
 * Determina si una matriz cuadrada es un "cuadrado mágico".
 * Un cuadrado es mágico si la suma de cada fila, cada columna y ambas
 * diagonales principales es la misma.
 * Esta es una versión simplificada para principiantes.
 */
public class P14_13_ps_4_28 {
    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir el tamaño y los elementos de la matriz.
        System.out.print("Introduce el tamaño de la matriz cuadrada (N): ");
        int N = scanner.nextInt();

        int[][] A = new int[N][N];

        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // 3. Calcular la suma de referencia (la primera fila).
        int sumaReferencia = 0;
        for (int j = 0; j < N; j++) {
            sumaReferencia += A[0][j];
        }

        // 4. Verificar las sumas usando una bandera.
        boolean esMagico = true;

        // Verificar el resto de las filas.
        for (int i = 1; i < N; i++) {
            int sumaFila = 0;
            for (int j = 0; j < N; j++) {
                sumaFila += A[i][j];
            }
            if (sumaFila != sumaReferencia) {
                esMagico = false;
            }
        }

        // Verificar las columnas.
        for (int j = 0; j < N; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < N; i++) {
                sumaColumna += A[i][j];
            }
            if (sumaColumna != sumaReferencia) {
                esMagico = false;
            }
        }

        // Verificar la diagonal principal (esquina superior izq a inferior der).
        int sumaDiagonal1 = 0;
        for (int i = 0; i < N; i++) {
            sumaDiagonal1 += A[i][i];
        }
        if (sumaDiagonal1 != sumaReferencia) {
            esMagico = false;
        }

        // Verificar la diagonal secundaria (esquina superior der a inferior izq).
        int sumaDiagonal2 = 0;
        for (int i = 0; i < N; i++) {
            sumaDiagonal2 += A[i][N - 1 - i];
        }
        if (sumaDiagonal2 != sumaReferencia) {
            esMagico = false;
        }

        // 5. Imprimir el resultado final basado en la bandera.
        if (esMagico) {
            System.out.println("La matriz es un cuadrado mágico");
        } else {
            System.out.println("La matriz no es un cuadrado mágico");
        }
        scanner.close();
    }
}
