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
 * Pruebas para la clase PS_2_15R.
 */
public class PS_2_15_RTest { // El nombre del archivo debe ser PS_2_15RTest.java

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

    private void runTestWithInput(String input, String expectedOutput) {
        outContent.reset();
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        PS_2_15_R.main(new String[]{});
        String output = outContent.toString().trim();
        assertTrue(output.contains(expectedOutput),
            "Para la entrada:\n" + input + "\nSe esperaba que la salida contuviera:\n" + expectedOutput + "\nPero fue:\n" + output);
    }

    @Test
    void testAllOperations() {
        // Suma
        runTestWithInput("20.5\n10.5\n+\n", "Resultado: 31.0");

        // Resta
        runTestWithInput("10\n5.5\n-\n", "Resultado: 4.5");

        // Multiplicación
        runTestWithInput("10\n0.5\n*\n", "Resultado: 5.0");

        // División
        runTestWithInput("10\n4\n/\n", "Resultado: 2.5");

        // División por cero
        runTestWithInput("10\n0\n/\n", "Error: División por cero no permitida.");

        // Clave inválida
        runTestWithInput("10\n5\nx\n", "Error: Clave de operación inválida.");
    }
}