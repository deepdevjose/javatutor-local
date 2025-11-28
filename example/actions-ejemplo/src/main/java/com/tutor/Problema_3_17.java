package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class Problema_3_17 { // El nombre del archivo debe ser Problema_3_17.java

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa el método 'main' para resolver el ejercicio siguiendo el diagrama de flujo.
     * El programa debe:
     * 1. Leer un número M.
     * 2. Contar e imprimir los números primos menores que M.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----

        // 1. Declara e inicializa tus variables (I, CP).
        //    I: Variable de tipo entero. Representa la variable de control del ciclo
        //    externo. Se inicializa en 3 porque sabemos por definición que el
        //    número 1 y los números pares (con excepción del 2) no son primos,
        //    y se incrementa de 2 en 2.

        // 2. Lee el número M.

        // 3. Maneja el caso especial para el número 2. Si M > 2, el 2 es el primer primo.
        //    Imprímelo y actualiza tu contador.

        // 4. Escribe el bucle principal (while) para iterar I mientras sea menor que M.

        // 5. Dentro del bucle principal, implementa el bucle interno para verificar si I es primo.
        //    - Inicializa la bandera (BAND) y el divisor (J).
        //    - El bucle interno se repite mientras J <= I/2 y la bandera sea verdadera.
        //    - Dentro, si I % J == 0, cambia la bandera a falso.
        //    - Incrementa J en 2.

        // 6. Después del bucle interno, si la bandera sigue siendo verdadera, imprime I e incrementa CP.

        // 7. Incrementa I en 2 para probar el siguiente número impar.

        // 8. Después del bucle principal, imprime el conteo total de primos.

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
        sc.close();
    }
}