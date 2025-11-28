package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class Problema_3_1_R { // El nombre del archivo debe ser Problema_3_1R.java

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Leer la cantidad de números a procesar desde la entrada.
        System.out.print("¿Cuántos números va a ingresar? ");
        int cantidadNumeros = scanner.nextInt();
        
        long sumaImpares = 0;
        long sumaPares = 0;
        int conteoPares = 0;

        System.out.println("Ingrese " + cantidadNumeros + " números enteros:");

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // 2. Añadir la condición para ignorar el 0, como en el diagrama.
            if (numero != 0) {
                if (numero % 2 == 0) {
                    sumaPares += numero;
                    conteoPares++;
                } else {
                    sumaImpares += numero;
                }
            }
        }

        double promedioPares = 0.0;
        if (conteoPares > 0) {
            promedioPares = (double) sumaPares / conteoPares;
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma de impares: " + sumaImpares);
        // Formateamos el promedio a 3 decimales para una salida consistente.
        System.out.printf("Promedio de pares: %.3f\n", promedioPares);

        scanner.close();
    }
}