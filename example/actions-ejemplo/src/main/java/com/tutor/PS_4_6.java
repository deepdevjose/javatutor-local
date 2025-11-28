package com.tutor; // O tu paquete específico

import java.math.BigInteger;
import java.util.Arrays; // Importamos Arrays para imprimir

public class PS_4_6 { // El nombre del archivo debe ser PS_4_6.java

    /**
     * TAREA DEL ESTUDIANTE: Completa el método 'main' para resolver el ejercicio.
     * El programa debe:
     * 1. Almacenar los primeros 100 números Fibonacci en un arreglo.
     * 2. Imprimir el arreglo al final.
     * IMPORTANTE: Debes usar 'BigInteger' ya que los números crecen mucho.
     */
    public static void main(String[] args) {
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----

        // 1. Define la cantidad y crea el arreglo de BigInteger.
        final int CANTIDAD = 100;
        BigInteger[] fibonacci = new BigInteger[CANTIDAD];

        // 2. Asigna los casos base:
        //    fibonacci[0] = BigInteger.ZERO;
        //    fibonacci[1] = BigInteger.ONE;

        // 3. Usa un bucle 'for' (desde i=2) para calcular el resto.
        //    Pista: usa el método .add() de BigInteger (ej. num1.add(num2)).

        // 4. Al final, imprime el arreglo usando Arrays.toString().

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
    }
}