package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * PS 2.21 — Solución completa
 *
 * Calcula el pago aplicando el descuento según la categoría.
 * 1 = 35%, 2 = 22%, 3 = 15%, 4 = 5%, >4 = 0%
 */
public class Ps221Solucion {

    public static double calcularPago(double monto, int cate) {
        double desc;
        switch (cate) {
            case 1 -> desc = 35.0;
            case 2 -> desc = 22.0;
            case 3 -> desc = 15.0;
            case 4 -> desc = 5.0;
            default -> desc = 0.0;
        }
        return monto - (monto * desc / 100.0);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== PS 2.21 (Solución) ==");
        System.out.print("Ingresa categoría (1-4): ");
        int cate = sc.nextInt();

        System.out.print("Ingresa monto: ");
        double monto = sc.nextDouble();

        double pago = calcularPago(monto, cate);
        System.out.printf("PAGO = %.2f%n", pago);
        sc.close();
    }
}
