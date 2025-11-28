package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código determina un deporte basado en la temperatura,
 * con toda la lógica en el método main.
 */
public class PS_2_12_R { // El nombre del archivo debe ser PS_2_12R.java

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double temperatura = scanner.nextDouble();

        String deporte;
        if (temperatura > 85) {
            deporte = "Natación";
        } else if (temperatura > 70) {
            deporte = "Tenis";
        } else if (temperatura > 32) {
            deporte = "Golf";
        } else if (temperatura > 10) {
            deporte = "Esquí";
        } else {
            deporte = "Marcha";
        }

        System.out.println("Deporte apropiado: " + deporte);
        
        scanner.close();
    }
}