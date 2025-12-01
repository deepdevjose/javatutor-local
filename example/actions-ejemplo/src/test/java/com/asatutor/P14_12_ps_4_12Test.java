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

public class P14_12_ps_4_12Test {

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
        P14_12_ps_4_12_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoSeIngresanVentas_deberiaCalcularReportesCorrectamente() {
        // 4 registros de venta
        String input = "4\n" +
                       "1 1 10\n" + // Día 1, Modelo 1 (10*10.0=100)
                       "1 2 5\n" +  // Día 1, Modelo 2 (5*15.0=75)
                       "2 1 2\n" +  // Día 2, Modelo 1 (2*10.0=20)
                       "2 3 8\n";   // Día 2, Modelo 3 (8*12.5=100)
        provideInputAndRun(input);

        String output = outContent.toString().replace(",", ".");
        assertTrue(output.contains("Modelo 1: $120.00"), "El total para el Modelo 1 debe ser 120.00");
        assertTrue(output.contains("Día 1: $175.00"), "El total para el Día 1 debe ser 175.00");
        assertTrue(output.contains("El modelo que más dinero produjo fue el modelo 1"), "El Modelo 1 debe ser el más vendido.");
    }
}
