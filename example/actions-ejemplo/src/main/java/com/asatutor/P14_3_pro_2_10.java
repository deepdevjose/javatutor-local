package com.asatutor;

import java.util.Scanner;

/**
 * Pide tres números al usuario e identifica cuál es el mayor o si son iguales.
 * Esta es una versión simplificada para principiantes.
 */
public class P14_3_pro_2_10 {

    public static void main(String[] args) {
        // 1. Crear una herramienta (Scanner) para leer lo que el usuario escribe.
        Scanner teclado = new Scanner(System.in);

        // 2. Pedir y leer los tres números.
        System.out.print("Introduce el primer número (A): ");
        double a = teclado.nextDouble();
        System.out.print("Introduce el segundo número (B): ");
        double b = teclado.nextDouble();
        System.out.print("Introduce el tercer número (C): ");
        double c = teclado.nextDouble();

        // 3. Comparar los números para encontrar el mayor.
        if (a == b && b == c) {
            System.out.println("A, B y C son iguales.");
        } else if (a >= b && a >= c) {
            if (a == b) {
                System.out.println("A y B son los mayores.");
            } else if (a == c) {
                System.out.println("A y C son los mayores.");
            } else {
                System.out.println("A es el mayor.");
            }
        } else if (b >= a && b >= c) {
            if (b == c) {
                System.out.println("B y C son los mayores.");
            } else {
                System.out.println("B es el mayor.");
            }
        } else {
            System.out.println("C es el mayor.");
        }

        // 4. Cerrar la herramienta de lectura.
        teclado.close();
    }
}