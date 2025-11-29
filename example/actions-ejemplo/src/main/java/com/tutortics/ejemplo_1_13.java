package com.tutortics;
// src/ejemplo_1.13.java

import java.util.Scanner;

public class ejemplo_1_13 {

    /**
     * Calcula el promedio de cinco calificaciones.
     *
     * @param cal1 Calificación 1
     * @param cal2 Calificación 2
     * @param cal3 Calificación 3
     * @param cal4 Calificación 4
     * @param cal5 Calificación 5
     * @return El promedio de las cinco calificaciones.
     */
    public double calcularPromedio(double cal1, double cal2, double cal3, double cal4, double cal5) {
        return (cal1 + cal2 + cal3 + cal4 + cal5) / 5.0;
    }

    /**
     * Método principal para leer los datos y mostrar el resultado.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejemplo_1_13 calculator = new ejemplo_1_13();

        // 1. Leer MAT, CAL1, CAL2, CAL3, CAL4, CAL5
        System.out.println("Introduce la matrícula del alumno:");
        int matricula = scanner.nextInt();

        System.out.println("Introduce las 5 calificaciones:");
        double cal1 = scanner.nextDouble();
        double cal2 = scanner.nextDouble();
        double cal3 = scanner.nextDouble();
        double cal4 = scanner.nextDouble();
        double cal5 = scanner.nextDouble();

        // 2. Hacer PRO ← (CAL1 + CAL2 + CAL3 + CAL4 + CAL5) / 5
        double promedio = calculator.calcularPromedio(cal1, cal2, cal3, cal4, cal5);

        // 3. Escribir MAT, PRO
        System.out.println("======================================");
        System.out.println("Matrícula del Alumno: " + matricula);
        System.out.println("Promedio de Calificaciones: " + promedio);
        System.out.println("======================================");
        
        scanner.close();
    }
}
