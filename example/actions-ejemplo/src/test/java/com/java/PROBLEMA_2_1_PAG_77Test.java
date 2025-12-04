import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PROBLEMA_2_1_PAG_77Test {
    
    @Test
    public void testCalcularTemperatura() {
        // Casos de prueba normales
        assertEquals(41.25, PROBLEMA_2_1_PAG_77.calcularTemperatura(5), 0.01); // 5 sonidos
        assertEquals(42.5, PROBLEMA_2_1_PAG_77.calcularTemperatura(10), 0.01); // 10 sonidos
        assertEquals(45.0, PROBLEMA_2_1_PAG_77.calcularTemperatura(20), 0.01); // 20 sonidos
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularTemperaturaConCeroCuidados() {
        PROBLEMA_2_1_PAG_77.calcularTemperatura(0); // Debe lanzar excepción
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularTemperaturaConNegativo() {
        PROBLEMA_2_1_PAG_77.calcularTemperatura(-5); // Debe lanzar excepción
    }
    
    @Test
    public void testMainOutput() {
        // Probar con entrada válida
        String input = "12\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        PROBLEMA_2_1_PAG_77.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar la salida
        String output = outputStream.toString();
        assertTrue(output.contains("Introduce el número de sonidos por minuto"));
        assertTrue(output.contains("La temperatura es: 43.00")); // 12/4 + 40 = 43.00
    }
    
    @Test
    public void testMainSinSalida() {
        // Probar con entrada inválida (N <= 0)
        String input = "0\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        PROBLEMA_2_1_PAG_77.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar que no hay cálculo de temperatura en la salida
        String output = outputStream.toString();
        assertFalse(output.contains("La temperatura es:"));
    }
}

