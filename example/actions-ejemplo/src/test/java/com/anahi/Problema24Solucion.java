package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema 2.4 — Solución completa
 * Dado MAT y 5 calificaciones, calcula el promedio y determina si está aprobado.
 */
public class Problema24Solucion {

    /** Calcula el promedio de 5 calificaciones */
    public static double promedio(double c1, double c2, double c3, double c4, double c5) {
        return (c1 + c2 + c3 + c4 + c5) / 5.0;
    }

    /** Devuelve "aprobado" si promedio >= 6; en otro caso "no aprobado" */
    public static String estado(double promedio) {
        return promedio >= 6.0 ? "aprobado" : "no aprobado";
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Problema 2.4 (Solución) ==");
        System.out.print("Ingresa MAT (entero): ");
        int mat = sc.nextInt();

        System.out.println("Ingresa 5 calificaciones (reales):");
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double c3 = sc.nextDouble();
        double c4 = sc.nextDouble();
        double c5 = sc.nextDouble();

        double pro = promedio(c1, c2, c3, c4, c5);
        String texto = estado(pro);

        System.out.printf("MAT=%d  PRO=%.2f  %s%n", mat, pro, texto);
        sc.close();
    }
}
