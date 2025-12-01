package com.asatutor;

import java.util.Scanner;

/**
 * Pide al usuario un arreglo de números ORDENADOS y un valor a eliminar.
 * Luego, elimina el valor usando búsqueda binaria y muestra el arreglo resultante.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_5_2_Ejemplo_4_4_Elimina_Ordenado {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];

        // 2. Pedir el tamaño y los elementos del arreglo.
        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int n = sc.nextInt();

        System.out.println("Ingrese los " + n + " elementos del arreglo (deben estar ordenados):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 3. Pedir el elemento a eliminar.
        System.out.print("Ingrese el elemento a eliminar (X): ");
        int x = sc.nextInt();

        // 4. Buscar el elemento usando búsqueda binaria.
        int bajo = 0, alto = n - 1, central = -1, indiceEncontrado = -1;
        boolean encontrado = false;

        while (bajo <= alto && !encontrado) {
            central = (bajo + alto) / 2;
            if (a[central] == x) {
                encontrado = true;
                indiceEncontrado = central;
            } else if (x < a[central]) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }

        // 5. Si se encontró, eliminarlo desplazando los demás elementos.
        if (encontrado) {
            n--; // Se reduce el tamaño lógico del arreglo.
            for (int k = indiceEncontrado; k < n; k++) {
                a[k] = a[k + 1];
            }
            System.out.println("Elemento eliminado. Arreglo resultante:");
        } else {
            System.out.println("Elemento no encontrado. El arreglo no ha cambiado:");
        }

        // 6. Mostrar el arreglo final.
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
        sc.close();
    }
}
