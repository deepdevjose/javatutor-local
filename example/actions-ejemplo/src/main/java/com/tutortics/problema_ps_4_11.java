package com.tutortics;
// src/problema_ps_4_11.java

import java.util.Scanner;

public class problema_ps_4_11 {

    /**
     * Busca una ciudad en un arreglo de cadenas usando una búsqueda lineal.
     * La búsqueda no distingue entre mayúsculas y minúsculas.
     *
     * @param ciudades El arreglo de nombres de ciudades.
     * @param ciu La ciudad a buscar.
     * @return true si la ciudad se encuentra en el arreglo, false en caso contrario.
     */
    public static boolean buscarCiudad(String[] ciudades, String ciu) {
        if (ciudades == null || ciu == null) {
            return false;
        }

        for (String ciudadEnArreglo : ciudades) {
            // Usamos equalsIgnoreCase para que "Paris" sea igual a "paris"
            if (ciudadEnArreglo.equalsIgnoreCase(ciu)) {
                return true; // Se encontró la ciudad, terminamos la búsqueda.
            }
        }

        // Si el bucle termina, significa que no se encontró la ciudad.
        return false;
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de ciudades (N) [1-1000]:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        if (n >= 1 && n <= 1000) {
            String[] listaCiudades = new String[n];
            System.out.println("Ingrese los nombres de las " + n + " ciudades:");
            for (int i = 0; i < n; i++) {
                listaCiudades[i] = scanner.nextLine();
            }

            System.out.println("\nIngrese el nombre de la ciudad a buscar (CIU):");
            String ciudadBuscada = scanner.nextLine();

            boolean encontrada = buscarCiudad(listaCiudades, ciudadBuscada);

            System.out.println("=========================================");
            if (encontrada) {
                System.out.println("La ciudad '" + ciudadBuscada + "' SÍ se encuentra en el arreglo.");
            } else {
                System.out.println("La ciudad '" + ciudadBuscada + "' NO se encuentra en el arreglo.");
            }
            System.out.println("=========================================");

        } else {
            System.out.println("Error: N debe estar entre 1 y 1000.");
        }
        scanner.close();
    }
}
