import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PS_4_35_PAG_454Test {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void testBusquedaYAgregacion() {
        // Simular entrada: buscar "Juan", agregar teléfono, buscar de nuevo, salir
        String input = "Juan\n" +          // Buscar Juan (no existe)
                      "123-456-789\n" +    // Agregar teléfono
                      "Juan\n" +           // Buscar Juan (ahora existe)
                      "SALIR\n";           // Terminar
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PS_4_35_PAG_454.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe indicar que el nombre no se encontró inicialmente",
                  output.contains("-> Nombre no encontrado"));
        assertTrue("Debe confirmar que se agregó el contacto",
                  output.contains("-> Contacto agregado exitosamente"));
        assertTrue("Debe mostrar el teléfono al buscarlo nuevamente",
                  output.contains("-> Teléfono encontrado: 123-456-789"));
    }

    @Test
    public void testBusquedaInsensibleMayusculas() {
        // Probar búsqueda insensible a mayúsculas/minúsculas
        String input = "Juan\n" +          // Agregar Juan
                      "123-456-789\n" +    // Su teléfono
                      "JUAN\n" +           // Buscar como JUAN
                      "juan\n" +           // Buscar como juan
                      "JuAn\n" +           // Buscar como JuAn
                      "SALIR\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PS_4_35_PAG_454.main(new String[]{});
        String output = outputContent.toString();

        // Contar cuántas veces aparece el teléfono (debería ser 3)
        int count = output.split("123-456-789").length - 1;
        assertEquals("Debe encontrar el teléfono en las tres búsquedas", 3, count);
    }

    @Test
    public void testDirectorioLleno() {
        // Esta prueba verifica que se pueden agregar múltiples contactos
        // y que se pueden buscar después de agregarlos
        StringBuilder input = new StringBuilder();
        // Agregar dos contactos
        input.append("Juan\n");             // Buscar Juan (no existe)
        input.append("123-456\n");          // Agregar teléfono de Juan
        input.append("Maria\n");            // Buscar Maria (no existe)
        input.append("789-012\n");          // Agregar teléfono de Maria
        // Buscar los contactos agregados
        input.append("Juan\n");             // Buscar Juan (ahora existe)
        input.append("Maria\n");            // Buscar Maria (ahora existe)
        input.append("SALIR\n");

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_4_35_PAG_454.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe agregar el primer contacto correctamente",
                  output.contains("-> Contacto agregado exitosamente"));
        assertTrue("Debe encontrar el teléfono de Juan",
                  output.contains("123-456"));
        assertTrue("Debe encontrar el teléfono de Maria",
                  output.contains("789-012"));
    }

    @Test
    public void testSalidaDelPrograma() {
        // Probar la salida inmediata y el mensaje de cierre
        String input = "SALIR\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PS_4_35_PAG_454.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe mostrar mensaje de cierre",
                  output.contains("--- Directorio cerrado ---"));
    }
}

