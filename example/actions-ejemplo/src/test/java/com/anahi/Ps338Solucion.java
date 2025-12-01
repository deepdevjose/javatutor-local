package com.anahi.soluciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * PS 3.38 — Solución completa
 * Maneja facturación por día con 7 platillos (1..7) hasta K = -1.
 */
public class Ps338Solucion {

    public static double totalFactura(double[] precios, int[] claves, int[] cants) {
        double total = 0.0;
        for (int i = 0; i < claves.length; i++) {
            int clave = claves[i];
            int cant = cants[i];
            if (clave < 1 || clave > 7) {
                // si la clave es inválida, la ignoramos (o podría lanzarse error según el profe)
                continue;
            }
            total += precios[clave] * cant;
        }
        return total;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== PS 3.38 (Solución) ==");

        // a) Precios P1..P7
        double[] precios = new double[8]; // 1..7
        for (int i = 1; i <= 7; i++) {
            System.out.print("Precio P" + i + ": ");
            precios[i] = sc.nextDouble();
        }

        double totalDia = 0.0;
        int folio = 1;

        while (true) {
            System.out.print("K (número de conceptos, -1 para terminar): ");
            int K = sc.nextInt();
            if (K == -1) break;
            if (K <= 0) {
                System.out.println("K debe ser > 0 (o -1 para terminar).");
                continue;
            }

            int[] claves = new int[K];
            int[] cants = new int[K];

            for (int i = 0; i < K; i++) {
                System.out.print("CLAVE (1..7) del concepto " + (i+1) + ": ");
                claves[i] = sc.nextInt();
                System.out.print("CANT del concepto " + (i+1) + ": ");
                cants[i] = sc.nextInt();
            }

            double total = totalFactura(precios, claves, cants);

            // Impresión (formato simple de factura)
            System.out.println("FACTURA NUMERO: " + folio);
            System.out.println("CLAVE	CANT	PRECIO UNIT	PRECIO TOTAL");
            for (int i = 0; i < K; i++) {
                int clave = claves[i];
                int cant = cants[i];
                double unit = (clave >= 1 && clave <= 7) ? precios[clave] : 0.0;
                double line = unit * cant;
                System.out.printf("%d	%d	%.2f		%.2f%n", clave, cant, unit, line);
            }
            System.out.printf("TOTAL A PAGAR: %.2f%n", total);
            System.out.println();

            totalDia += total;
            folio++;
        }

        System.out.printf("VENTA TOTAL DEL DÍA = %.2f%n", totalDia);
        sc.close();
    }
}
