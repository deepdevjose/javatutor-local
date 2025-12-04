import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PROBLEMA_5_2_PAG_363Test {
    private Empleado[] empleados;
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        // Redirigir System.out a nuestro ByteArrayOutputStream
        System.setOut(new PrintStream(outputContent));

        // Crear datos de prueba
        empleados = new Empleado[3];
        
        // Empleado 1 - Ventas altas
        empleados[0] = new Empleado();
        empleados[0].numero = 1;
        empleados[0].nombre = "Ana García";
        empleados[0].salario = 15000.0;
        for (int i = 0; i < 12; i++) {
            empleados[0].ventas[i] = 100000.0; // Total anual: 1,200,000
        }

        // Empleado 2 - Ventas medias
        empleados[1] = new Empleado();
        empleados[1].numero = 2;
        empleados[1].nombre = "Juan Pérez";
        empleados[1].salario = 12000.0;
        for (int i = 0; i < 12; i++) {
            empleados[1].ventas[i] = 70000.0; // Total anual: 840,000
        }

        // Empleado 3 - Ventas bajas en diciembre
        empleados[2] = new Empleado();
        empleados[2].numero = 3;
        empleados[2].nombre = "María Rodríguez";
        empleados[2].salario = 13000.0;
        for (int i = 0; i < 11; i++) {
            empleados[2].ventas[i] = 80000.0;
        }
        empleados[2].ventas[11] = 25000.0; // Diciembre con ventas bajas
    }

    @Test
    public void testEncontrarVentaMaxima() {
        PROBLEMA_5_2_PAG_363.encontrarVentaMaxima(empleados);
        String output = outputContent.toString();
        
        assertTrue("Debería mostrar el nombre de Ana García", 
                  output.contains("Ana García"));
        assertTrue("Debería mostrar el número de empleado 1", 
                  output.contains("Número de empleado: 1"));
        assertTrue("Debería mostrar el total de ventas de 1,200,000", 
                  output.contains("1200000"));
    }

    @Test
    public void testAplicarIncremento() {
        PROBLEMA_5_2_PAG_363.aplicarIncremento(empleados);
        String output = outputContent.toString();
        
        assertTrue("Debería mencionar el incremento para Ana García", 
                  output.contains("Ana García"));
        assertTrue("El salario de Ana García debería incrementarse", 
                  empleados[0].salario == 16500.0); // 15000 * 1.10
        assertFalse("No debería mencionar a Juan Pérez", 
                   output.contains("Juan Pérez"));
    }

    @Test
    public void testMostrarVentasMinimasDiciembre() {
        PROBLEMA_5_2_PAG_363.mostrarVentasMinimasDiciembre(empleados);
        String output = outputContent.toString();
        
        assertTrue("Debería mostrar a María Rodríguez", 
                  output.contains("María Rodríguez"));
        assertTrue("Debería mostrar el número de empleado 3", 
                  output.contains("Número: 3"));
        assertFalse("No debería mostrar a Ana García", 
                   output.contains("Ana García"));
    }
}

