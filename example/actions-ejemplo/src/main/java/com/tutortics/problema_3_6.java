package com.tutortics;
// src/problema_3.6.java

import java.util.Scanner;
import java.util.Arrays;

public class problema_3_6 {

    /**
     * Encuentra el número mayor y menor en un arreglo de enteros.
     *
     * @param numeros El arreglo de números a procesar.
     * @return Un arreglo de dos enteros donde la posición 0 es el MAYOR y la 1 es el MENOR.
     * Retorna null si el arreglo de entrada es nulo o está vacío.
     */
    public int[] encontrarMayorMenor(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return null; // No se puede procesar un arreglo vacío
        }

        int mayor = Integer.MIN_VALUE; // Inicializa con el valor más pequeño posible
        int menor = Integer.MAX_VALUE; // Inicializa con el valor más grande posible

        // Estructura Repetitiva (Ciclo)
        for (int num : numeros) {
            // ¿NUM > MAY?
            if (num > mayor) {
                mayor = num;
            }
            // ¿NUM < MEN?
            if (num < menor) {
                menor = num;
            }
        }

        return new int[]{mayor, menor};
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problema_3_6 buscador = new problema_3_6();

        System.out.println("Introduce la cantidad de números a ingresar (N):");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, introduce un número positivo.");
        } else {
            int[] numerosIngresados = new int[n];
            System.out.println("Introduce los " + n + " números:");
            for (int i = 0; i < n; i++) {
                numerosIngresados[i] = scanner.nextInt();
            }

            int[] resultado = buscador.encontrarMayorMenor(numerosIngresados);

            if (resultado != null) {
                System.out.println("===================================");
                System.out.println("El número MAYOR es: " + resultado[0]);
                System.out.println("El número MENOR es: " + resultado[1]);
                System.out.println("===================================");
            }
        }
        scanner.close();
    }
}
