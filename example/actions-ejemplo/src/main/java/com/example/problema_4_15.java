package com.example;

import java.util.Scanner;

/**
 *
 * @author imac28
 */
public class problema_4_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de años (M): ");
        int M = scanner.nextInt();

        System.out.print("Ingrese el número de sucursales (N): ");
        int N = scanner.nextInt();

        // Evitar que N o M sea 0 para no causar errores en los métodos
        if (M <= 0 || N <= 0) {
            System.out.println("Debe ingresar al menos 1 año y 1 sucursal.");
            scanner.close();
            return;
        }

        double[][] MONTO = new double[M][N];

        // Leer los montos de ventas por año y sucursal
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese el monto de ventas del año " + (i + 1) + " en la sucursal " + (j + 1) + ": ");
                MONTO[i][j] = scanner.nextDouble();
            }
        }
        scanner.close(); // Buena práctica cerrar el scanner

        // Obtener la sucursal que más ha vendido en los M años
        int sucursalMasVendida = obtenerSucursalMasVendida(MONTO);

        // Obtener el promedio de ventas por año
        double[] promediosAnuales = calcularPromedioVentasAnuales(MONTO);

        // Obtener el año con mayor promedio de ventas
        int añoMayorPromedioVentas = obtenerAñoMayorPromedioVentas(promediosAnuales);

        System.out.println("\nInformación de ventas:");
        System.out.println("Sucursal que más ha vendido en los M años: Sucursal " + sucursalMasVendida);
        System.out.println("Promedio de ventas por año:");
        for (int i = 0; i < M; i++) {
            // Usamos printf para formatear los decimales
            System.out.printf("Año " + (i + 1) + ": %.2f%n", promediosAnuales[i]);
        }
        System.out.println("Año con mayor promedio de ventas: Año " + añoMayorPromedioVentas);
    }

    /**
     * Método para obtener la sucursal que más ha vendido en los M años.
     * CORREGIDO: Inicializa maxVentas con el total de la primera sucursal
     * para manejar correctamente valores negativos.
     */
    static int obtenerSucursalMasVendida(double[][] montos) {
        // 1. Calcular el total de la primera sucursal (j=0) para usarlo como máximo inicial
        double maxVentas = 0;
        for (int i = 0; i < montos.length; i++) {
            maxVentas += montos[i][0];
        }
        int sucursalMasVendida = 1; // La sucursal 1 es la máxima por ahora

        // 2. Empezar el bucle desde la SEGUNDA sucursal (j=1)
        for (int j = 1; j < montos[0].length; j++) {
            double totalVentas = 0;
            for (int i = 0; i < montos.length; i++) {
                totalVentas += montos[i][j];
            }
            
            // 3. Comparar con el máximo actual
            if (totalVentas > maxVentas) {
                maxVentas = totalVentas;
                sucursalMasVendida = j + 1; // j+1 porque las sucursales son 1-indexadas
            }
        }

        return sucursalMasVendida;
    }

    /**
     * Método para calcular el promedio de ventas por año.
     * (Esta lógica estaba correcta).
     */
    static double[] calcularPromedioVentasAnuales(double[][] montos) {
        double[] promediosAnuales = new double[montos.length];

        for (int i = 0; i < montos.length; i++) {
            double totalVentas = 0;
            for (int j = 0; j < montos[i].length; j++) {
                totalVentas += montos[i][j];
            }
            // Evitar división por cero si el array de sucursales estuviera vacío (aunque N > 0 lo previene)
            if (montos[i].length > 0) {
                promediosAnuales[i] = totalVentas / montos[i].length;
            } else {
                promediosAnuales[i] = 0; // O NaN, dependiendo de la lógica de negocio
            }
        }

        return promediosAnuales;
    }

    /**
     * Método para obtener el año con mayor promedio de ventas.
     * CORREGIDO: Inicializa maxPromedioVentas con el valor del primer año
     * para manejar correctamente valores negativos.
     */
    static int obtenerAñoMayorPromedioVentas(double[] promediosAnuales) {
        // 1. Usar el primer año (i=0) como máximo inicial
        // (Asumimos que promediosAnuales siempre tendrá al menos 1 elemento)
        int añoMayorPromedioVentas = 1; // Año 1 es el máximo por ahora
        double maxPromedioVentas = promediosAnuales[0];

        // 2. Empezar el bucle desde el SEGUNDO año (i=1)
        for (int i = 1; i < promediosAnuales.length; i++) {
            
            // 3. Comparar con el máximo actual
            if (promediosAnuales[i] > maxPromedioVentas) {
                maxPromedioVentas = promediosAnuales[i];
                añoMayorPromedioVentas = i + 1; // i+1 porque los años son 1-indexados
            }
        }

        return añoMayorPromedioVentas;
    }
}