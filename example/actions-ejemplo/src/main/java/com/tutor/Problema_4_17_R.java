package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código calcula la matriz transpuesta.
 * La lógica está separada en métodos para poder ser probada.
 */
public class Problema_4_17_R { // El nombre del archivo debe ser Problema_4_17R.java

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese numero de filas (M): ");
        int M = scanner.nextInt();
        System.out.print("Ingrese numero de columnas (N): ");
        int N = scanner.nextInt();

        boolean dimensionesValidas = (M >= 1 && M <= 50 && N >= 1 && N <= 30);

        if (dimensionesValidas) {
            int[][] A = new int[M][N]; // Matriz original

            System.out.println("Ingrese elementos de la matriz:");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("Ingrese elemento (" + (i + 1) + "," + (j + 1) + "): ");
                    A[i][j] = scanner.nextInt();
                }
            }

            // Calcular la transpuesta
            int[][] TA = new int[N][M];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    TA[j][i] = A[i][j];
                }
            }

            System.out.println("Matriz traspuesta:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(TA[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error en los datos (M debe estar entre 1-50, N entre 1-30)");
        }

        scanner.close();
    }
}