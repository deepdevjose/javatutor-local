package com.tutor; // O tu paquete específico

import java.util.Scanner;
 
public class Problema_3_1 {

    /**
     * TAREA DEL ESTUDIANTE:
     * Completa el método 'main' para resolver el ejercicio.
     * El programa debe:
     * 1. Leer 270 números enteros.
     * 2. Calcular la suma de los números impares.
     * 3. Calcular el promedio de los números pares.
     * 4. Imprimir ambos resultados.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----
        
        // 1. Define la cantidad de números a leer.
        final int CANTIDAD_NUMEROS = 270;
        
        // 2. Declara e inicializa tus variables para acumular sumas y conteos.
        //    (sumaImpares, sumaPares, conteoPares)

        // 3. Escribe un bucle 'for' que se repita CANTIDAD_NUMEROS veces.
        //    Dentro del bucle:
        //    a. Lee un número.
        //    b. Usa 'if (numero % 2 == 0)' para saber si es par o impar.
        //    c. Actualiza tus acumuladores.

        // 4. Después del bucle, calcula el promedio de los pares.
        //    ¡Cuidado con la división por cero si no hubo números pares!

        // 5. Imprime la suma de impares y el promedio de pares.
        //    Pista: Para formatear el promedio a 3 decimales, puedes usar System.out.printf("Promedio de pares: %.3f\n", tuVariableDePromedio);

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
        scanner.close();
    }
}