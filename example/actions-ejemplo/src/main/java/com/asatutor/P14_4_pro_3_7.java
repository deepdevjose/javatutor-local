package com.asatutor;

import java.util.Scanner;

/**
 * Pide al usuario una serie de montos de ventas y las clasifica en
 * "chicas", "medianas" y "grandes".
 * Esta es una versión simplificada para principiantes.
 */
public class P14_4_pro_3_7 {

    public static void main(String[] args) {
        // 1. Inicializar herramientas y contadores.
        Scanner teclado = new Scanner(System.in);
        int ventasChicas = 0;
        int ventasMedianas = 0;
        int ventasGrandes = 0;

        // 2. Preguntar al usuario cuántas ventas va a introducir.
        System.out.print("Introduce la cantidad de ventas a procesar: ");
        int cantidadVentas = teclado.nextInt();

        // 3. Usar un bucle 'for' para pedir cada venta una por una.
        // El bucle se repetirá 'cantidadVentas' veces.
        for (int i = 0; i < cantidadVentas; i++) {
            System.out.print("Introduce el monto de la venta #" + (i + 1) + ": ");
            double monto = teclado.nextDouble();

            // 4. Clasificar el monto y aumentar el contador correspondiente.
            if (monto <= 200) {
                ventasChicas++; // Aumenta en 1 el contador de ventas chicas
            } else if (monto < 400) {
                ventasMedianas++; // Aumenta en 1 el contador de ventas medianas
            } else {
                ventasGrandes++; // Aumenta en 1 el contador de ventas grandes
            }
        }

        // 5. Imprimir los resultados finales.
        System.out.println("Resumen de ventas:");
        System.out.println("Ventas chicas (<= 200): " + ventasChicas);
        System.out.println("Ventas medianas (< 400): " + ventasMedianas);
        System.out.println("Ventas grandes (>= 400): " + ventasGrandes);

        // 6. Cerrar la herramienta de lectura.
        teclado.close();
    }
}