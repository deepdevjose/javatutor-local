import java.util.Scanner;

public class PS_3_24_PAG_427 {

    public static void main(String[] args) {

        // --- Declaración de Constantes y Variables ---
        final int NUMERO_ALUMNOS = 35;
        final int NUMERO_CALIFICACIONES = 5;
        
        int matricula;
        double calificacion;
        double suma;
        double promedio;

        // --- Variables para guardar el Máximo y Mínimo ---
        double mejorProm;
        double peorProm;
        int matMejor = 0; // Matrícula del mejor alumno
        int matPeor = 0;  // Matrícula del peor alumno

        // --- Inicialización de Centinelas ---
        // Asumimos que las calificaciones están en una escala de 0 a 100
        mejorProm = -1.0; // Cualquier promedio será mayor que -1
        peorProm = 101.0; // Cualquier promedio será menor que 101
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Carga de Calificaciones (PS 3.24) ---");

        // --- Bucle Externo (para cada alumno) ---
        for (int i = 1; i <= NUMERO_ALUMNOS; i++) {
            
            System.out.print("\nIngrese la matrícula del alumno " + i + ": ");
            matricula = scanner.nextInt();
            
            suma = 0.0; // Reiniciar suma para cada alumno

            // --- Bucle Interno (para las 5 calificaciones) ---
            for (int j = 1; j <= NUMERO_CALIFICACIONES; j++) {
                System.out.print("  Calificación " + j + ": ");
                calificacion = scanner.nextDouble();
                suma = suma + calificacion;
            }
            
            // Calculamos el promedio de este alumno
            promedio = suma / NUMERO_CALIFICACIONES;
            System.out.printf("-> Promedio del alumno %d: %.2f\n", matricula, promedio);

            // --- Lógica de Comparación (Máximo y Mínimo) ---
            
            // ¿Este promedio es el nuevo MEJOR?
            if (promedio > mejorProm) {
                mejorProm = promedio; // Guardamos el nuevo mejor promedio
                matMejor = matricula; // Guardamos la matrícula
            }

            // ¿Este promedio es el nuevo PEOR?
            if (promedio < peorProm) {
                peorProm = promedio; // Guardamos el nuevo peor promedio
                matPeor = matricula; // Guardamos la matrícula
            }
        }

        // --- Impresión Final (después de terminar el bucle) ---
        System.out.println("\n--- Procesamiento Terminado ---");
        System.out.println("\n--- RESULTADOS FINALES ---");
        
        System.out.printf("Mejor Alumno: Matrícula %d con Promedio %.2f\n", matMejor, mejorProm);
        System.out.printf("Peor Alumno:  Matrícula %d con Promedio %.2f\n", matPeor, peorProm);

        scanner.close();
    }
}

