package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * PS 1.5 — Solución completa
 * Calcula MF con tasa mensual en porcentaje: MF = MD + (MD * TASA / 100)
 */
public class Ps15Solucion {

    public static double montoFinal(double md, double tasa) {
        return md + (md * tasa / 100.0);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== PS 1.5 (Solución) ==");
        System.out.print("Ingresa MD (monto): ");
        double md = sc.nextDouble();

        System.out.print("Ingresa TASA (mensual, %): ");
        double tasa = sc.nextDouble();

        double mf = montoFinal(md, tasa);
        System.out.printf("MF = %.2f%n", mf);
        sc.close();
    }
}
