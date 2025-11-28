package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código calcula la serie de Sen(X) con toda la lógica en el método main.
 */
public class PS_3_30_R { // El nombre del archivo debe ser PS_3_30R.java

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de X (entero en radianes): ");
        int x = scanner.nextInt();

        double x_rad = (double) x;
        double senX = 0.0;
        double termino = x_rad; // El primer término es X
        int numeroTerminos = 0;

        // Usamos un bucle do-while para asegurar que al menos el primer término se sume
        // y que la condición se verifique *antes* de sumar el siguiente término.
        do {
            // 1. Sumar el término actual
            senX += termino;
            numeroTerminos++;

            // 2. Calcular el siguiente término de forma eficiente a partir del anterior.
            // La fórmula es: termino_nuevo = termino_anterior * (-x^2) / ( (2k) * (2k+1) )
            // donde k es el número de término que acabamos de sumar.
            termino *= -(x_rad * x_rad) / ((2 * numeroTerminos) * (2 * numeroTerminos + 1));

        } while (Math.abs(termino) > 0.01); // El bucle se detiene si el *nuevo* término es <= 0.01

        System.out.println("SEN(X) ≈ " + senX);
        System.out.println("Número de términos requeridos: " + numeroTerminos);

        scanner.close();
    }
}