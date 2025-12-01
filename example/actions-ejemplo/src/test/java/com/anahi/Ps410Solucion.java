package com.anahi.soluciones;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * PS 4.10 — Solución completa
 * Inserción/Eliminación en arreglo ORDENADO (ascendente).
 */
public class Ps410Solucion {

    public static int insertarOrdenado(int[] a, int n, int x) {
        if (n >= a.length) return n; // sin espacio
        int pos = n;
        // encontrar posición donde insertar (primer >= x)
        int i = 0;
        while (i < n && a[i] < x) i++;
        pos = i;
        // desplazar a la derecha
        for (int j = n; j > pos; j--) a[j] = a[j-1];
        a[pos] = x;
        return n + 1;
    }

    public static int eliminarValor(int[] a, int n, int x) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) { pos = i; break; }
        }
        if (pos == -1) return n; // no existe
        for (int j = pos; j < n-1; j++) a[j] = a[j+1];
        return n - 1;
    }

    public static void mostrar(int[] a, int n) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, n)));
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== PS 4.10 (Solución) ==");
        System.out.print("N (1..100): ");
        int N = sc.nextInt();
        if (N < 1 || N > 100) { System.out.println("Error en N"); sc.close(); return; }

        int[] arre = new int[100];
        System.out.println("Introduce el arreglo ORDENADO ascendente:");
        for (int i = 0; i < N; i++) arre[i] = sc.nextInt();

        int opcion;
        do {
            System.out.println("\n1) Insertar  2) Eliminar  3) Mostrar  4) Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Valor a insertar: ");
                    int x = sc.nextInt();
                    N = insertarOrdenado(arre, N, x);
                }
                case 2 -> {
                    System.out.print("Valor a eliminar: ");
                    int x = sc.nextInt();
                    N = eliminarValor(arre, N, x);
                }
                case 3 -> mostrar(arre, N);
                case 4 -> System.out.println("Fin.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
