import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListaSinRepeticionesTest {
    
    @Test
    public void testObtenerNumerosUnicos() {
        // Test con array que tiene repeticiones
        int[] input1 = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] expected1 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected1, ListaSinRepeticiones.obtenerNumerosUnicos(input1));
        
        // Test con array sin repeticiones
        int[] input2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected2, ListaSinRepeticiones.obtenerNumerosUnicos(input2));
        
        // Test con array vacío
        int[] input3 = {};
        int[] expected3 = {};
        assertArrayEquals(expected3, ListaSinRepeticiones.obtenerNumerosUnicos(input3));
        
        // Test con array de un solo elemento
        int[] input4 = {1};
        int[] expected4 = {1};
        assertArrayEquals(expected4, ListaSinRepeticiones.obtenerNumerosUnicos(input4));
    }
    
    @Test
    public void testValidarTamano() {
        // Test con valores válidos
        assertTrue(ListaSinRepeticiones.validarTamano(1));
        assertTrue(ListaSinRepeticiones.validarTamano(500));
        assertTrue(ListaSinRepeticiones.validarTamano(250));
        
        // Test con valores inválidos
        assertFalse(ListaSinRepeticiones.validarTamano(0));
        assertFalse(ListaSinRepeticiones.validarTamano(501));
        assertFalse(ListaSinRepeticiones.validarTamano(-1));
    }
    
    @Test
    public void testMainOutput() {
        // Simular entrada con números repetidos
        String input = "5\n1\n1\n2\n2\n3\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        ListaSinRepeticiones.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar la salida
        String output = outputStream.toString();
        assertTrue(output.contains("Lista de números sin repeticiones"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("2"));
        assertTrue(output.contains("3"));
        
        // Verificar que los números aparecen en el orden correcto
        String[] lines = output.split("\n");
        boolean found1 = false, found2 = false, found3 = false;
        
        for (String line : lines) {
            if (line.trim().equals("1")) found1 = true;
            if (line.trim().equals("2")) found2 = true;
            if (line.trim().equals("3")) found3 = true;
        }
        
        assertTrue("No se encontró el número 1", found1);
        assertTrue("No se encontró el número 2", found2);
        assertTrue("No se encontró el número 3", found3);
    }
    
    @Test
    public void testInvalidInput() {
        // Simular entrada inválida
        String input = "0\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        
        // Capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        // Ejecutar el programa
        ListaSinRepeticiones.main(new String[]{});
        
        // Restaurar System.in y System.out
        System.setOut(originalOut);
        
        // Verificar el mensaje de error
        String output = outputStream.toString();
        assertTrue(output.contains("El número de elementos del arreglo es incorrecto"));
    }
}