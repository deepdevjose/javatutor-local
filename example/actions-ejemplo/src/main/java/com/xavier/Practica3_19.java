package com.xavier;

import java.util.Scanner;

/**
 * Práctica 3.19 - Potencia sin multiplicación (solo sumas repetidas)
 *
 * Instrucciones para el alumno:
 * --------------------------------------------------------
 * 1. Implementar base^exp sin usar Math.pow ni el operador * 
 *    para multiplicar directamente.
 * 2. Debe usarse SUMA repetida para simular la multiplicación.
 * 3. Si exp == 0 debe retornar 1.
 * 4. Tanto base como exp serán enteros (exp >= 0).
 */
public class Practica3_19 {

    /**
     * Calcula base^exponente usando solo sumas repetidas.
     *
     * @param base número entero
     * @param exp exponente entero >= 0
     * @return resultado de base^exp
     */
    public static int powNoMul(int base, int exp) {

        // TODO: si exp es 0, retornar 1

        // TODO: inicializar el resultado como la base (primer "producto")

        // TODO: usar un ciclo externo para repetir la multiplicación exp - 1 veces

        // TODO dentro del ciclo: usar sumas repetidas para "multiplicar":
        //     suma = resultado + resultado + ... (base veces)

        // TODO: retornar el resultado final

        return 0; // <-- cambiar por el valor correcto cuando el alumno lo implemente
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entradas
        System.out.print("Ingrese la base entera: ");
        int base = sc.nextInt();

        System.out.print("Ingrese el exponente (entero >= 0): ");
        int exp = sc.nextInt();

        // TODO: llamar a powNoMul y mostrar el resultado real
        // System.out.println("Resultado: " + ...);

        sc.close();
    }
}
