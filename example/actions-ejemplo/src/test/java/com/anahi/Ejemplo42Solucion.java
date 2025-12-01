package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo 4.2 — Solución completa
 * Lee 70 sueldos, calcula el promedio y cuenta cuántos superan el promedio.
 */
public class Ejemplo42Solucion {

    public static double promedio(double suma, int n) {
        return n > 0 ? suma / n : 0.0;
    }

    public static int contarMayoresQue(double[] sueldos, double prom) {
        int c = 0;
        for (double s : sueldos) {
            if (s > prom) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Ejemplo 4.2 (Solución) ==");
        final int N = 70;
        double[] sueldos = new double[N];

        double ac = 0.0;
        for (int i = 0; i < N; i++) {
            System.out.printf("S%d: ", (i+1));
            sueldos[i] = sc.nextDouble();
            ac += sueldos[i];
        }

        double prom = promedio(ac, N);
        int cont = contarMayoresQue(sueldos, prom);

        System.out.printf("PROM = %.2f  CONT = %d%n", prom, cont);
        sc.close();
    }
}
