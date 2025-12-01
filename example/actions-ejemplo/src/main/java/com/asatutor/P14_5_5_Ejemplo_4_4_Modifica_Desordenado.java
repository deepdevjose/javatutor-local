package com.asatutor;

import java.util.Scanner;
/**
 * Pide al usuario un arreglo de números, un valor a buscar y un nuevo valor.
 * Luego, reemplaza la primera aparición del valor buscado por el nuevo valor.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_5_5_Ejemplo_4_4_Modifica_Desordenado {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];

        // 2. Pedir el tamaño del arreglo.
        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int n = sc.nextInt();

        if (n > 0) {
            // 3. Pedir los elementos del arreglo.
            System.out.println("Ingrese los " + n + " elementos del arreglo:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // 4. Pedir el valor a buscar y el nuevo valor.
            System.out.print("Ingrese el elemento a modificar (X): ");
            int x = sc.nextInt();
            
            System.out.print("Ingrese el nuevo valor (Y): ");
            int y = sc.nextInt();

            // 5. Buscar y modificar el elemento.
            boolean encontrado = false;
            for (int i = 0; i < n && !encontrado; i++) {
                if (a[i] == x) {
                    a[i] = y; // Reemplazar el valor.
                    encontrado = true; // Marcar como encontrado para salir del bucle.
                }
            }

            // 6. Mostrar el resultado.
            if (encontrado) {
                System.out.println("Arreglo modificado:");
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("El elemento " + x + " no está en el arreglo.");
            }
        } else {
            System.out.println("El arreglo está vacío.");
        }
        sc.close();
    }
}