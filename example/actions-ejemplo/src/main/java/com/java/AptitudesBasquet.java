import java.util.Scanner;

public class AptitudesBasquet {

    public static void main(String[] args) {

        // --- Declaración de Variables ---
        String nombre;
        char sexo;
        int edad, peso;
        double altura;

        // --- Inicialización de Contadores ---
        int totalMujeres = 0;
        int aptasMujeres = 0;
        int totalHombres = 0;
        int aptosHombres = 0;

        Scanner scanner = new Scanner(System.in);

        // --- Impresión de Encabezados para las Listas (a y c) ---
        System.out.println("--- Alumnas Aptas (a) ---");
        // (La lista se irá llenando)
        
        System.out.println("\n--- Alumnos Aptos (c) ---");
        // (La lista se irá llenando)

        // --- PASO 1: Lectura "Cebadora" (Priming Read) ---
        System.out.println("\n--- Ingrese Datos de Alumnos ---");
        System.out.print("Ingrese Nombre (o 'X' para terminar): ");
        nombre = scanner.nextLine();

        // --- PASO 2: Bucle Controlado por Centinela ---
        // El bucle se repite MIENTRAS el nombre NO sea "X"
        while (!nombre.equalsIgnoreCase("X")) {

            // --- Lectura del resto de los datos ---
            System.out.print("Sexo (F/M): ");
            sexo = scanner.next().charAt(0);
            
            System.out.print("Edad: ");
            edad = scanner.nextInt();
            
            System.out.print("Peso (kg): ");
            peso = scanner.nextInt();
            
            System.out.print("Altura (m): ");
            altura = scanner.nextDouble();

            // --- PASO 3: Lógica de Clasificación y Conteo ---
            if (sexo == 'F' || sexo == 'f') {
                totalMujeres++; // Contar alumna

                // --- Condición (a) ---
                if (altura >= 1.73 && peso <= 90) {
                    aptasMujeres++; // Contar alumna apta
                    System.out.println("   (Apta) -> " + nombre); // Imprimir para lista (a)
                }
                
            } else if (sexo == 'M' || sexo == 'm') {
                totalHombres++; // Contar alumno

                // --- Condición (c) ---
                if (altura >= 1.83 && peso <= 110) {
                    aptosHombres++; // Contar alumno apto
                    System.out.println("   (Apto) -> " + nombre); // Imprimir para lista (c)
                }
            }

            // --- Lectura del Siguiente Centinela ---
            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.print("\nIngrese Nombre (o 'X' para terminar): ");
            nombre = scanner.nextLine();
        }

        // --- PASO 4: Cálculo e Impresión de Porcentajes (b y d) ---
        System.out.println("\n--- FIN DEL PROCESAMIENTO ---");
        System.out.println("--- Reporte Final ---");

        // --- Inciso (b) ---
        if (totalMujeres > 0) {
            double porcentajeF = ((double)aptasMujeres / totalMujeres) * 100.0;
            System.out.printf("Porcentaje de alumnas aptas: %.2f%% (de %d alumnas totales)\n", porcentajeF, totalMujeres);
        } else {
            System.out.println("No se ingresaron alumnas.");
        }

        // --- Inciso (d) ---
        if (totalHombres > 0) {
            double porcentajeM = ((double)aptosHombres / totalHombres) * 100.0;
            System.out.printf("Porcentaje de alumnos aptos: %.2f%% (de %d alumnos totales)\n", porcentajeM, totalHombres);
        } else {
            System.out.println("No se ingresaron alumnos.");
        }

        scanner.close();
    }
}