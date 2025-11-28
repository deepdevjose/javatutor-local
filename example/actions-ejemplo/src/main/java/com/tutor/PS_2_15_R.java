package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código realiza operaciones aritméticas básicas,
 * con toda la lógica en el método main.
 */
public class PS_2_15_R { // El nombre del archivo debe ser PS_2_15R.java

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer operando: ");
        double oper1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo operando: ");
        double oper2 = scanner.nextDouble();

        System.out.print("Ingrese la clave de la operación (+, -, *, /): ");
        char clave = scanner.next().charAt(0);

        double resultado;

        System.out.println("Clave ingresada: " + clave);

        if (clave == '+') {
            resultado = oper1 + oper2;
            System.out.println("Resultado: " + resultado);
        } else if (clave == '-') {
            resultado = oper1 - oper2;
            System.out.println("Resultado: " + resultado);
        } else if (clave == '*') {
            resultado = oper1 * oper2;
            System.out.println("Resultado: " + resultado);
        } else if (clave == '/') {
            if (oper2 == 0) {
                System.out.println("Error: División por cero no permitida.");
            } else {
                resultado = oper1 / oper2;
                System.out.println("Resultado: " + resultado);
            }
        } else {
            System.out.println("Error: Clave de operación inválida.");
        }
        scanner.close();
    }
}
    