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
 * Pruebas para la clase PS_2_14R.
 */
public class PS_2_14_RTest { // El nombre del archivo debe ser PS_2_14RTest.java

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

    private void runTestWithInput(String input, double expectedValue) {
        outContent.reset(); // Limpiar la salida para la nueva prueba
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        PS_2_14_R.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("El resultado de f(x) es: " + expectedValue),
            "Para x=" + input.trim() + ", el resultado debe ser " + expectedValue);
    }

    @Test
    void testAllModuloCases() {
        // Caso mod 0: x = 4 -> f(x) = 4^2 = 16.0
        runTestWithInput("4\n", 16.0);

        // Caso mod 1: x = 5 -> f(x) = 5 / 6.0 = 0.833...
        runTestWithInput("5\n", 5.0 / 6.0);

        // Caso mod 2: x = 6 -> f(x) = sqrt(6) = 2.449...
        runTestWithInput("6\n", Math.sqrt(6));

        // Caso mod 3: x = 7 -> f(x) = 7^3 + 5 = 348.0
        runTestWithInput("7\n", 348.0);
    }
}