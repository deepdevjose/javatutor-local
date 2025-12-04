import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PROBLEMA_1_6_PAG_44Test {
    
    @Test
    public void testCalcularSegundos() {
        // Probar con diferentes valores
        assertEquals(86400.0, PROBLEMA_1_6_PAG_44.calcularSegundos(1), 0.0); // 1 día
        assertEquals(172800.0, PROBLEMA_1_6_PAG_44.calcularSegundos(2), 0.0); // 2 días
        assertEquals(0.0, PROBLEMA_1_6_PAG_44.calcularSegundos(0), 0.0); // 0 días
        assertEquals(2592000.0, PROBLEMA_1_6_PAG_44.calcularSegundos(30), 0.0); // 30 días
    }
    
    @Test
    public void testMainOutput() {
        // Preparar la entrada simulada
        String input = "5\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        PROBLEMA_1_6_PAG_44.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar la salida
        String output = outputStream.toString();
        assertTrue(output.contains("Introduce el número de días:"));
        assertTrue(output.contains("En 5 días, hay 432000 segundos"));
    }
}

