package com.asatutor;

import java.util.Scanner;

/**
 * Pide un número al usuario y, dependiendo del número,
 * realiza una acción diferente.
 * Esta es una versión simplificada para principiantes.
 */
public class P14_2_ej_2_6 {

    public static void main(String[] args) {
        // 1. Crear una herramienta (Scanner) para leer lo que el usuario escribe.
        Scanner teclado = new Scanner(System.in);

        // 2. Pedir al usuario que introduzca un número selector.
        System.out.print("Introduce un número selector (entero): ");
        int selector = teclado.nextInt();

        // 3. Decidir qué acción realizar usando if-else if-else.
        if (selector == 1 || selector == 2) {
            System.out.println("Realizando acción 1");
        } else if (selector >= 3 && selector <= 5) {
            System.out.println("Realizando acción 2");
        } else {
            System.out.println("Realizando acción 3");
        }

        // 4. Esta acción se realiza siempre, sin importar el selector.
        System.out.println("Realizando acción X");

        // 5. Cerrar la herramienta de lectura.
        teclado.close();
    }
}