import java.util.Scanner;

public class PS_3_23_PAG_427 {

    public static void main(String[] args) {

        // --- Declaración de Constantes y Variables ---
        final int NUMERO_ALUMNOS = 35;
        final int NUMERO_CALIFICACIONES = 5;
        
        int matricula;
        double calificacion; // Solo necesitamos 1 variable, se reutiliza
        double suma;
        double promedio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Carga de Calificaciones (PS 3.23) ---");

        // --- PASO 1: Bucle Externo (para cada alumno) ---
        // (i = 1 hasta 35)
        for (int i = 1; i <= NUMERO_ALUMNOS; i++) {
            
            System.out.print("\nIngrese la matrícula del alumno " + i + ": ");
            matricula = scanner.nextInt();
            
            // --- PASO 3: Inicializar SUMA ---
            // Se reinicia a 0 por CADA nuevo alumno
            suma = 0.0;

            // --- PASO 4: Bucle Interno (para cada calificación) ---
            System.out.println("Ingrese las " + NUMERO_CALIFICACIONES + " calificaciones del alumno " + matricula + ":");
            // (j = 1 hasta 5)
            for (int j = 1; j <= NUMERO_CALIFICACIONES; j++) {
                System.out.print("  Calificación " + j + ": ");
                // --- PASO 5: Leer Calificación ---
                calificacion = scanner.nextDouble();
                
                // --- PASO 6: Acumular ---
                suma = suma + calificacion;
            }
            
            // --- PASO 8: Calcular Promedio ---
            // Esto se hace DESPUÉS de que el bucle interno termina
            promedio = suma / NUMERO_CALIFICACIONES;
            
            // --- PASO 9: Imprimir Resultado del Alumno ---
            System.out.printf("-> El promedio del alumno %d es: %.2f\n", matricula, promedio);
            
        } // --- Fin del Bucle Externo ---

        System.out.println("\n--- Procesamiento de los " + NUMERO_ALUMNOS + " alumnos terminado ---");
        scanner.close();
    }
}

