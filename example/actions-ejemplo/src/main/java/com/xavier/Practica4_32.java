package com.xavier;

/**
 * Práctica 4.32
 * 
 * Instrucciones para el alumno:
 * -------------------------------------------------------------
 * Dadas dos matrices:
 *   - A : matriz de tamaño M x N
 *   - B : matriz de tamaño N x M
 *
 * Se debe calcular una nueva matriz R de tamaño M x N tal que:
 *
 *        R[i][j] = A[i][j] + B[j][i]
 *
 * Es decir, sumar A con la traspuesta de B.
 *
 * El método sumarConTraspuesta(A, B) debe devolver la matriz R.
 *
 * El test unitario ya está preparado para verificar el resultado.
 */
public class Practica4_32 {

    /**
     * Suma A con la traspuesta de B.
     * Debe devolver una matriz M x N.
     */
    public static int[][] sumarConTraspuesta(int[][] A, int[][] B) {

        // TODO: obtener dimensiones M y N a partir de A
        // TODO: crear matriz R de tamaño M x N

        // TODO: recorrer A usando dos ciclos (i y j)
        // TODO: asignar a R[i][j] = A[i][j] + B[j][i]

        // TODO: devolver R
        return null; // <-- cambiar al devolver la matriz correcta
    }

    /**
     * Método auxiliar opcional para imprimir matrices.
     * (No lo usa el test, es solo ilustrativo).
     */
    public static void imprimirMatriz(int[][] M) {
        for (int[] fila : M) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
