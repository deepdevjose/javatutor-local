package com.xavier;

/**
 * Práctica 3.44 - Simulación del diagrama de flujo 6.3.
 *
 * Instrucciones para el alumno:
 * ---------------------------------------------------------
 * El algoritmo utiliza tres variables:
 *  - I
 *  - P1
 *  - P2
 *
 * Las reglas generales del diagrama:
 *  1. Iniciar I en 0.
 *  2. Mientras I sea menor o igual a N, calcular:
 *         P1 = N - 2 * I
 *         P2 = I
 *  3. Luego, mientras se cumplan dos condiciones:
 *         (P2 + I) <= N
 *         P1 >= P2
 *     imprimir los valores y actualizar P1 y P2.
 *  4. Incrementar I y repetir.
 *
 * Tu tarea es implementar esa lógica siguiendo el diagrama.
 */
public class Practica3_44 {

    /**
     * Ejecuta la simulación con un valor N.
     *
     * @param N número entero mayor que 0
     */
    public static void ejecutar(int N) {

        // TODO: validar que N sea mayor que 0
        //       si no lo es, imprimir "Error: N debe ser mayor que 0." y terminar

        // TODO: inicializar I en 0

        // TODO: crear ciclo WHILE principal:
        //       mientras I <= N:
        //           calcular P1 = N - 2*I
        //           calcular P2 = I
        //
        //           luego crear el ciclo WHILE interno con condiciones:
        //               (P2 + I) <= N
        //               P1 >= P2
        //
        //           dentro del ciclo imprimir:
        //               System.out.println("P1=" + P1 + "  P2=" + P2 + "  I=" + I);
        //
        //           actualizar:
        //               P1--
        //               P2++
        //
        //       al final, incrementar I en 1

    }

    public static void main(String[] args) {
        // TODO: pedir al usuario un entero N y llamar a ejecutar(N)
        // Por ahora dejamos un valor de ejemplo:
        // ejecutar(5);
    }
}
