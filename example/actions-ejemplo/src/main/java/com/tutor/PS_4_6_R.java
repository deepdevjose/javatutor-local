package com.tutor; // O tu paquete específico

import java.math.BigInteger;
import java.util.Arrays; // Importamos Arrays para imprimir fácilmente

/**
 * REFRACTORIZADO
 * Este código genera los primeros 'n' números Fibonacci.
 * La lógica está separada en un método para poder ser probada.
 */
public class PS_4_6_R { // El nombre del archivo debe ser PS_4_6R.java

    /**
     * MÉTODO REFACTORIZADO: Esta es la lógica que vamos a probar.
     * Genera un arreglo con los primeros 'n' números Fibonacci.
     *
     * @param n La cantidad de números Fibonacci a generar (ej. 100).
     * @return Un arreglo de BigInteger[] con los 'n' primeros números.
     */
    public BigInteger[] generarFibonacci(int n) {
        if (n <= 0) {
            return new BigInteger[0]; // Devolver arreglo vacío si n es 0 o negativo
        }

        BigInteger[] fibonacci = new BigInteger[n];

        // Manejar el caso base n=1
        if (n >= 1) {
            fibonacci[0] = BigInteger.ZERO; // F(0) = 0
        }
        // Manejar el caso base n=2
        if (n >= 2) {
            fibonacci[1] = BigInteger.ONE; // F(1) = 1
        }

        // Bucle para calcular el resto (desde el 3er elemento, índice 2)
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        return fibonacci; // Devolver el arreglo lleno
    }

    /**
     * El método main ahora solo maneja la entrada/salida
     * y llama al método de lógica.
     */
    public static void main(String[] args) {
        PS_4_6_R ejercicio = new PS_4_6_R(); // Instancia de la clase
        int cantidad = 100;

        // Llamamos al método lógico
        BigInteger[] primerosCienFibonacci = ejercicio.generarFibonacci(cantidad);

        // Imprimimos los resultados
        System.out.println("Los primeros " + cantidad + " números Fibonacci son:");
        // Usamos Arrays.toString para una impresión limpia del arreglo
        System.out.println(Arrays.toString(primerosCienFibonacci));
    }
}