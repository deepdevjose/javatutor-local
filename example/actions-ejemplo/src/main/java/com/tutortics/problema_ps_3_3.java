package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 3.3 - Contar Pares e Impares
 * Dado N números enteros, determina cuántos son pares y cuántos impares.
 * Programación Estructurada: todos los métodos son estáticos.
 */
public class problema_ps_3_3 {

    /**
     * Clase para almacenar el resultado del conteo de pares e impares.
     */
    public static class ResultadoConteo {
        public int pares;
        public int impares;
        
        public ResultadoConteo(int pares, int impares) {
            this.pares = pares;
            this.impares = impares;
        }
    }

    /**
     * Cuenta cuántos números en el arreglo son pares y cuántos son impares.
     * 
     * @param numeros Arreglo de números enteros
     * @param n Cantidad de números a procesar
     * @return Objeto ResultadoConteo con pares e impares
     */
    public static ResultadoConteo contarParesImpares(int[] numeros, int n) {
        int pares = 0;     // PARES ← 0
        int impares = 0;   // IMPARES ← 0
        
        // I ← 1, mientras I ≤ N
        for (int i = 0; i < n; i++) {
            int num = numeros[i];  // Leer NUM
            
            if (num % 2 == 0) {  // Si NUM % 2 = 0
                pares = pares + 1;  // PARES ← PARES + 1
            } else {
                impares = impares + 1;  // IMPARES ← IMPARES + 1
            }
            // I ← I + 1 (automático en el for)
        }
        
        return new ResultadoConteo(pares, impares);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Contador de Números Pares e Impares");
        System.out.println("========================================");
        
        // Lectura de N
        System.out.print("¿Cuántos números desea ingresar? N = ");
        int n = scanner.nextInt();

        // Leer los N números
        int[] numeros = new int[n];
        System.out.println("\nIngrese los " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar pares e impares
        ResultadoConteo resultado = contarParesImpares(numeros, n);

        // Mostrar resultados
        System.out.println("\n========================================");
        System.out.println("Resultados:");
        System.out.println("Números PARES: " + resultado.pares);
        System.out.println("Números IMPARES: " + resultado.impares);
        System.out.println("========================================");

        scanner.close();
    }
}
