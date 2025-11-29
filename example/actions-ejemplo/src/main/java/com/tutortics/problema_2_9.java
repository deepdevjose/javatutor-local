package com.tutortics;
// src/problema_2.9.java

import java.util.Scanner;

public class problema_2_9 {

    /**
     * Calcula el impuesto según las reglas del Problema 2.9.
     *
     * @param precioBase El precio básico del artículo (PREBAS).
     * @return El impuesto calculado (IMP).
     */
    public double calcularImpuesto(double precioBase) {
        double impuesto;

        if (precioBase > 500) {
            // Los primeros $20 no pagan. Los siguientes $20 pagan 30%. El resto sobre $40 paga 50%.
            impuesto = (20 * 0.30) + (precioBase - 40) * 0.50;
        } else if (precioBase > 40) {
            // Los primeros $20 no pagan. Los siguientes $20 pagan 30%. El resto sobre $40 paga 40%.
            impuesto = (20 * 0.30) + (precioBase - 40) * 0.40;
        } else if (precioBase > 20) {
            // Los primeros $20 no pagan. El resto sobre $20 paga 30%.
            impuesto = (precioBase - 20) * 0.30;
        } else {
            // Menor o igual a $20 no causa impuesto.
            impuesto = 0;
        }

        return impuesto;
    }

    /**
     * Calcula el precio total sumando el precio base y el impuesto.
     *
     * @param precioBase El precio básico del artículo (PREBAS).
     * @return El precio total (PRETOT).
     */
    public double calcularPrecioTotal(double precioBase) {
        double impuesto = calcularImpuesto(precioBase);
        return precioBase + impuesto;
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problema_2_9 calculadora = new problema_2_9();

        System.out.println("Introduce el precio básico del producto:");
        double precioBase = scanner.nextDouble();

        double precioTotal = calculadora.calcularPrecioTotal(precioBase);
        double impuesto = precioTotal - precioBase;

        System.out.println("===================================");
        System.out.printf("Precio Básico (PREBAS): $%.2f%n", precioBase);
        System.out.printf("Impuesto (IMP):         $%.2f%n", impuesto);
        System.out.printf("Precio Total (PRETOT):  $%.2f%n", precioTotal);
        System.out.println("===================================");

        scanner.close();
    }
}
