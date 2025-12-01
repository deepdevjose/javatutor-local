package com.asatutor;

import java.util.Scanner;

/**
 * Pide al usuario un arreglo de números y un valor a eliminar.
 * Luego, elimina la primera aparición del valor y muestra el arreglo resultante.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_5_1_Ejemplo_4_4_Elimina_Desordenado {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];

        // 2. Pedir el tamaño y los elementos del arreglo.
        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int n = sc.nextInt();

        System.out.println("Ingrese los " + n + " elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 3. Pedir el elemento a eliminar.
        System.out.print("Ingrese el elemento a eliminar (X): ");
        int x = sc.nextInt();

        // 4. Buscar el elemento.
        int i = 0;
        boolean encontrado = false;
        while (i < n && !encontrado) {
            if (a[i] == x) encontrado = true;
            else i++;
        }

        // 5. Si se encontró, eliminarlo desplazando los demás elementos.
        if (encontrado) {
            n--; // Se reduce el tamaño lógico del arreglo.
            for (int k = i; k < n; k++) {
                a[k] = a[k + 1];
            }
            System.out.println("Elemento eliminado. Arreglo resultante:");
        } else {
            System.out.println("Elemento no encontrado. El arreglo no ha cambiado:");
        }
        // 6. Mostrar el arreglo final.
        for (int k = 0; k < n; k++) System.out.print(a[k] + " ");
        System.out.println();
        sc.close();
    }
}