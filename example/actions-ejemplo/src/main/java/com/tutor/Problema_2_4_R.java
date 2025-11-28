package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class Problema_2_4_R { // El nombre del archivo debe ser Problema_2_4_R.java

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la matrícula del alumno: ");
        int MAT = scanner.nextInt();

        System.out.print("Ingrese la primera calificación: ");
        double c1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda calificación: ");
        double c2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera calificación: ");
        double c3 = scanner.nextDouble();
        System.out.print("Ingrese la cuarta calificación: ");
        double c4 = scanner.nextDouble();
        System.out.print("Ingrese la quinta calificación: ");
        double c5 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (c1 + c2 + c3 + c4 + c5) / 5.0;

        // Determinar el estado
        String estado;
        if (promedio >= 6) {
            estado = "Aprobado";
        } else {
            estado = "No Aprobado";
        }

        // Imprimir resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Matrícula: " + MAT);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + estado);

        scanner.close(); // Cerrar el scanner
    }
}
    