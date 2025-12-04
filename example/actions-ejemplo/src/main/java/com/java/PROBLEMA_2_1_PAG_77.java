import java.util.Scanner; // Importamos la clase Scanner para leer la entrada

public class PROBLEMA_2_1_PAG_77 {

    public static void main(String[] args) {
        
        // --- Declaración de Variables ---
        int N;      // Variable tipo entero para la entrada (sonidos)
        double T;   // Variable tipo real (double) para la salida (temperatura)
        
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // --- PASO 1: Leer N (Entrada) ---
        System.out.print("Introduce el número de sonidos por minuto (N): ");
        N = scanner.nextInt();
        
        // --- PASO 2: Estructura Selectiva (Condición) ---
        // El programa solo calcula y muestra si N es positivo.
        
        if (N > 0) {
            
            // --- PASO 2.a: Calcular T (Proceso) ---
            // Es crucial usar (double)N para forzar una división con decimales.
            // Si no, (5 / 4) daría 1 (división entera) en lugar de 1.25.
            T = calcularTemperatura(N);
            
            // --- PASO 2.b: Escribir Resultado (Salida) ---
            // Usamos printf para formatear la salida a 2 decimales,
            // igual que en la Tabla 2.8.
            System.out.printf("La temperatura es: %.2f grados Fahrenheit.\n", T);
            
        }
        
        // Si N no es > 0, el bloque 'if' se ignora y el programa
        // simplemente termina, tal como lo pide el diagrama.

        // Cerramos el scanner para liberar recursos
        scanner.close();
    }

    // Método para calcular la temperatura (agregado para facilitar las pruebas)
    public static double calcularTemperatura(int sonidos) {
        if (sonidos <= 0) {
            throw new IllegalArgumentException("El número de sonidos debe ser positivo");
        }
        return (double)sonidos / 4 + 40;
    }
}

