package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código sigue la lógica del diagrama de flujo para encontrar
 * y contar números primos menores que M.
 */
public class Problema_3_17_R { // El nombre del archivo debe ser Problema_3_17R.java

    /**
     * El método main contiene toda la lógica del diagrama de flujo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 3;
        int cp = 0;

        System.out.print("Ingrese un número M: ");
        int m = sc.nextInt();

        // Se maneja el 2 como un caso especial, ya que es el único primo par.
        // El bucle principal solo revisará números impares.
        if (m > 2) {
            cp = cp + 1;
            System.out.println("Número Primo: 2");
        }

        while (i < m) {
            boolean band = true;
            int j = 3;
            while (j <= (i / 2) && band) {
                if (i % j == 0) {
                    band = false;
                }
                j = j + 2;
            }

            if (band) {
                System.out.println("Número Primo: " + i);
                cp = cp + 1;
            }
            i = i + 2;
        }

        System.out.println("Total de primos menores que " + m + ": " + cp);

        sc.close();
    }
}