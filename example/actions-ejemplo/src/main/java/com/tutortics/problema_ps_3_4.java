package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 3.4 - Tabla de Multiplicar
 * Genera la tabla de multiplicar de un número K desde 1 hasta 10.
 * Programación Estructurada: todos los métodos son estáticos.
 */
public class problema_ps_3_4 {

    /**
     * Genera la tabla de multiplicar de K del 1 al 10.
     * 
     * @param k El número base para la tabla de multiplicar
     * @return Arreglo de enteros con los resultados (K×1, K×2, ..., K×10)
     */
    public static int[] generarTablaMultiplicar(int k) {
        int[] tabla = new int[10];  // Arreglo para almacenar los 10 resultados
        
        // I ← 1, mientras I ≤ 10
        for (int i = 1; i <= 10; i++) {
            int resultado = k * i;  // RESULTADO ← K × I
            tabla[i - 1] = resultado;  // Guardar en el arreglo (índice 0-based)
            // I ← I + 1 (automático en el for)
        }
        
        return tabla;
    }

    /**
     * Imprime la tabla de multiplicar de K.
     * 
     * @param k El número base
     */
    public static void imprimirTablaMultiplicar(int k) {
        System.out.println("\n========================================");
        System.out.println("Tabla de multiplicar del " + k);
        System.out.println("========================================");
        
        // I ← 1, mientras I ≤ 10
        for (int i = 1; i <= 10; i++) {
            int resultado = k * i;  // RESULTADO ← K × I
            System.out.printf("%d × %d = %d%n", k, i, resultado);
            // I ← I + 1 (automático en el for)
        }
        
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Generador de Tabla de Multiplicar");
        System.out.println("========================================");
        
        // Lectura de K
        System.out.print("Ingrese el número K: ");
        int k = scanner.nextInt();

        // Imprimir la tabla de multiplicar
        imprimirTablaMultiplicar(k);

        scanner.close();
    }
}
