package com.asatutor;

import java.util.Scanner;
/**
 * Pide los sueldos de varios empleados y aplica un aumento del 15%
 * a aquellos que ganan menos de $800.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_9_ps_3_6 {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir el número de empleados.
        System.out.print("Introduce el número de empleados: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("--- Introduce los sueldos ---");
            // 3. Bucle para procesar cada empleado.
            for (int i = 0; i < n; i++) {
                System.out.print("Sueldo del empleado #" + (i + 1) + ": ");
                double sueldo = scanner.nextDouble();

                // 4. Aplicar aumento si es necesario y mostrar el nuevo sueldo.
                if (sueldo < 800) {
                    sueldo = sueldo * 1.15;
                }
                System.out.printf(" -> Nuevo sueldo: $%.2f\n", sueldo);
            }
        } else {
            System.out.println("No hay empleados para procesar.");
        }
        scanner.close();
    }
}