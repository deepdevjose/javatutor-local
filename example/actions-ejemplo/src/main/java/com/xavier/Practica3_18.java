package com.xavier;

import java.util.Scanner;

/**
 * Práctica 3.18 - Potencia sin Math.pow
 *
 * Instrucciones para el alumno:
 * --------------------------------------------------------
 * 1. Implementar un método que calcule base^exp usando un ciclo.
 * 2. No usar Math.pow.
 * 3. El exponente exp será un entero mayor o igual que 0.
 * 4. Si exp == 0, la función debe devolver 1.
 */
public class Practica3_18 {

    /**
     * Método que debe calcular base^exp sin Math.pow.
     *
     * @param base número real
     * @param exp exponente entero (>= 0)
     * @return base elevada a exp
     */
    public static double powNoPow(double base, int exp) {

        // TODO: si exp es 0, retornar 1

        // TODO: declarar una variable acumuladora, iniciarla en 1
        // double resultado = 1.0;

        // TODO: usar un ciclo for para multiplicar la base exp veces
        // for (...) { ... }

        // TODO: retornar el resultado

        return 0; // <-- cambiar por el resultado real
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese el exponente (entero >= 0): ");
        int exp = sc.nextInt();

        // TODO: llamar al método powNoPow y mostrar el resultado
        // System.out.println("Resultado: " + ...);

        sc.close();
    }
}
