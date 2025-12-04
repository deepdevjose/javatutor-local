import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PS_4_3_PAG_441Test {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void testConteoMixto() {
        // N = 6 : 3 positivos, 2 negativos, 1 cero
        StringBuilder input = new StringBuilder();
        input.append("6\n");
        input.append("5\n-3\n0\n10\n-1\n2\n");
        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_4_3_PAG_441.main(new String[]{});
        String output = outputContent.toString();

        assertTrue(output.contains("Números Positivos: 3"));
        assertTrue(output.contains("Números Negativos: 2"));
        assertTrue(output.contains("Números Nulos (cero): 1"));
    }

    @Test
    public void testTodosCeros() {
        // N = 4: all zeros
        StringBuilder input = new StringBuilder();
        input.append("4\n");
        input.append("0\n0\n0\n0\n");
        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_4_3_PAG_441.main(new String[]{});
        String output = outputContent.toString();

        assertTrue(output.contains("Números Positivos: 0"));
        assertTrue(output.contains("Números Negativos: 0"));
        assertTrue(output.contains("Números Nulos (cero): 4"));
    }

    @Test
    public void testNInvalido() {
        // N = 0 (invalid)
        StringBuilder input = new StringBuilder();
        input.append("0\n");
        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_4_3_PAG_441.main(new String[]{});
        String output = outputContent.toString();

        assertTrue(output.contains("Error: El número de elementos debe estar entre 1 y 300."));
    }
}

