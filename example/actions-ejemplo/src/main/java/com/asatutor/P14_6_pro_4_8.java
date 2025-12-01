package com.asatutor;

import java.util.Scanner;

/**
 * Pide las calificaciones de un grupo de alumnos y calcula estadísticas sobre ellas.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_6_pro_4_8 {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0;
        int reprobados = 0;
        int mayoresA8 = 0;
        double sumaCalificaciones = 0;

        // 2. Pedir el número de alumnos.
        System.out.print("Introduce el número de alumnos del grupo: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // 3. Bucle para pedir la calificación de cada alumno.
            for (int i = 0; i < n; i++) {
                System.out.print("Introduce la calificación del alumno #" + (i + 1) + ": ");
                int cal = scanner.nextInt();

                // 4. Actualizar estadísticas en cada iteración.
                sumaCalificaciones += cal;

                if (cal > 6) {
                    aprobados++;
                } else {
                    reprobados++;
                }

                if (cal > 8) {
                    mayoresA8++;
                }
            }

            // 5. Calcular los resultados finales.
            double promedio = sumaCalificaciones / n;
            double porcAprobados = ((double) aprobados / n) * 100;
            double porcReprobados = ((double) reprobados / n) * 100;

            // 6. Imprimir el reporte final.
            System.out.println("\n--- Reporte de Calificaciones ---");
            System.out.printf("Promedio general: %.2f\n", promedio);
            System.out.println("Alumnos aprobados (>6): " + aprobados);
            System.out.println("Alumnos reprobados (<=6): " + reprobados);
            System.out.printf("Porcentaje de aprobados: %.2f%%\n", porcAprobados);
            System.out.printf("Porcentaje de reprobados: %.2f%%\n", porcReprobados);
            System.out.println("Alumnos con calificación mayor a 8: " + mayoresA8);
        } else {
            System.out.println("No hay alumnos para procesar.");
        }
        scanner.close();
    }
}