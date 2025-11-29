package com.tutortics;
// src/problema_4_7.java

import java.util.Scanner;

public class problema_4_7 {

    /**
     * Realiza una búsqueda binaria en un arreglo de enteros.
     * El método sigue exactamente el algoritmo del diagrama de flujo.
     * Programación Estructurada: método estático sin instanciar objetos.
     *
     * @param vector El arreglo ordenado en el que se buscará (índices 0 a N-1).
     * @param n El número de elementos del arreglo.
     * @param x El elemento a buscar.
     * @return true si el elemento fue encontrado, false en caso contrario.
     */
    public static boolean busquedaBinaria(int[] vector, int n, int x) {
        // Variables según el diagrama de flujo
        int izq = 1;        // IZQ ← 1
        int der = n;        // DER ← N
        int ban = 1;        // BAN ← 1
        int cen;

        // Ciclo principal: IZQ ≤ DER y BAN = 1
        while (izq <= der && ban == 1) {
            // CEN ← (IZQ + DER) DIV 2
            cen = (izq + der) / 2;

            // X = VECTOR[CEN]?
            if (x == vector[cen - 1]) {  // Ajuste de índice (Java usa base 0)
                // BAN ← 0
                ban = 0;
            } else if (x > vector[cen - 1]) {  // X > VECTOR[CEN]?
                // IZQ ← CEN + 1
                izq = cen + 1;
            } else {
                // DER ← CEN - 1
                der = cen - 1;
            }
        }

        // BAN = 1? (Si BAN = 1, no se encontró)
        return ban == 0;  // Retorna true si se encontró (BAN = 0)
    }

    /**
     * Método principal para la interacción con el usuario.
     * Sigue el flujo del diagrama de flujo.
     * Programación Estructurada: todo estático, sin crear objetos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensaje: "Ingrese número de elementos"
        System.out.println("Ingrese número de elementos:");
        int n = scanner.nextInt();

        // Validación: N ≥ 1 y N ≤ 50
        if (n >= 1 && n <= 50) {
            int[] vector = new int[n];
            
            // Ciclo de lectura: I ← 1, mientras I ≤ N
            System.out.println("Ingrese los " + n + " datos (deben estar ordenados):");
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el dato (posición " + i + "): ");
                vector[i - 1] = scanner.nextInt();  // Ajuste de índice
            }

            // Mensaje: "Ingrese el dato a buscar"
            System.out.println("Ingrese el dato a buscar:");
            int x = scanner.nextInt();

            // Ejecutar búsqueda binaria (llamada estática, sin instanciar)
            boolean encontrado = busquedaBinaria(vector, n, x);

            // Mostrar resultado según BAN
            System.out.println("=========================================");
            if (encontrado) {
                System.out.println("El elemento SI está en el arreglo");
            } else {
                System.out.println("El elemento NO está en el arreglo");
            }
            System.out.println("=========================================");

        } else {
            // Error en los datos
            System.out.println("Error en los datos");
        }
        
        scanner.close();
    }
}
