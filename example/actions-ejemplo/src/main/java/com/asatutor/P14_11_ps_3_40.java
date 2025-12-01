package com.asatutor;

import java.util.*;

/**
 * Pide datos de varios elementos y analiza cuáles son los mejores y peores
 * conductores eléctricos y térmicos.
 * Esta es una versión simplificada para principiantes.
 */
public class P14_11_ps_3_40 {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner scanner = new Scanner(System.in);
        final int MAX_ELEMENTOS = 50;
        String[] nombres = new String[MAX_ELEMENTOS];
        double[] condElectrica = new double[MAX_ELEMENTOS];
        double[] condTermica = new double[MAX_ELEMENTOS];
        int n = 0; // Número actual de elementos

        System.out.println("--- Ingrese los datos de los elementos ---");
        String nombreElemento;
        do {
            System.out.print("Ingrese el nombre del elemento (o 'NN' para finalizar): ");
            nombreElemento = scanner.nextLine();

            if (!nombreElemento.equalsIgnoreCase("NN") && n < MAX_ELEMENTOS) {
                System.out.print("Ingrese la conductividad electrica: ");
                condElectrica[n] = scanner.nextDouble();
                System.out.print("Ingrese la conductividad termica: ");
                condTermica[n] = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer del scanner
                nombres[n] = nombreElemento;
                n++;
            }
        } while (!nombreElemento.equalsIgnoreCase("NN"));

        if (n > 0) {
            // 2. Encontrar los mejores y peores conductores.
            // Inicializamos con los valores del primer elemento.
            double maxElec = condElectrica[0], minElec = condElectrica[0];
            double maxTerm = condTermica[0], minTerm = condTermica[0];
            String nombreMaxElec = nombres[0], nombreMinElec = nombres[0];
            String nombreMaxTerm = nombres[0], nombreMinTerm = nombres[0];

            // Empezamos el bucle desde el segundo elemento (índice 1).
            for (int i = 1; i < n; i++) {
                // Eléctrica
                if (condElectrica[i] > maxElec) {
                    maxElec = condElectrica[i];
                    nombreMaxElec = nombres[i];
                }
                if (condElectrica[i] < minElec) {
                    minElec = condElectrica[i];
                    nombreMinElec = nombres[i];
                }
                // Térmica
                if (condTermica[i] > maxTerm) {
                    maxTerm = condTermica[i];
                    nombreMaxTerm = nombres[i];
                }
                if (condTermica[i] < minTerm) {
                    minTerm = condTermica[i];
                    nombreMinTerm = nombres[i];
                }
            }

            // 3. Imprimir los resultados.
            System.out.println("\n--- Resultados del Análisis de Conductividad ---");
            System.out.println("Mejor conductor eléctrico: " + nombreMaxElec);
            System.out.println("Peor conductor eléctrico: " + nombreMinElec);
            System.out.println("Mejor conductor térmico: " + nombreMaxTerm);
            System.out.println("Peor conductor térmico: " + nombreMinTerm);
        } else {
            System.out.println("No se ingresaron elementos para analizar.");
        }

        scanner.close();
    }
}