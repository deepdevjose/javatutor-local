package com.asatutor;

import java.util.Scanner;
/**
 * Calcula el nuevo sueldo de varios empleados y la nómina total,
 * aplicando aumentos basados en rangos de sueldo.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_10_ps_3_7 {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner scanner = new Scanner(System.in);
        double totalNomina = 0;

        // 2. Pedir el número de empleados.
        System.out.print("Introduce el número de empleados: ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            // 3. Bucle para procesar cada empleado.
            for (int i = 0; i < n; i++) {
                System.out.print("Sueldo del empleado #" + (i + 1) + ": ");
                double sueldoActual = scanner.nextDouble();
                double nuevoSueldo;

                // 4. Aplicar aumento condicional.
                if (sueldoActual < 10000) {
                    nuevoSueldo = sueldoActual * 1.10;
                } else if (sueldoActual <= 25000) {
                    nuevoSueldo = sueldoActual * 1.07;
                } else {
                    nuevoSueldo = sueldoActual * 1.08;
                }

                System.out.printf(" -> Nuevo sueldo: $%.2f\n", nuevoSueldo);
                totalNomina += nuevoSueldo; // Acumular para la nómina total.
            }

            // 5. Mostrar el total de la nómina.
            System.out.printf("\nEl total de la nueva nómina es: $%.2f\n", totalNomina);
        } else {
            System.out.println("No hay empleados para procesar.");
        }
        scanner.close();
    }
}