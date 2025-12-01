package com.anahi.soluciones;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo 4.12 — Solución completa
 * Selección directa (Selection Sort) con validación 1 ≤ N ≤ 50.
 */
public class Ejemplo412Solucion {

    public static void swap(int[] v, int i, int j) {
        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }

    public static int indiceMenorDesde(int[] v, int from, int n) {
        int k = from;
        for (int j = from + 1; j < n; j++) {
            if (v[j] < v[k]) k = j;
        }
        return k;
    }

    public static void seleccion(int[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            int k = indiceMenorDesde(v, i, n);
            if (k != i) swap(v, i, k);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("== Ejemplo 4.12 (Solución) ==");
        System.out.print("Ingrese N (1..50): ");
        int N = sc.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("Error en los datos");
            sc.close();
            return;
        }

        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("VECTOR[" + (i+1) + "]: ");
            vector[i] = sc.nextInt();
        }

        seleccion(vector, N);
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(vector));
        sc.close();
    }
}
