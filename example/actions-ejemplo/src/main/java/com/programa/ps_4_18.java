package com.programa;

import java.util.Arrays;
import java.util.Scanner;

public class ps_4_18 {

    // Lógica separada
    public int[][] generarIdentidad(int n) {
        if (n <= 0) return new int[0][0];

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ps_4_18 mi = new ps_4_18();

        System.out.print("Ingrese la dimensión N de la matriz: ");
        int n = scanner.nextInt();

        if (n < 1 || n > 50) {
            System.out.println("Dimensión fuera de rango.");
        } else {
            int[][] matriz = mi.generarIdentidad(n);
            
            System.out.println("--- Matriz Identidad Generada ---");
            for (int[] row : matriz) {
                System.out.println(Arrays.toString(row));
            }
        }
        scanner.close();
    }
}