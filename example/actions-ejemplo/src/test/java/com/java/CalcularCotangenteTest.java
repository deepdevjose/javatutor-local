import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CalcularCotangenteTest {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void testCalculoCotangentePositiva() {
        // Simular entrada: seno = 1.0, coseno = 2.0 (cotangente = 2.0)
        String input = "1.0\n2.0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CalcularCotangente.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe calcular la cotangente correctamente",
                  output.contains("2.0000"));
    }

    @Test
    public void testCalculoCotangenteNegativa() {
        // Simular entrada: seno = -2.0, coseno = 1.0 (cotangente = -0.5)
        String input = "-2.0\n1.0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CalcularCotangente.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe calcular la cotangente negativa correctamente",
                  output.contains("-0.5000"));
    }

    @Test
    public void testDivisionPorCero() {
        // Simular entrada: seno = 0.0, coseno = 1.0 (división por cero)
        String input = "0.0\n1.0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CalcularCotangente.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe mostrar mensaje de error por división entre cero",
                  output.contains("Error: El seno es 0"));
        assertTrue("Debe indicar que la cotangente no está definida",
                  output.contains("no está definida"));
    }
}