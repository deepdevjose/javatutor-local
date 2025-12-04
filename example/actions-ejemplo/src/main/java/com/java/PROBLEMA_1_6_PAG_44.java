import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del teclado

public class PROBLEMA_1_6_PAG_44 {

    public static void main(String[] args) {
        
        // --- Declaración de Variables ---
        int dias;      // Variable tipo entero para la entrada
        double seg;    // Variable tipo real (double) para el resultado
        
        // Creamos un objeto Scanner para leer la entrada del sistema (teclado)
        Scanner scanner = new Scanner(System.in);
        
        // --- PASO 1: Leer DIAS (Entrada) ---
        System.out.print("Introduce el número de días: ");
        dias = scanner.nextInt();
        
        // --- PASO 2: Calcular SEG (Proceso) ---
        // Hacemos el cálculo. 
        // Usamos (double)dias para asegurar que la multiplicación se haga
        // con tipo 'double' y evitar un desbordamiento si el número es muy grande.
        seg = (double)dias * 24 * 60 * 60;
        
        // --- PASO 3: Escribir Resultado (Salida) ---
        // Usamos printf para formatear la salida y que no muestre decimales
        // innecesarios (%.0f significa "número de punto flotante sin decimales").
        System.out.printf("En %d días, hay %.0f segundos.\n", dias, seg);
        
        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
    
    // Método para realizar el cálculo (agregado para facilitar las pruebas)
    public static double calcularSegundos(int dias) {
        return (double)dias * 24 * 60 * 60;
    }
}

