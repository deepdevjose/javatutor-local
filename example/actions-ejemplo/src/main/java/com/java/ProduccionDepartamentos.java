import java.util.Scanner;

public class ProduccionDepartamentos {

    public static void main(String[] args) {
        // --- Declaración de Variables ---
        double[][] prod = new double[12][3];
        double maydul, sum, maybeb, menbeb, menor;
        int mes, mesmay, mesmen, dep;
        
        Scanner scanner = new Scanner(System.in);

        // --- 1. Llenado de la Matriz ---
        llenarMatriz(prod, scanner);

        // --- 2. Inciso (a): Mes con mayor costo de Dulces (Columna 0) ---
        mes = encontrarMesMayorCostoDulces(prod);
        System.out.println("\n--- Resultados del Análisis ---");
        System.out.println("En el mes " + mes + ", se registró el mayor costo de producción de dulces.");

        // --- 3. Inciso (b): Promedio anual de Bebidas (Columna 1) ---
        double promedio = calcularPromedioAnualBebidas(prod);
        System.out.printf("Promedio anual de costos de producción de bebidas: %.2f\n", promedio);

        // --- 4. Inciso (c): Mes con mayor y menor costo de Bebidas (Columna 1) ---
        int[] meses = encontrarMesesExtremosBebidas(prod);
        System.out.println("En el mes " + meses[0] + ", se registró el mayor costo de producción de bebidas, y en el mes " + meses[1] + ", el menor costo.");

        // --- 5. Inciso (d): Rubro con menor costo en Diciembre (Fila 11) ---
        dep = encontrarDepartamentoMenorCostoDiciembre(prod);
        System.out.println("El departamento " + dep + " tuvo el menor costo en diciembre.");

        scanner.close();
    }

    // Método para llenar la matriz de producción
    public static void llenarMatriz(double[][] prod, Scanner scanner) {
        System.out.println("--- Ingrese los costos de producción ---");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Mes " + (i + 1) + ", Depto " + (j + 1) + ": ");
                prod[i][j] = scanner.nextDouble();
            }
        }
    }

    // Método para encontrar el mes con mayor costo de dulces
    public static int encontrarMesMayorCostoDulces(double[][] prod) {
        double maydul = prod[0][0];
        int mes = 1;
        
        for (int i = 1; i < 12; i++) {
            if (maydul < prod[i][0]) {
                maydul = prod[i][0];
                mes = i + 1;
            }
        }
        return mes;
    }

    // Método para calcular el promedio anual de bebidas
    public static double calcularPromedioAnualBebidas(double[][] prod) {
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += prod[i][1];
        }
        return sum / 12;
    }

    // Método para encontrar los meses con mayor y menor costo de bebidas
    public static int[] encontrarMesesExtremosBebidas(double[][] prod) {
        double maybeb = prod[0][1];
        double menbeb = prod[0][1];
        int mesmay = 1;
        int mesmen = 1;

        for (int i = 0; i < 12; i++) {
            if (maybeb < prod[i][1]) {
                maybeb = prod[i][1];
                mesmay = i + 1;
            }
            if (menbeb > prod[i][1]) {
                menbeb = prod[i][1];
                mesmen = i + 1;
            }
        }
        return new int[]{mesmay, mesmen};
    }

    // Método para encontrar el departamento con menor costo en diciembre
    public static int encontrarDepartamentoMenorCostoDiciembre(double[][] prod) {
        double menor = prod[11][0];
        int dep = 1;

        for (int j = 1; j < 3; j++) {
            if (menor > prod[11][j]) {
                menor = prod[11][j];
                dep = j + 1;
            }
        }
        return dep;
    }
}