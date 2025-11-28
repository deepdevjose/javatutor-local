package com.example;


import java.util.ArrayList;
import java.util.Scanner; // Importa esto

/**
 * @author DELL
 */
public class Ejemplo_3_4 {

    /**
     * Este es tu método main original.
     * Sirve para ejecutar el programa manualmente.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumGas = 0;

        System.out.println("Ingrese los gastos (ingrese -1 para finalizar):");
        double gasto = sc.nextDouble();

        while (gasto != -1) {
            sumGas += gasto;
            System.out.println("Ingrese los gastos (ingrese -1 para finalizar):");
            gasto = sc.nextDouble();
        }

        System.out.println("El total de gastos del viaje es: " + sumGas);
    }

    /**
     * ESTE ES EL MÉTODO QUE EL TEST NECESITA.
     * Toma una lista de gastos y devuelve el total.
     * Añade este método a tu clase.
     */
    public double calcularTotalGastos(ArrayList<Double> gastos) {
        double total = 0.0;
        // Este bucle suma todos los elementos de la lista que recibe
        for (double gasto : gastos) {
            total += gasto;
        }
        return total;
    }
}