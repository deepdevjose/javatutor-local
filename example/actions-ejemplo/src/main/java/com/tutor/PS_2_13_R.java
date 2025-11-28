package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO: Este código identifica el mayor de tres números,
 * con toda la lógica en el método main.
 */
public class PS_2_13_R { // El nombre del archivo debe ser PS_2_13R.java

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el numero B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el numero C: ");
        double C = scanner.nextDouble();
        
        double mayor;
        if (A > B && A > C) {
            mayor = A;
        } else if (B > C) {
            mayor = B;
        } else {
            mayor = C;
        }
        
        System.out.println("El numero mayor es: " + mayor);
        
        scanner.close();
    }
}