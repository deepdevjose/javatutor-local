import java.util.Scanner;

public class PROBLEMA_4_1_PAG_229 {

    public static void main(String[] args) {
        // --- Declaración de Variables ---
        int N;
        int I;
        int REPET;
        int[] VEC; // Declaramos el arreglo

        Scanner scanner = new Scanner(System.in);

        // --- PASO 1: Leer y Validar N ---
        System.out.print("Ingresa número de elementos del arreglo (1-500): ");
        N = scanner.nextInt();

        // --- PASO 2: Validación (Estructura 'Si' principal) ---
        if (N >= 1 && N <= 500) {
            
            // Si N es válido, creamos el arreglo con ese tamaño
            VEC = new int[N];

            // --- PASO 3: Llenado del Arreglo ---
            // (Usamos un bucle 'for' que es ideal para esto)
            // (I va de 0 a N-1)
            for (I = 0; I < N; I++) {
                // (I+1) es solo para que el mensaje al usuario se vea de 1 a N
                System.out.print("Ingrese valor " + (I + 1) + ": ");
                VEC[I] = scanner.nextInt();
            }

            // --- PASO 4: Procesamiento y Filtrado ---
            System.out.println("\n--- Lista de números sin repeticiones ---");
            
            I = 0; // Reiniciamos el índice para recorrer el arreglo desde el inicio

            // Bucle Externo (Mientras I < N, que es I <= N-1)
            while (I < N) {
                
                // 1. Imprimir el número único
                System.out.println(VEC[I]);
                
                // 2. Guardar el número que acabamos de imprimir
                REPET = VEC[I];
                
                // 3. Bucle Anidado (para saltar todos los duplicados)
                // Se repite mientras estemos en el arreglo Y el valor sea el mismo
                while (I < N && REPET == VEC[I]) {
                    // 4. Avanzar el índice
                    I++;
                }
            }
            // Cuando el bucle externo termina, el programa finaliza.

        } else {
            // --- Camino 'B' (N inválido) ---
            System.out.println("El número de elementos del arreglo es incorrecto");
        }

        scanner.close();
    }

    // Método auxiliar para procesar el array y obtener números únicos
    public static int[] obtenerNumerosUnicos(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        // Primero contamos cuántos números únicos hay
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                count++;
            }
        }

        // Creamos el array de números únicos
        int[] unicos = new int[count];
        int index = 0;
        unicos[index++] = array[0];

        // Llenamos el array de únicos
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                unicos[index++] = array[i];
            }
        }

        return unicos;
    }

    // Método para validar el tamaño del array
    public static boolean validarTamano(int N) {
        return N >= 1 && N <= 500;
    }
}

