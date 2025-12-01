package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema 2.8 — Solución completa
 * Descuentos por tramos sobre el monto de la compra.
 */
public class Problema28Solucion {

    /** Retorna la tasa de descuento según el monto compra */
    public static double descuento(double compra) {
        if (compra < 500) {
            return 0.0;
        } else if (compra <= 1000) {
            return 0.05;
        } else if (compra <= 7000) {
            return 0.11;
        } else if (compra <= 15000) {
            return 0.18;
        } else {
            return 0.25;
        }
    }

    /** Calcula el total a pagar aplicando el descuento */
    public static double pagar(double compra) {
        double tasa = descuento(compra);
        return compra - (compra * tasa);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Problema 2.8 (Solución) ==");
        System.out.print("Ingresa COMPRA: ");
        double compra = sc.nextDouble();

        double total = pagar(compra);
        System.out.printf("PAGAR = %.2f%n", total);
        sc.close();
    }
}
