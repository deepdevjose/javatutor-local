import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EstadioPreciosTest {
    
    @Test
    public void testProcesarVenta() {
        // Precios de prueba
        double p1 = 100.0, p2 = 200.0, p3 = 300.0, p4 = 400.0, p5 = 500.0;
        
        // Probar ventas válidas
        assertEquals(200.0, EstadioPrecios.procesarVenta(1, 2, p1, p2, p3, p4, p5), 0.01);
        assertEquals(600.0, EstadioPrecios.procesarVenta(2, 3, p1, p2, p3, p4, p5), 0.01);
        assertEquals(900.0, EstadioPrecios.procesarVenta(3, 3, p1, p2, p3, p4, p5), 0.01);
        assertEquals(800.0, EstadioPrecios.procesarVenta(4, 2, p1, p2, p3, p4, p5), 0.01);
        assertEquals(1500.0, EstadioPrecios.procesarVenta(5, 3, p1, p2, p3, p4, p5), 0.01);
        
        // Probar venta con clave inválida
        assertEquals(0.0, EstadioPrecios.procesarVenta(6, 2, p1, p2, p3, p4, p5), 0.01);
    }
    
    @Test
    public void testMainOutput() {
        // Simular entrada: precios y dos ventas
        String input = "100\n200\n300\n400\n500\n" + // Precios
                      "1\n2\n" +                     // Primera venta: 2 boletos tipo 1
                      "3\n3\n" +                     // Segunda venta: 3 boletos tipo 3
                      "-1\n-1\n";                    // Terminar
                      
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        EstadioPrecios.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar la salida
        String output = outputStream.toString();
        assertTrue(output.contains("CANTIDAD BOLETOS TIPO 1: 2"));
        assertTrue(output.contains("CANTIDAD BOLETOS TIPO 3: 3"));
        assertTrue(output.contains("RECAUDACION TOTAL DEL ESTADIO: $1100.00"));
    }
    
    @Test
    public void testVentaInvalida() {
        // Simular entrada con una venta inválida
        String input = "100\n200\n300\n400\n500\n" + // Precios
                      "6\n1\n" +                     // Venta inválida
                      "-1\n-1\n";                    // Terminar
                      
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        EstadioPrecios.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar la salida
        String output = outputStream.toString();
        assertTrue(output.contains("ERROR: Clave no válida"));
        assertTrue(output.contains("RECAUDACION TOTAL DEL ESTADIO: $0.00"));
    }
}