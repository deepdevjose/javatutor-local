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
 * Clase de prueba para P14_4_pro_3_7.
 * Simula la entrada del usuario para una serie de ventas y verifica el resumen final.
 */
public class P14_4_pro_3_7Test {

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

    private void provideInputAndRun(String input) {
        InputStream testInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInput);
        P14_4_pro_3_7_tmpl.main(new String[0]);
    }

    @Test
    void testMezclaDeVentas() {
        // 7 ventas: 3 chicas, 2 medianas, 2 grandes
        String input = "7\n150.0\n200.0\n250.5\n399.99\n400.0\n1000.0\n50.0\n";
        provideInputAndRun(input);
        String output = outContent.toString();

        assertTrue(output.contains("Ventas chicas (<= 200): 3"), "Debería haber 3 ventas chicas");
        assertTrue(output.contains("Ventas medianas (< 400): 2"), "Debería haber 2 ventas medianas");
        assertTrue(output.contains("Ventas grandes (>= 400): 2"), "Debería haber 2 ventas grandes");
    }

    @Test
    void testValoresLimite() {
        // 4 ventas: 1 chica, 2 medianas, 1 grande
        String input = "4\n200.0\n200.01\n399.99\n400.0\n";
        provideInputAndRun(input);
        String output = outContent.toString();

        assertTrue(output.contains("Ventas chicas (<= 200): 1"), "Debería haber 1 venta chica en el límite");
        assertTrue(output.contains("Ventas medianas (< 400): 2"), "Debería haber 2 ventas medianas en el límite");
        assertTrue(output.contains("Ventas grandes (>= 400): 1"), "Debería haber 1 venta grande en el límite");
    }

    @Test
    void testSinVentas() {
        // 0 ventas
        String input = "0\n";
        provideInputAndRun(input);
        String output = outContent.toString();

        assertTrue(output.contains("Ventas chicas (<= 200): 0"), "Debería haber 0 ventas chicas");
        assertTrue(output.contains("Ventas medianas (< 400): 0"), "Debería haber 0 ventas medianas");
        assertTrue(output.contains("Ventas grandes (>= 400): 0"), "Debería haber 0 ventas grandes");
    }
}