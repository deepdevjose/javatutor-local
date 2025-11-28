import java.util.Scanner;

public class ContarNumerosArreglo {

    public static void main(String[] args) {

        // --- Declaración de Constantes y Variables ---
        final int TAM_MAX = 300;
        int N; // El tamaño real que usará el usuario

        // Los tres contadores
        int cpos = 0; // Positivos
        int cneg = 0; // Negativos
        int cnul = 0; // Nulos (cero)
        
        int[] ARRE; // El arreglo

        Scanner scanner = new Scanner(System.in);

        // --- PASO 1: Leer y Validar el Tamaño (N) ---
        System.out.print("¿Cuántos números va a ingresar? (Máx. 300): ");
        N = scanner.nextInt();

        // Validación
        if (N < 1 || N > TAM_MAX) {
            System.out.println("Error: El número de elementos debe estar entre 1 y 300.");
        } else {
            
            // Creamos el arreglo con el tamaño N
            ARRE = new int[N];
            
            System.out.println("Ingrese los " + N + " números enteros:");

            // --- PASO 2: Bucle de Llenado y Clasificación ---
            // (Java usa índices 0 a N-1)
            for (int i = 0; i < N; i++) {
                
                System.out.print("Número " + (i + 1) + ": ");
                int numeroActual = scanner.nextInt();
                
                // 1. Almacenar en el arreglo
                ARRE[i] = numeroActual;

                // 2. Clasificar el número inmediatamente
                if (numeroActual > 0) {
                    cpos++; // cpos = cpos + 1
                } else if (numeroActual < 0) {
                    cneg++;
                } else {
                    cnul++;
                }
            }

            // --- PASO 3: Salida Final ---
            System.out.println("\n--- Conteo Final ---");
            System.out.println("Números Positivos: " + cpos);
            System.out.println("Números Negativos: " + cneg);
            System.out.println("Números Nulos (cero): " + cnul);
        }

        scanner.close();
    }
}