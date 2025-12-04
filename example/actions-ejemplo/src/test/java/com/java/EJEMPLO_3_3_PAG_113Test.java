import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EJEMPLO_3_3_PAG_113Test {
    
    @Test
    public void testEJEMPLO_3_3_PAG_113() {
        // Prueba con array que contiene ceros
        int[] numeros1 = {0, 1, 0, 3, 0, 5};
        assertEquals(3, EJEMPLO_3_3_PAG_113.EJEMPLO_3_3_PAG_113(numeros1));
        
        // Prueba con array sin ceros
        int[] numeros2 = {1, 2, 3, 4, 5};
        assertEquals(0, EJEMPLO_3_3_PAG_113.EJEMPLO_3_3_PAG_113(numeros2));
        
        // Prueba con array vacío
        int[] numeros3 = {};
        assertEquals(0, EJEMPLO_3_3_PAG_113.EJEMPLO_3_3_PAG_113(numeros3));
        
        // Prueba con array que solo tiene ceros
        int[] numeros4 = {0, 0, 0};
        assertEquals(3, EJEMPLO_3_3_PAG_113.EJEMPLO_3_3_PAG_113(numeros4));
    }
    
    @Test
    public void testMainOutput() {
        // Simular entrada: 5 números (2 ceros)
        String input = "5\n0\n1\n0\n3\n4\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        EJEMPLO_3_3_PAG_113.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar la salida
        String output = outputStream.toString();
        assertTrue(output.contains("¿Cuántos números enteros vas a ingresar?"));
        assertTrue(output.contains("El número total de 'ceros' ingresados fue: 2"));
    }
    
    @Test
    public void testMainSinCeros() {
        // Simular entrada: 3 números (ningún cero)
        String input = "3\n1\n2\n3\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        EJEMPLO_3_3_PAG_113.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar la salida
        String output = outputStream.toString();
        assertTrue(output.contains("El número total de 'ceros' ingresados fue: 0"));
    }
}

