package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo 1.12 — Solución completa
 * Calcula: RES = (A + B)^2 / 3
 * Programación estructurada (Java 21).
 */
public class Ejemplo112Solucion {

    /** Calcula RES = (A + B)^2 / 3 */
    public static double calcular(double a, double b) {
        double suma = a + b;
        return (suma * suma) / 3.0;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Ejemplo 1.12 (Solución) ==");
        System.out.println("Calcula RES = (A + B)^2 / 3");

        System.out.print("Ingresa A: ");
        double a = sc.nextDouble();

        System.out.print("Ingresa B: ");
        double b = sc.nextDouble();

        double res = calcular(a, b);
        System.out.printf("RES = %.6f%n", res);
        sc.close();
    }
}
