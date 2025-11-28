package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código analiza la producción de N fábricas,
 * con toda la lógica en el método main.
 */
public class PS_4_22_R { // El nombre del archivo debe ser PS_4_22R.java

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de fábricas (N): ");
        int N = scanner.nextInt();

        int[] clavesFabricas = new int[N];
        double[][] produccionFabricas = new double[N][12];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la clave de la fábrica " + (i + 1) + ": ");
            clavesFabricas[i] = scanner.nextInt();
            System.out.println("Ingrese la producción de los 12 meses para la fábrica " + clavesFabricas[i] + ":");
            for (int j = 0; j < 12; j++) {
                produccionFabricas[i][j] = scanner.nextDouble();
            }
        }

        // Inciso (a): Fábrica con mayor producción anual
        double maxProduccion = -1.0;
        int claveMax = -1;
        for (int i = 0; i < N; i++) {
            double sumaAnual = 0.0;
            for (int j = 0; j < 12; j++) {
                sumaAnual += produccionFabricas[i][j];
            }
            if (sumaAnual > maxProduccion) {
                maxProduccion = sumaAnual;
                claveMax = clavesFabricas[i];
            }
        }
        System.out.println("\n--- Inciso (a): Fábrica con Mayor Producción Anual ---");
        System.out.println("La fábrica con mayor producción fue: " + claveMax);
        System.out.println("Producción total anual: " + maxProduccion);

        // Inciso (b): Fábricas con producción > 150,000 en un mes
        System.out.print("\nIngrese el mes a consultar (1-12) para el inciso (b): ");
        int mesConsulta = scanner.nextInt();
        System.out.println("--- Inciso (b): Fábricas con producción > 150,000 en el mes " + mesConsulta + " ---");
        int mesIndice = mesConsulta - 1;
        boolean encontradas = false;
        if (mesIndice >= 0 && mesIndice < 12) {
            for (int i = 0; i < N; i++) {
                if (produccionFabricas[i][mesIndice] > 150000) {
                    System.out.println("Fábrica clave: " + clavesFabricas[i]);
                    encontradas = true;
                }
            }
        }
        if (!encontradas) {
            System.out.println("Ninguna fábrica superó los 150,000 en ese mes.");
        }
        scanner.close();
    }
}