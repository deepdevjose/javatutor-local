package com.programa;

import java.util.Scanner;

public class ps_3_22 {

    public double calcularPromedio(double c1, double c2, double c3, double c4, double c5) {
        return (c1 + c2 + c3 + c4 + c5) / 5.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ps_3_22 pa = new ps_3_22();
        final int TOTAL_ALUMNOS = 35; // O 3 para probar

        for (int i = 1; i <= TOTAL_ALUMNOS; i++) {
            System.out.println("\n--- Alumno " + i + " ---");
            System.out.print("Ingrese Matrícula: ");
            int matricula = scanner.nextInt();

            System.out.print("Ingrese Calificación 1: ");
            double cal1 = scanner.nextDouble();
            System.out.print("Ingrese Calificación 2: ");
            double cal2 = scanner.nextDouble();
            System.out.print("Ingrese Calificación 3: ");
            double cal3 = scanner.nextDouble();
            System.out.print("Ingrese Calificación 4: ");
            double cal4 = scanner.nextDouble();
            System.out.print("Ingrese Calificación 5: ");
            double cal5 = scanner.nextDouble();

            double promedio = pa.calcularPromedio(cal1, cal2, cal3, cal4, cal5);
            System.out.printf("-> Matrícula: %d, Promedio: %.2f\n", matricula, promedio);
        }
        scanner.close();
    }
}