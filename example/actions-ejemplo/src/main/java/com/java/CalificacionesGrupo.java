import java.util.Scanner;

public class CalificacionesGrupo {

    public static void main(String[] args) {

        // --- Declaración de Constantes y Matriz ---
        final int ALUMNOS = 30;
        final int EXAMENES = 6;
        
        // La matriz se declara como [filas][columnas] -> [alumnos][examenes]
        double[][] calificaciones = new double[ALUMNOS][EXAMENES];
        
        Scanner scanner = new Scanner(System.in);

        // --- 1. Llenado de la Matriz ---
        System.out.println("--- Ingreso de " + (ALUMNOS * EXAMENES) + " Calificaciones ---");
        
        // Bucle externo (filas/alumnos, i de 0 a 29)
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            // Bucle interno (columnas/examenes, j de 0 a 5)
            for (int j = 0; j < EXAMENES; j++) {
                System.out.print("  Calificación Examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("\n--- Procesamiento de Datos ---");


        // --- 2. Incisos (a) y (c): Promedio por Examen y Mejor Examen ---
        
        // Variables para guardar el mejor promedio (inciso c)
        double mejorPromedioExamen = -1.0;
        int numMejorExamen = 0;
        
        System.out.println("\na) Promedio de calificaciones por examen:");
        
        // Bucle externo (columnas/examenes, j de 0 a 5)
        for (int j = 0; j < EXAMENES; j++) {
            double sumaExamen = 0;
            
            // Bucle interno (filas/alumnos, i de 0 a 29)
            for (int i = 0; i < ALUMNOS; i++) {
                sumaExamen += calificaciones[i][j];
            }
            
            double promedioExamen = sumaExamen / ALUMNOS;
            System.out.printf("   Promedio Examen %d: %.2f\n", (j + 1), promedioExamen);
            
            // Lógica para inciso (c)
            if (promedioExamen > mejorPromedioExamen) {
                mejorPromedioExamen = promedioExamen;
                numMejorExamen = j + 1; // Guardamos el número del examen (1-6)
            }
        }

        // --- 3. Inciso (b): Promedio por Alumno ---
        System.out.println("\nb) Promedio de calificaciones por alumno:");

        // Bucle externo (filas/alumnos, i de 0 a 29)
        for (int i = 0; i < ALUMNOS; i++) {
            double sumaAlumno = 0;

            // Bucle interno (columnas/examenes, j de 0 a 5)
            for (int j = 0; j < EXAMENES; j++) {
                sumaAlumno += calificaciones[i][j];
            }
            
            double promedioAlumno = sumaAlumno / EXAMENES;
            System.out.printf("   Promedio Alumno %d: %.2f\n", (i + 1), promedioAlumno);
        }

        // --- 4. Impresión Final Inciso (c) ---
        System.out.println("\nc) Examen con el mayor promedio:");
        System.out.printf("   El Examen %d tuvo el mayor promedio: %.2f\n", 
                            numMejorExamen, mejorPromedioExamen);

        scanner.close();
    }
}