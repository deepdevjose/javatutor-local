package com.programa;

import java.util.Arrays;


public class problema_4_13 {

    
    public void intercambiar(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        
        int n = matrix.length;
     
        for (int i = 0; i < n / 2; i++) {
        
            for (int j = 0; j < n; j++) {
                int aux = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j]; 
                matrix[n - 1 - i][j] = aux;
            }
        }
    }
    
    public static void main(String[] args) {
        problema_4_13 ir = new problema_4_13();
        int[][] a = {
            {10, 15, 28, 49},
            {68, 115, 36, 15},
            {90, 0, 7, 28},
            {87, 5, 13, 56}
        };

        System.out.println("--- Matriz Original ---");
        printMatrix(a);

        ir.intercambiar(a); // Modifica la matriz 'a'

        System.out.println("\n--- Matriz Modificada ---");
        printMatrix(a);
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}