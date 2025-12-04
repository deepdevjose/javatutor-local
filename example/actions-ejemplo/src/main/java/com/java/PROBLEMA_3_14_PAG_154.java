import java.util.Scanner;

public class PROBLEMA_3_14_PAG_154 {

    public static void main(String[] args) {
        // --- Declaración de Variables ---
        int AP1, AP2, AP3, AP4, AP5; // Acumuladores de boletos (Entero)
        double RECAU;                // Acumulador de recaudación (Real)
        double P1, P2, P3, P4, P5;   // Precios (Real)
        int CLAVE, CANT;             // Datos de la venta (Entero)
        double PRE;                  // Total de la venta actual (Real)

        Scanner scanner = new Scanner(System.in);

        // --- PASO 1: Inicialización ---
        AP1 = 0;
        AP2 = 0;
        AP3 = 0;
        AP4 = 0;
        AP5 = 0;
        RECAU = 0.0;

        // --- PASO 2: Leer Precios ---
        System.out.println("--- Ingrese los 5 precios de las localidades ---");
        System.out.print("Precio Localidad 1 (P1): ");
        P1 = scanner.nextDouble();
        System.out.print("Precio Localidad 2 (P2): ");
        P2 = scanner.nextDouble();
        System.out.print("Precio Localidad 3 (P3): ");
        P3 = scanner.nextDouble();
        System.out.print("Precio Localidad 4 (P4): ");
        P4 = scanner.nextDouble();
        System.out.print("Precio Localidad 5 (P5): ");
        P5 = scanner.nextDouble();

        // --- PASO 3: Lectura "Cebadora" (Priming Read) ---
        System.out.println("\n--- Ingrese la primera venta ---");
        System.out.print("Clave del boleto (1-5) o -1 para terminar: ");
        CLAVE = scanner.nextInt();
        System.out.print("Cantidad de boletos o -1 para terminar: ");
        CANT = scanner.nextInt();

        // --- PASO 4: Bucle "Mientras" ---
        while (CLAVE != -1 && CANT != -1) {
            PRE = procesarVenta(CLAVE, CANT, P1, P2, P3, P4, P5);
            
            // Actualizar acumuladores si la clave es válida
            if (CLAVE >= 1 && CLAVE <= 5) {
                switch (CLAVE) {
                    case 1: AP1 += CANT; break;
                    case 2: AP2 += CANT; break;
                    case 3: AP3 += CANT; break;
                    case 4: AP4 += CANT; break;
                    case 5: AP5 += CANT; break;
                }
                System.out.printf("Venta procesada: Clave %d, Cant %d, Importe $%.2f\n", CLAVE, CANT, PRE);
                RECAU = RECAU + PRE;
            } else {
                System.out.println("ERROR: Clave no válida. Venta ignorada.");
            }

            // --- Leer Siguiente Venta ---
            System.out.println("\n--- Siguiente Venta ---");
            System.out.print("Clave del boleto (1-5) o -1 para terminar: ");
            CLAVE = scanner.nextInt();
            System.out.print("Cantidad de boletos o -1 para terminar: ");
            CANT = scanner.nextInt();
        }

        // --- PASO 5: Escribir Totales (Salida Final) ---
        mostrarReporteFinal(AP1, AP2, AP3, AP4, AP5, RECAU);

        scanner.close();
    }

    // Método para procesar una venta individual
    public static double procesarVenta(int clave, int cantidad, double p1, double p2, double p3, double p4, double p5) {
        switch (clave) {
            case 1: return p1 * cantidad;
            case 2: return p2 * cantidad;
            case 3: return p3 * cantidad;
            case 4: return p4 * cantidad;
            case 5: return p5 * cantidad;
            default: return 0.0;
        }
    }

    // Método para actualizar los acumuladores
    private static void actualizarAcumuladores(int clave, int cantidad, double[] acumuladores) {
        if (clave >= 1 && clave <= 5) {
            acumuladores[clave - 1] += cantidad;
        }
    }

    // Método para mostrar el reporte final
    public static void mostrarReporteFinal(int ap1, int ap2, int ap3, int ap4, int ap5, double recaudacion) {
        System.out.println("\n--- FIN DE VENTAS ---");
        System.out.println("--- REPORTE FINAL ---");
        System.out.println("CANTIDAD BOLETOS TIPO 1: " + ap1);
        System.out.println("CANTIDAD BOLETOS TIPO 2: " + ap2);
        System.out.println("CANTIDAD BOLETOS TIPO 3: " + ap3);
        System.out.println("CANTIDAD BOLETOS TIPO 4: " + ap4);
        System.out.println("CANTIDAD BOLETOS TIPO 5: " + ap5);
        System.out.printf("RECAUDACION TOTAL DEL ESTADIO: $%.2f\n", recaudacion);
    }
}

