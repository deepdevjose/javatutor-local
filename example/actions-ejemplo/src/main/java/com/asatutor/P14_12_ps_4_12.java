package com.asatutor;

import java.util.Scanner;
/**
 * Analiza los registros de ventas de 8 modelos de productos para
 * calcular totales por modelo, por día y encontrar el modelo más vendido.
 * Esta es una versión simplificada para principiantes.
 */
public class P14_12_ps_4_12 {

    public static void main(String[] args) {
        // 1. Datos iniciales y herramientas.
        double[] precios = { 10.0, 15.0, 12.5, 8.75, 9.5, 11.25, 14.0, 13.5 };
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir la cantidad de ventas a registrar.
        System.out.print("Introduce el número de registros de venta a procesar: ");
        int numVentas = scanner.nextInt();

        if (numVentas > 0) {
            // Arreglos para guardar los datos de cada venta.
            int[] dias = new int[numVentas];
            int[] modelos = new int[numVentas];
            int[] cantidades = new int[numVentas];

            // 3. Leer los datos de cada venta.
            System.out.println("--- Introduce los datos de cada venta (Día Modelo Cantidad) ---");
            for (int i = 0; i < numVentas; i++) {
                System.out.print("Registro #" + (i + 1) + ": ");
                dias[i] = scanner.nextInt();
                modelos[i] = scanner.nextInt();
                cantidades[i] = scanner.nextInt();
            }

            // 4. Calcular el total recaudado por modelo.
            double[] recaudadoPorModelo = new double[8];
            for (int i = 0; i < numVentas; i++) {
                int modelo = modelos[i] - 1; // Ajustar para índice de arreglo (0-7)
                int cantidad = cantidades[i];
                if (modelo >= 0 && modelo < 8) {
                    recaudadoPorModelo[modelo] += cantidad * precios[modelo];
                }
            }

            // 5. Calcular el total recaudado por día (asumiendo 30 días máximo).
            double[] recaudadoPorDia = new double[30];
            for (int i = 0; i < numVentas; i++) {
                int dia = dias[i] - 1; // Ajustar para índice de arreglo (0-29)
                int modelo = modelos[i] - 1;
                int cantidad = cantidades[i];
                if (dia >= 0 && dia < 30 && modelo >= 0 && modelo < 8) {
                    recaudadoPorDia[dia] += cantidad * precios[modelo];
                }
            }

            // 6. Encontrar el modelo que generó más dinero.
            int modeloMasVendido = 0;
            double maxRecaudado = 0;
            for (int i = 0; i < 8; i++) {
                if (recaudadoPorModelo[i] > maxRecaudado) {
                    maxRecaudado = recaudadoPorModelo[i];
                    modeloMasVendido = i + 1; // Guardar el número del modelo (1-8)
                }
            }

            // 7. Imprimir los resultados.
            System.out.println("\n--- Reporte de Ventas ---");
            System.out.println("Total recaudado por modelo:");
            for (int i = 0; i < 8; i++) {
                System.out.printf("Modelo %d: $%.2f\n", (i + 1), recaudadoPorModelo[i]);
            }

            System.out.println("\nTotal recaudado por día:");
            for (int i = 0; i < 30; i++) {
                if (recaudadoPorDia[i] > 0) { // Solo mostrar días con ventas
                    System.out.printf("Día %d: $%.2f\n", (i + 1), recaudadoPorDia[i]);
                }
            }

            System.out.println("\nEl modelo que más dinero produjo fue el modelo " + modeloMasVendido);
        } else {
            System.out.println("No hay ventas para procesar.");
        }
        scanner.close();
    }
}
