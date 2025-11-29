package com.tutortics;
// src/problema_ps_3_39.java

import java.util.Scanner;

public class problema_ps_3_39 {

    /**
     * Función auxiliar para calcular el factorial de un número.
     * Usa 'long' para manejar números más grandes que 'int'.
     * @param n El número del cual se calculará el factorial.
     * @return El factorial de n.
     */
    public static long factorial(int n) {
        if (n < 0) {
            return 0; // Factorial de negativos no está definido, retornamos 0.
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Calcula F(X, Y, Z) basado en las condiciones del problema PS 3.39.
     * @return El resultado del cálculo como un 'double'.
     */
    public static double calcularF(int x, int y, int z) {
        // Primero, se evalúa la condición más específica.
        if (x > 0 && y > 0 && z > 0) {
            // F = Z! / Y!
            return (double) factorial(z) / factorial(y);
        } 
        // Si la anterior no se cumple, se evalúa la siguiente condición.
        else if (x > 0) {
            // F = X! (El producto de i=1 hasta X es X!)
            return factorial(x);
        } 
        // Si ninguna de las anteriores se cumple.
        else {
            // F = 1
            return 1.0;
        }
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de veces que se calculará la función (K):");
        int k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            System.out.println("\n--- Cálculo #" + i + " ---");
            System.out.print("Ingrese el valor de X: ");
            int x = scanner.nextInt();
            System.out.print("Ingrese el valor de Y: ");
            int y = scanner.nextInt();
            System.out.print("Ingrese el valor de Z: ");
            int z = scanner.nextInt();

            double resultado = calcularF(x, y, z);
            System.out.printf("El resultado de F(%d, %d, %d) es: %.4f%n", x, y, z, resultado);
        }
        
        scanner.close();
    }
}
