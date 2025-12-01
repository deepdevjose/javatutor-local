package com.asatutor;

import java.util.Scanner;
/**
 * Calcula el plan de pagos para un vehículo.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_8_ps_1_7 {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir el precio del vehículo.
        System.out.print("Introduce el precio del vehículo: ");
        double precioVehiculo = scanner.nextDouble();

        if (precioVehiculo > 0) {
            // 3. Calcular el enganche y las mensualidades.
            double enganche = precioVehiculo * 0.35;
            double resto = precioVehiculo - enganche;
            double mensualidad = resto / 36.0;

            // 4. Mostrar el plan de pagos.
            System.out.println("\n--- Plan de Pagos ---");
            System.out.printf("Enganche (35%%): $%.2f\n", enganche);
            System.out.printf("Pago mensual (36 meses): $%.2f\n", mensualidad);
        } else {
            System.out.println("El precio del vehículo debe ser mayor a cero.");
        }

        scanner.close();
    }}
