package com.asatutor;

import java.util.Scanner;
/**
 * Pide al usuario que inserte números en un arreglo uno por uno.
 * El programa se detiene cuando el usuario lo decide o el arreglo se llena.
 * Esta es una versión simplificada para principiantes con todo en el main.
 */
public class P14_5_4_Ejemplo_4_4_Insertar_Desordenado {

    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5]; // Un arreglo pequeño para probar fácilmente el límite
        int n = 0; // El tamaño actual empieza en 0
        char continuar = 's';

        // 2. Bucle para insertar elementos mientras haya espacio y el usuario quiera.
        while (n < a.length && (continuar == 's' || continuar == 'S')) {
            System.out.print("Ingrese el elemento a insertar: ");
            int y = sc.nextInt();

            // 3. Insertar el elemento en la siguiente posición disponible.
            a[n] = y;
            n++; // Incrementar el tamaño actual.

            System.out.println("Elemento insertado correctamente.");
            System.out.print("Arreglo actual: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

            // 4. Preguntar si desea continuar (solo si aún hay espacio).
            if (n < a.length) {
                System.out.println("\n¿Desea insertar otro elemento? (s/n)");
                continuar = sc.next().charAt(0);
            }
        }
        
        // 5. Mensaje final si el arreglo se llenó.
        if (n >= a.length) {
            System.out.println("No hay más espacio para insertar elementos.");
        }
        
        System.out.println("Proceso finalizado.");
        sc.close();
    }
}