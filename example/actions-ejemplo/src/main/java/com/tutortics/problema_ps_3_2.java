package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 3.2 - Promedio de Calificaciones
 * Calcula el promedio de calificaciones usando centinela -1 para indicar fin de datos.
 * Programación Estructurada: todos los métodos son estáticos.
 */
public class problema_ps_3_2 {

    /**
     * Calcula el promedio de un arreglo de calificaciones.
     * El arreglo debe terminar con el valor -1 que indica fin de datos.
     * 
     * @param calificaciones Arreglo con las calificaciones y -1 al final
     * @return El promedio de las calificaciones (excluyendo el -1)
     */
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;  // SUMA ← 0
        int contador = 0;  // CONTADOR ← 0
        
        // Procesar cada calificación hasta encontrar -1
        for (double cal : calificaciones) {
            if (cal == -1) {  // Si CAL = -1
                break;  // Salir del ciclo
            }
            suma = suma + cal;  // SUMA ← SUMA + CAL
            contador = contador + 1;  // CONTADOR ← CONTADOR + 1
        }
        
        // PROMEDIO ← SUMA / CONTADOR
        if (contador > 0) {
            return suma / contador;
        } else {
            return 0.0;  // Sin calificaciones válidas
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Cálculo de Promedio de Calificaciones");
        System.out.println("========================================");
        System.out.println("Ingrese las calificaciones (ingrese -1 para terminar):");

        // Usar una lista para almacenar calificaciones
        java.util.ArrayList<Double> listaCals = new java.util.ArrayList<>();
        
        while (true) {
            System.out.print("Calificación: ");
            double cal = scanner.nextDouble();
            listaCals.add(cal);
            
            if (cal == -1) {
                break;
            }
        }

        // Convertir a arreglo
        double[] calificaciones = new double[listaCals.size()];
        for (int i = 0; i < listaCals.size(); i++) {
            calificaciones[i] = listaCals.get(i);
        }

        // Calcular promedio
        double promedio = calcularPromedio(calificaciones);

        // Mostrar resultado
        System.out.println("\n========================================");
        System.out.printf("El promedio de calificaciones es: %.2f%n", promedio);
        System.out.println("========================================");

        scanner.close();
    }
}
