package com.asatutor;

import java.util.Scanner;
/**
 * Pide al usuario un arreglo ORDENADO y un valor a insertar.
 * Luego, inserta el valor en su posición correcta si no existe y hay espacio.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_5_3_Ejemplo_4_4_Inserta_Ordenado {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100]; // Capacidad máxima

        // 2. Pedir datos iniciales.
        System.out.print("Ingrese la cantidad de elementos iniciales (N < 100): ");
        int n = sc.nextInt();

        if (n >= 100) {
            System.out.println("El arreglo ya está lleno.");
        } else {
            System.out.println("Ingrese los " + n + " elementos del arreglo (ordenados):");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.print("Ingrese el elemento a insertar (X): ");
            int x = sc.nextInt();
            
            // 3. Encontrar la posición donde debería ir el elemento.
            int pos = 0;
            while (pos < n && a[pos] < x) {
                pos++;
            }

            // 4. Verificar si el elemento ya existe.
            if (pos < n && a[pos] == x) {
                System.out.println("No se pudo insertar el elemento (ya existe).");
                // Imprimir arreglo sin cambios
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else {
                // 5. Desplazar los elementos para hacer espacio.
                for (int i = n; i > pos; i--) {
                    a[i] = a[i - 1];
                }

                // 6. Insertar el nuevo elemento y actualizar el tamaño.
                a[pos] = x;
                n++;

                // 7. Mostrar el resultado.
                System.out.println("Elemento insertado exitosamente.");
                System.out.println("Arreglo resultante:");
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}