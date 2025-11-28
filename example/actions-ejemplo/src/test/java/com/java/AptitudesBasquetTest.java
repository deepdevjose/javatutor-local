import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AptitudesBasquetTest {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void testAlumnaApta() {
        // Simular entrada para una alumna que cumple los requisitos
        String input = "Ana\nF\n20\n85\n1.75\nX\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        AptitudesBasquet.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe identificar a Ana como alumna apta",
                  output.contains("(Apta) -> Ana"));
        assertTrue("Debe mostrar porcentaje correcto de alumnas aptas",
                  output.contains("Porcentaje de alumnas aptas: 100.00%"));
    }

    @Test
    public void testAlumnoApto() {
        // Simular entrada para un alumno que cumple los requisitos
        String input = "Juan\nM\n20\n100\n1.85\nX\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        AptitudesBasquet.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe identificar a Juan como alumno apto",
                  output.contains("(Apto) -> Juan"));
        assertTrue("Debe mostrar porcentaje correcto de alumnos aptos",
                  output.contains("Porcentaje de alumnos aptos: 100.00%"));
    }

    @Test
    public void testAlumnosNoAptos() {
        // Simular entrada para alumnos que no cumplen los requisitos
        String input = "Maria\nF\n20\n95\n1.70\n" +  // Muy pesada y baja
                      "Pedro\nM\n20\n120\n1.80\nX\n"; // Muy pesado y bajo
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        AptitudesBasquet.main(new String[]{});
        String output = outputContent.toString();

        assertFalse("No debe mostrar a Maria como apta",
                   output.contains("(Apta) -> Maria"));
        assertFalse("No debe mostrar a Pedro como apto",
                   output.contains("(Apto) -> Pedro"));
        assertTrue("Debe mostrar 0% de alumnas aptas",
                  output.contains("Porcentaje de alumnas aptas: 0.00%"));
        assertTrue("Debe mostrar 0% de alumnos aptos",
                  output.contains("Porcentaje de alumnos aptos: 0.00%"));
    }

    @Test
    public void testPorcentajesMixtos() {
        // Simular entrada para varios alumnos, algunos aptos y otros no
        String input = "Ana\nF\n20\n85\n1.75\n" +     // Apta
                      "Maria\nF\n20\n95\n1.70\n" +    // No apta
                      "Juan\nM\n20\n100\n1.85\n" +    // Apto
                      "Pedro\nM\n20\n120\n1.80\nX\n"; // No apto
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        AptitudesBasquet.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe mostrar 50% de alumnas aptas",
                  output.contains("Porcentaje de alumnas aptas: 50.00%"));
        assertTrue("Debe mostrar 50% de alumnos aptos",
                  output.contains("Porcentaje de alumnos aptos: 50.00%"));
    }
}