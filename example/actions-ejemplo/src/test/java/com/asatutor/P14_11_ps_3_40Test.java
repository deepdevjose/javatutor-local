package com.asatutor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class P14_11_ps_3_40Test {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    private void provideInputAndRun(String data) {
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        System.setIn(testInput);
        P14_11_ps_3_40_tmpl.main(new String[0]);
    }

    @Test
    void testAnalisisConVariosElementos() {
        // Simula la entrada de 4 elementos y luego finaliza con "NN"
        String input = "Plata\n63.0\n429.0\n" +
                       "Cobre\n59.6\n401.0\n" +
                       "Azufre\n0.1\n0.2\n" +
                       "Vidrio\n0.01\n1.1\n" +
                       "NN\n";
        provideInputAndRun(input);

        String output = outContent.toString();
        assertTrue(output.contains("Mejor conductor eléctrico: Plata"), "Plata debería ser el mejor conductor eléctrico.");
        assertTrue(output.contains("Peor conductor eléctrico: Vidrio"), "Vidrio debería ser el peor conductor eléctrico.");
        assertTrue(output.contains("Mejor conductor térmico: Plata"), "Plata debería ser el mejor conductor térmico.");
        assertTrue(output.contains("Peor conductor térmico: Azufre"), "Azufre debería ser el peor conductor térmico.");
    }
}