package com.tutor;

import java.util.Scanner;

public class Ejemplo_2_1_R {

    /**
     * Solución para Ejemplo 2.1.
     * Dado como dato la calificación de un alumno en un examen,
     * escribe "Aprobado" si la calificación es mayor a 8.
     */
    public static void main(String[] args) {
        // 1. Crear un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);
        
        // 2. Solicitar la calificación.
        System.out.print("Ingrese la calificación: ");
        double calificacion = scanner.nextDouble();
        
        // 3. Evaluar la condición e imprimir si es necesario.
        if (calificacion > 8) {
            System.out.println("Aprobado");
        }
        
        // 4. Cerrar el scanner para liberar recursos.
        scanner.close();
    }
}