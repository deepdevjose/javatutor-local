import java.util.Scanner;

public class PS_2_2_PAG_410 {

    public static void main(String[] args) {

        // --- Declaración de Variables ---
        double seno;
        double coseno;
        double cotangente;

        // Crear objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // --- PASO 1: Leer Datos ---
        System.out.print("Ingrese el valor del Seno: ");
        seno = scanner.nextDouble();
        
        System.out.print("Ingrese el valor del Coseno: ");
        coseno = scanner.nextDouble();

        // --- PASO 2: Decisión (Validar el Seno) ---
        // Verificamos si el seno es diferente de 0
        
        if (seno != 0) {
            
            // --- Camino "Sí": Es seguro calcular ---
            cotangente = coseno / seno;
            
            // Usamos printf para un formato de decimales más limpio
            System.out.printf("La cotangente es: %.4f\n", cotangente);
            
        } else {
            
            // --- Camino "No": Hay división por cero ---
            System.out.println("Error: El seno es 0.");
            System.out.println("La cotangente no está definida (división por cero).");
        }

        scanner.close();
    }
}

