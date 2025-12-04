import java.util.Scanner;

public class PS_2_1_PAG_410 {

    public static void main(String[] args) {

        // --- Declaración de Variables ---
        double seno;
        double coseno;
        double tangente;

        // Crear objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // --- PASO 1: Leer Datos ---
        System.out.print("Ingrese el valor del Seno: ");
        seno = scanner.nextDouble();
        
        System.out.print("Ingrese el valor del Coseno: ");
        coseno = scanner.nextDouble();

        // --- PASO 2: Decisión (Validar el Coseno) ---
        // Verificamos si el coseno es diferente de 0
        
        if (coseno != 0) {
            
            // --- Camino "Sí": Es seguro calcular ---
            tangente = seno / coseno;
            
            // Usamos printf para un formato de decimales más limpio
            System.out.printf("La tangente es: %.4f\n", tangente);
            
        } else {
            
            // --- Camino "No": Hay división por cero ---
            System.out.println("Error: El coseno es 0.");
            System.out.println("La tangente no está definida (división por cero).");
        }

        scanner.close();
    }
}

