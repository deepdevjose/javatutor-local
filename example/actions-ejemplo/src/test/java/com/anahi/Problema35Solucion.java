package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema 3.5 — Solución completa
 * Dado N enteros, cuenta positivos, promedio de positivos y promedio general.
 */
public class Problema35Solucion {

    public static boolean esPositivo(int num) {
        return num > 0;
    }

    public static double promedio(double suma, int conteo) {
        return conteo > 0 ? (suma / conteo) : 0.0;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Problema 3.5 (Solución) ==");
        System.out.print("Ingresa N: ");
        int N = sc.nextInt();

        int cuepos = 0;
        long sumtot = 0;
        long sumpos = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("NUM" + i + ": ");
            int num = sc.nextInt();
            sumtot += num;
            if (esPositivo(num)) {
                sumpos += num;
                cuepos++;
            }
        }

        double propos = promedio(sumpos, cuepos);
        double promgen = promedio(sumtot, N);

        System.out.printf("CUEPOS=%d  PROPOS=%.2f  PROMGEN=%.2f%n", cuepos, propos, promgen);
        sc.close();
    }
}
