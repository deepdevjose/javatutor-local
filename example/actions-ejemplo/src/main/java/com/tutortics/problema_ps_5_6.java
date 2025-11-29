package com.tutortics;
// src/problema_ps_5_6.java

import java.util.Scanner;

public class problema_ps_5_6 {

    // a) Edad promedio del grupo
    public static double calcularEdadPromedio(Profesor[] personal) {
        if (personal.length == 0) return 0;
        double sumaEdades = 0;
        for (Profesor p : personal) {
            sumaEdades += p.edad;
        }
        return sumaEdades / personal.length;
    }

    // b) Nombre del profesor más joven
    public static String encontrarProfesorMasJoven(Profesor[] personal) {
        if (personal.length == 0) return "N/A";
        Profesor masJoven = personal[0];
        for (int i = 1; i < personal.length; i++) {
            if (personal[i].edad < masJoven.edad) {
                masJoven = personal[i];
            }
        }
        return masJoven.nombre;
    }

    // c) Nombre del profesor de más edad
    public static String encontrarProfesorMasViejo(Profesor[] personal) {
        if (personal.length == 0) return "N/A";
        Profesor masViejo = personal[0];
        for (int i = 1; i < personal.length; i++) {
            if (personal[i].edad > masViejo.edad) {
                masViejo = personal[i];
            }
        }
        return masViejo.nombre;
    }

    // d) Número de profesoras con edad mayor al promedio
    public static int contarProfesorasMayoresAlPromedio(Profesor[] personal, double promedio) {
        int contador = 0;
        for (Profesor p : personal) {
            if (p.sexo == 'F' && p.edad > promedio) {
                contador++;
            }
        }
        return contador;
    }

    // e) Número de profesores con edad menor al promedio
    public static int contarProfesoresMenoresAlPromedio(Profesor[] personal, double promedio) {
        int contador = 0;
        for (Profesor p : personal) {
            if (p.sexo == 'M' && p.edad < promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de profesores (N) [1-100]:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        if (n >= 1 && n <= 100) {
            Profesor[] personal = new Profesor[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\n--- Ingresando datos del profesor #" + (i + 1) + " ---");
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                System.out.print("Sexo (F/M): ");
                char sexo = scanner.next().charAt(0);
                scanner.nextLine(); // Consumir salto de línea
                personal[i] = new Profesor(nombre, edad, sexo);
            }
            
            // Realizar cálculos
            double edadPromedio = calcularEdadPromedio(personal);
            String nombreMasJoven = encontrarProfesorMasJoven(personal);
            String nombreMasViejo = encontrarProfesorMasViejo(personal);
            int numProfesoras = contarProfesorasMayoresAlPromedio(personal, edadPromedio);
            int numProfesores = contarProfesoresMenoresAlPromedio(personal, edadPromedio);

            // Imprimir resultados
            System.out.println("\n================ RESULTADOS ================");
            System.out.printf("a) Edad promedio del grupo: %.2f años%n", edadPromedio);
            System.out.println("b) Profesor más joven: " + nombreMasJoven);
            System.out.println("c) Profesor de más edad: " + nombreMasViejo);
            System.out.println("d) Número de profesoras con edad mayor al promedio: " + numProfesoras);
            System.out.println("e) Número de profesores con edad menor al promedio: " + numProfesores);
            System.out.println("==========================================");

        } else {
            System.out.println("Error: N debe estar entre 1 y 100.");
        }
        scanner.close();
    }
}
