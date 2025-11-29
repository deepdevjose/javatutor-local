package com.tutortics;

import java.util.Scanner;

/**
 * Problema PS 1.6 - Plan de Financiamiento Automotriz
 * Calcula el enganche (35%) y las mensualidades (resto / 18) de un vehículo.
 * Programación Estructurada: todos los métodos son estáticos.
 */
public class problema_ps_1_6 {

    /**
     * Calcula el enganche del vehículo (35% del monto total).
     * 
     * @param mon Monto total del vehículo
     * @return Enganche a pagar
     */
    public static double calcularEnganche(double mon) {
        // ENG ← MON * 0.35
        return mon * 0.35;
    }

    /**
     * Calcula la mensualidad (resto después del enganche / 18 meses).
     * 
     * @param mon Monto total del vehículo
     * @param eng Enganche ya pagado
     * @return Mensualidad a pagar
     */
    public static double calcularMensualidad(double mon, double eng) {
        // MEN ← (MON - ENG) / 18
        return (mon - eng) / 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura del monto del vehículo
        System.out.print("Ingrese el precio del vehículo: $");
        double mon = scanner.nextDouble();

        // Calcular enganche: ENG ← MON * 0.35
        double eng = calcularEnganche(mon);

        // Calcular mensualidad: MEN ← (MON - ENG) / 18
        double men = calcularMensualidad(mon, eng);

        // Mostrar resultados: ENG, MEN
        System.out.println("\n========================================");
        System.out.println("PLAN DE FINANCIAMIENTO XGW");
        System.out.println("========================================");
        System.out.printf("Precio del vehículo: $%.2f%n", mon);
        System.out.printf("Enganche (35%%):     $%.2f%n", eng);
        System.out.printf("Mensualidad (18):    $%.2f%n", men);
        System.out.println("========================================");

        scanner.close();
    }
}
