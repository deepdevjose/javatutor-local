package com.example;

import java.util.Scanner;

public class PS_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        int A = scanner.nextInt();

        System.out.println("Ingrese el valor de B:");
        int B = scanner.nextInt();

        System.out.println("Ingrese el valor de C:");
        int C = scanner.nextInt();

        System.out.println("Ingrese el valor de D:");
        int D = scanner.nextInt();
        scanner.close();

        try {
            int[] resultados = calcularResultados(A, B, C, D);
            System.out.println("El resultado de la expresión (A - C)^2 / D es: " + resultados[0]);
            System.out.println("El resultado de la expresión (A - B)^3 / D es: " + resultados[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int[] calcularResultados(int A, int B, int C, int D) {
        if (D == 0) throw new IllegalArgumentException("D no puede ser igual a 0. No se puede calcular la expresión.");

        int resultado1 = (A - C) * (A - C) / D;
        int resultado2 = (A - B) * (A - B) * (A - B) / D;
        return new int[]{resultado1, resultado2};
    }
}
