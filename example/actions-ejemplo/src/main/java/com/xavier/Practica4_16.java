package com.xavier;

import java.util.Scanner;

/**
 * Práctica 4.16 - Mostrar la diagonal principal de una matriz cuadrada A[N][N].
 *
 * Instrucciones para el alumno:
 * -------------------------------------------------------------
 * Dada una matriz cuadrada A de tamaño N x N, se debe imprimir
 * la diagonal principal, es decir:
 *
 *   A[0][0], A[1][1], A[2][2], ..., A[N-1][N-1]
 *
 * El alumno debe implementar este comportamiento siguiendo el
 * diagrama correspondiente del libro.
 */
public class Practica4_16 {

    /**
     * Imprime la diagonal principal de la matriz A.
     * El test unitario llama a este método.
     */
    public static void imprimirDiagonal(double[][] A, int N) {

        // TODO: imprimir el texto "Diagonal principal de la matriz:"
        // TODO: recorrer desde i = 0 hasta N-1
        // TODO: imprimir A[i][i] seguido de un espacio
        // TODO: al final imprimir un salto de línea

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: pedir al usuario el valor de N (1 < N < 50)
        // TODO: validar N en un ciclo do-while

        // TODO: crear la matriz A[N][N]

        // TODO: solicitar al usuario cada uno de los valores de la matriz

        // TODO: llamar al método imprimirDiagonal(A, N)

        sc.close();
    }
}
