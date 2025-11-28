package com.tutor; // O tu paquete específico

import java.util.Arrays; // Importamos Arrays para imprimir fácilmente
/**
 * REFRACTORIZADO
 * Este código genera los primeros 30 números primos y los almacena en un arreglo.
 */
public class Problema_4_4_R { // El nombre del archivo debe ser Problema_4_4R.java

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        final int CANTIDAD_PRIMOS = 30;
        int[] primos = new int[CANTIDAD_PRIMOS];

        if (CANTIDAD_PRIMOS > 0) {
            primos[0] = 2; // El primer primo es 2
        }

        int conteo = 1; // Ya tenemos un primo (el 2)
        int num = 3;    // Empezamos a probar desde el siguiente número impar

        while (conteo < CANTIDAD_PRIMOS) {
            boolean esPrimo = true;
            // Para verificar si 'num' es primo, probamos divisores hasta su raíz cuadrada
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    esPrimo = false;
                    break; // Si encontramos un divisor, no es primo, salimos del bucle
                }
            }

            if (esPrimo) {
                primos[conteo] = num;
                conteo++;
            }
            num += 2; // Solo probamos los siguientes números impares
        }

        System.out.println("Los primeros " + CANTIDAD_PRIMOS + " números primos son:");
        System.out.println(Arrays.toString(primos));
    }
}