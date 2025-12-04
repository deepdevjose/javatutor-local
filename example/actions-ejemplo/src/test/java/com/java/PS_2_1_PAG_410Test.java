import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PS_2_1_PAG_410Test {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void testCalculoTangentePositiva() {
        // Simular entrada: seno = 0.5, coseno = 1.0 (tangente = 0.5)
        String input = "0.5\n1.0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PS_2_1_PAG_410.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe calcular la tangente correctamente",
                  output.contains("0.5000"));
    }

    @Test
    public void testCalculoTangenteNegativa() {
        // Simular entrada: seno = -1.0, coseno = 2.0 (tangente = -0.5)
        String input = "-1.0\n2.0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PS_2_1_PAG_410.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe calcular la tangente negativa correctamente",
                  output.contains("-0.5000"));
    }

    @Test
    public void testDivisionPorCero() {
        // Simular entrada: seno = 1.0, coseno = 0.0 (división por cero)
        String input = "1.0\n0.0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PS_2_1_PAG_410.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe mostrar mensaje de error por división entre cero",
                  output.contains("Error: El coseno es 0"));
        assertTrue("Debe indicar que la tangente no está definida",
                  output.contains("no está definida"));
    }
}

