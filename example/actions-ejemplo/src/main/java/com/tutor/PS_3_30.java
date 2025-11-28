package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_3_30 { // El nombre del archivo debe ser PS_3_30.java
    
    /**
     * TAREA DEL ESTUDIANTE:
     * Completa el método 'main' para resolver el ejercicio. El programa debe:
     * 1. Leer un número entero X.
     * 2. Calcular la serie de Sen(X) dada por:
     * X - X^3/3! + X^5/5! - X^7/7! ...
     * 3. Detenerse cuando el valor absoluto del *próximo* término sea <= 0.01.
     * 4. Imprimir el resultado y el número de términos sumados.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----

        // 1. Pide y lee el valor de X.

        // 2. Inicializa tus variables:
        //    - double senX = 0.0;
        //    - double termino = x; (El primer término es X)
        //    - int numeroTerminos = 0;

        // 3. Escribe un bucle 'do-while'.
        //    Dentro del 'do':
        //    a. Suma el 'termino' actual a 'senX'.
        //    b. Incrementa 'numeroTerminos'.
        //    c. Calcula el *siguiente* término y guárdalo en la variable 'termino'.
        //    La condición del 'while' debe ser: Math.abs(termino) > 0.01

        // 4. Imprime el resultado final (senX) y el número de términos.

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
        scanner.close();
    }
}