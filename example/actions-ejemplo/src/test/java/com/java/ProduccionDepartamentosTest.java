import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ProduccionDepartamentosTest {
    
    @Test
    public void testEncontrarMesMayorCostoDulces() {
        double[][] prod = new double[12][3];
        // Mes 5 tendrá el mayor costo en dulces
        prod[4][0] = 1000.0; // Mayo (índice 4)
        prod[0][0] = 500.0;  // Enero
        prod[11][0] = 750.0; // Diciembre
        
        assertEquals(5, ProduccionDepartamentos.encontrarMesMayorCostoDulces(prod));
    }
    
    @Test
    public void testCalcularPromedioAnualBebidas() {
        double[][] prod = new double[12][3];
        // Llenar todos los meses con 100 en bebidas
        for (int i = 0; i < 12; i++) {
            prod[i][1] = 100.0;
        }
        
        assertEquals(100.0, ProduccionDepartamentos.calcularPromedioAnualBebidas(prod), 0.01);
    }
    
    @Test
    public void testEncontrarMesesExtremosBebidas() {
        double[][] prod = new double[12][3];
        // Llenar con valores base
        for (int i = 0; i < 12; i++) {
            prod[i][1] = 500.0;
        }
        // Mes 3 tendrá el mayor costo y mes 8 el menor
        prod[2][1] = 1000.0; // Marzo (índice 2)
        prod[7][1] = 200.0;  // Agosto (índice 7)
        
        int[] resultado = ProduccionDepartamentos.encontrarMesesExtremosBebidas(prod);
        assertEquals(3, resultado[0]); // Mayor en marzo
        assertEquals(8, resultado[1]); // Menor en agosto
    }
    
    @Test
    public void testEncontrarDepartamentoMenorCostoDiciembre() {
        double[][] prod = new double[12][3];
        // En diciembre (índice 11)
        prod[11][0] = 300.0; // Depto 1
        prod[11][1] = 200.0; // Depto 2 (menor)
        prod[11][2] = 400.0; // Depto 3
        
        assertEquals(2, ProduccionDepartamentos.encontrarDepartamentoMenorCostoDiciembre(prod));
    }
    
    @Test
    public void testMainOutput() {
        // Preparar entrada simulada con valores pequeños para la prueba
        StringBuilder input = new StringBuilder();
        // 12 meses x 3 departamentos = 36 valores
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                input.append("100\n");
            }
        }
        
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        ProduccionDepartamentos.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar la salida
        String output = outputStream.toString();
        assertTrue(output.contains("Resultados del Análisis"));
        assertTrue(output.contains("Promedio anual de costos de producción de bebidas"));
    }
}