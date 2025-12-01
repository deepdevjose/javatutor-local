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

/**
 * Clase de prueba para P14_8_ps_1_7.
 * Simula la entrada del usuario y captura la salida para verificar el resultado.
 */
public class P14_8_ps_1_7Test {

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
        P14_8_ps_1_7_tmpl.main(new String[0]);
    }

    @Test
    void testCalculoConPrecioEstandar() {
        String input = "250000\n";
        provideInputAndRun(input);

        String output = outContent.toString().replace(",", ".");
        // Enganche: 250000 * 0.35 = 87500
        // Resto: 162500. Mensualidad: 162500 / 36 = 4513.888...
        assertTrue(output.contains("Enganche (35%): $87500.00"), "El enganche debe ser 87500.00");
        assertTrue(output.contains("Pago mensual (36 meses): $4513.89"), "La mensualidad debe ser 4513.89");
    }
}