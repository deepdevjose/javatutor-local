package com.example;

import java.util.Scanner;

/**
 *
 * @author Chema
 */
public class PS_2_4 {

    public static void main(String[] args) {
        // --- PARTE 1: Interacción con el usuario (sin lógica) ---
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del trabajador: $");
        double sueldo = scanner.nextDouble();
        scanner.close();
        
        // --- PARTE 2: Llamada a la lógica pura ---
        double nuevoSueldo = calcularNuevoSueldo(sueldo);
        
        // --- PARTE 3: Mostrar el resultado ---
        System.out.println("El sueldo con el aumento incorporado es: $" + nuevoSueldo);
    }

    /**
     * Calcula el nuevo sueldo basándose en las reglas de aumento.
     * Esta es la lógica que probaremos.
     * * @param sueldo El sueldo actual del trabajador.
     * @return El nuevo sueldo con el aumento incluido.
     */
    public static double calcularNuevoSueldo(double sueldo) {
        double aumento;
        if (sueldo < 1000) {
            aumento = sueldo * 0.15; // Aumento del 15%
        } else {
            aumento = sueldo * 0.12; // Aumento del 12%
        }
        return sueldo + aumento;
    }
}