package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 3.1 - Suma de N Primeros Números Naturales
 * Calcula la suma: 1 + 2 + 3 + ... + N
 * Programación Estructurada: todos los métodos son estáticos.
 */
public class problema_ps_3_1 {

    /**
     * Calcula la suma de los N primeros números naturales usando un ciclo.
     * 
     * @param n Cantidad de números a sumar
     * @return La suma de 1 + 2 + 3 + ... + N
     */
    public static int calcularSuma(int n) {
        int suma = 0;  // SUMA ← 0
        
        // I ← 1, mientras I ≤ N
        for (int i = 1; i <= n; i++) {
            suma = suma + i;  // SUMA ← SUMA + I
            // I ← I + 1 (automático en el for)
        }
        
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de N
        System.out.print("Ingrese el valor de N: ");
        int n = scanner.nextInt();

        // Calcular la suma: SUMA ← 0, I ← 1, ciclo mientras I ≤ N
        int suma = calcularSuma(n);

        // Imprimir SUMA
        System.out.println("\n========================================");
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
        System.out.println("========================================");

        scanner.close();
    }
}
