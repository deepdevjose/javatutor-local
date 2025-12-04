import java.util.Scanner; // Importamos la clase Scanner para leer la entrada

public class EJEMPLO_3_3_PAG_113 {

    public static void main(String[] args) {
        
        // --- Declaración de Variables ---
        int N;      // El límite: ¿Cuántos números se van a leer?
        int NUM;    // El número actual leído dentro del bucle
        int CUECER; // El contador de ceros
        
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // --- PASO 1: Inicialización (CUECER <-- 0) ---
        CUECER = 0;
        
        // --- PASO 2: Leer el Límite (N) ---
        System.out.print("¿Cuántos números enteros vas a ingresar?: ");
        N = scanner.nextInt();

        // --- PASO 3: Estructura Repetitiva (Bucle) ---
        // Este bucle 'for' hace 3 cosas:
        // 1. Inicia I en 1 (int i = 1)
        // 2. Se repite MIENTRAS I <= N (i <= N)
        // 3. Incrementa I en 1 después de cada vuelta (i++)
        
        for (int i = 1; i <= N; i++) {
            
            // --- Leer el dato (NUM) ---
            System.out.print("Ingresa el número " + i + ": ");
            NUM = scanner.nextInt();
            
            // --- Condición interna (NUM = 0?) ---
            if (NUM == 0) {
                // --- Incrementar contador (CUECER <-- CUECER + 1) ---
                CUECER = CUECER + 1; // También se puede escribir como CUECER++;
            }
        }
        
        // --- PASO 4: Escribir el Resultado (CUECER) ---
        // Esto se ejecuta DESPUÉS de que el bucle ha terminado
        System.out.println("-------------------------------------------");
        System.out.println("El número total de 'ceros' ingresados fue: " + CUECER);

        // Cerramos el scanner para liberar recursos
        scanner.close();
    }

    // Método para contar ceros en un array (agregado para facilitar las pruebas)
    public static int contarCeros(int[] numeros) {
        int contador = 0;
        for (int num : numeros) {
            if (num == 0) {
                contador++;
            }
        }
        return contador;
    }
}

