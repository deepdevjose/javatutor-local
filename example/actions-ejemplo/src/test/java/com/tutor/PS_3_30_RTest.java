package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

/**
 * Pruebas para la clase PS_3_30R.
 */
public class PS_3_30_RTest { // El nombre del archivo debe ser PS_3_30RTest.java

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

    private void runTestWithInput(String input, String expectedTerms, String expectedValue) {
        outContent.reset();
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        PS_3_30_R.main(new String[]{});
        String output = outContent.toString();

        assertTrue(output.contains(expectedTerms), "La cantidad de términos no es la esperada para X=" + input.trim());
        assertTrue(output.contains(expectedValue), "El valor de SEN(X) no es el esperado para X=" + input.trim());
    }

    @Test
    void testMainExecution() {
        // Caso X=1: Se esperan 2 términos. Suma = 1 - 1/6 = 0.8333...
        runTestWithInput("1\n", "Número de términos requeridos: 2", "SEN(X) ≈ 0.8333");

        // Caso X=2: Se esperan 4 términos. Suma = 2 - 8/6 + 32/120 - 128/5040 ≈ 0.9079
        runTestWithInput("2\n", "Número de términos requeridos: 4", "SEN(X) ≈ 0.9079");

        // Caso X=0: Se espera 1 término. Suma = 0
        runTestWithInput("0\n", "Número de términos requeridos: 1", "SEN(X) ≈ 0.0");
    }
}