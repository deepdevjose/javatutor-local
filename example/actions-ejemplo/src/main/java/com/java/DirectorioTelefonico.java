import java.util.Scanner;

public class DirectorioTelefonico {

    public static void main(String[] args) {

        // --- Declaración de Constantes y Arreglos ---
        final int N_MAX = 1000; // Capacidad máxima del arreglo
        String[] nombre = new String[N_MAX];
        String[] telefono = new String[N_MAX];
        
        // Inicializar los arrays con cadenas vacías para evitar NullPointerException
        for (int i = 0; i < N_MAX; i++) {
            nombre[i] = "";
            telefono[i] = "";
        }
        
        // N: Número actual de elementos en el directorio
        int numContactosActuales = 0; 
        
        Scanner scanner = new Scanner(System.in);
        String nombreBuscado = "";

        // --- Bucle Principal del Programa ---
        // Se repite hasta que el usuario escriba "SALIR"
        while (true) {
            
            System.out.println("\n--- Directorio Telefónico ---");
            System.out.print("Ingrese un nombre a buscar (o 'SALIR' para terminar): ");
            nombreBuscado = scanner.nextLine();

            // Condición para terminar el programa
            if (nombreBuscado.equalsIgnoreCase("SALIR")) {
                break;
            }

            // --- 1. Proceso de Búsqueda ---
            boolean encontrado = false;
            int indiceEncontrado = -1;

            // Bucle para buscar en los 'numContactosActuales'
            for (int i = 0; i < numContactosActuales; i++) {
                if (nombre[i].equalsIgnoreCase(nombreBuscado)) {
                    encontrado = true;
                    indiceEncontrado = i;
                    break; // Rompemos el bucle 'for' porque ya lo encontramos
                }
            }

            // --- 2. Decisión (Encontrado o Agregar) ---
            if (encontrado) {
                // Si se encontró, muestra el teléfono
                System.out.println("-> Teléfono encontrado: " + telefono[indiceEncontrado]);
            
            } else {
                // Si no se encontró, inicia el proceso para agregar
                System.out.println("-> Nombre no encontrado.");
                
                // --- 3. Verificar Capacidad ---
                if (numContactosActuales < N_MAX) {
                    System.out.println("Agregando nuevo contacto...");
                    System.out.print("Ingrese el teléfono para " + nombreBuscado + ": ");
                    String nuevoTelefono = scanner.nextLine();
                    
                    // Agregamos en la última posición disponible (índice 'numContactosActuales')
                    nombre[numContactosActuales] = nombreBuscado;
                    telefono[numContactosActuales] = nuevoTelefono;
                    
                    // Incrementamos el contador de contactos
                    numContactosActuales++; 
                    
                    System.out.println("-> Contacto agregado exitosamente.");
                } else {
                    // Si numContactosActuales >= N_MAX
                    System.out.println("-> Error: Directorio lleno. No se puede agregar.");
                }
            }
        }

        System.out.println("--- Directorio cerrado ---");
        scanner.close();
    }
}