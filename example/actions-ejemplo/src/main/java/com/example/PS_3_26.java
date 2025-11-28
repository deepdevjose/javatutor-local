package com.example;

import java.util.ArrayList;
import java.util.List; // Importar List
import java.util.Scanner; // Importar ArrayList

/**
 *
 * @author imac28
 */
public class PS_3_26 {

    // --- 1. Clase interna para guardar los datos de un alumno ---
    // Solo necesitamos lo que usamos en los cálculos
    public static class Alumno {
        int sexo;
        double promedio;

        public Alumno(int sexo, double promedio) {
            this.sexo = sexo;
            this.promedio = promedio;
        }

        // Getters para que el método de lógica acceda a los datos
        public int getSexo() { return sexo; }
        public double getPromedio() { return promedio; }
    }

    // --- 2. Clase interna para guardar los resultados ---
    public static class Estadisticas {
        public final double porcentajeFemenino;
        public final double promedioFemenino;
        public final double porcentajeMasculino;
        public final double promedioMasculino;
        public final double promedioGeneral;

        public Estadisticas(double porFem, double promFem, double porMasc, double promMasc, double promGen) {
            this.porcentajeFemenino = porFem;
            this.promedioFemenino = promFem;
            this.porcentajeMasculino = porMasc;
            this.promedioMasculino = promMasc;
            this.promedioGeneral = promGen;
        }
    }

    // --- 3. El método main (ahora solo maneja I/O) ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>(); // Lista para guardar alumnos

        System.out.print("Ingrese el número de alumnos: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("\nAlumno " + i);
            
            // Pedimos los datos
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt(); // No se usa, pero lo pide el original
            
            System.out.print("Sexo (0: Femenino, 1: Masculino): ");
            int sexo = scanner.nextInt();
            
            System.out.print("Semestre: ");
            int semestre = scanner.nextInt(); // No se usa, pero lo pide el original
            
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();

            // Creamos y añadimos el alumno a la lista
            listaAlumnos.add(new Alumno(sexo, promedio));
        }
        scanner.close();

        // --- 4. Llamamos al método de lógica ---
        Estadisticas stats = calcularEstadisticas(listaAlumnos);

        // Imprimimos los resultados desde el objeto 'stats'
        System.out.println("\nEstadísticas de la universidad:");
        System.out.println("Porcentaje de población femenina: " + stats.porcentajeFemenino + "%");
        System.out.println("Promedio de la población femenina: " + stats.promedioFemenino);
        System.out.println("Porcentaje de población masculina: " + stats.porcentajeMasculino + "%");
        System.out.println("Promedio de la población masculina: " + stats.promedioMasculino);
        System.out.println("Promedio general de los alumnos: " + stats.promedioGeneral);
    }

    // --- 5. El método de lógica (¡Este es el que probaremos!) ---
    public static Estadisticas calcularEstadisticas(List<Alumno> alumnos) {
        int N = alumnos.size(); // Obtenemos N del tamaño de la lista
        int contadorFemenino = 0;
        int contadorMasculino = 0;
        // OJO: Las sumas deben ser double, no int, porque suman promedios (double)
        double sumaFemenino = 0; 
        double sumaMasculino = 0;
        double sumaTotal = 0;

        // Iteramos sobre la lista de alumnos
        for (Alumno alumno : alumnos) {
            if (alumno.getSexo() == 0) {
                contadorFemenino++;
                sumaFemenino += alumno.getPromedio();
            } else {
                contadorMasculino++;
                sumaMasculino += alumno.getPromedio();
            }
            sumaTotal += alumno.getPromedio();
        }

        // Hacemos los cálculos (misma lógica que tenías)
        double promedioFemenino = (contadorFemenino > 0) ? sumaFemenino / (double) contadorFemenino : 0;
        double promedioMasculino = (contadorMasculino > 0) ? sumaMasculino / (double) contadorMasculino : 0;
        double promedioGeneral = (N > 0) ? sumaTotal / (double) N : 0;
        
        double porcentajeFemenino = (N > 0) ? (contadorFemenino / (double) N) * 100 : 0;
        double porcentajeMasculino = (N > 0) ? (contadorMasculino / (double) N) * 100 : 0;
        
        // Devolvemos el objeto con todos los resultados
        return new Estadisticas(porcentajeFemenino, promedioFemenino, porcentajeMasculino, promedioMasculino, promedioGeneral);
    }
}