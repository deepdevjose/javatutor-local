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
 * Pruebas para la clase PS_1_1R.
 */
public class PS_1_1_RTest { // El nombre del archivo debe ser PS_1_1RTest.java

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

    @Test
    void testMainExecution() {
        // 1. Preparación: Simulamos que el usuario ingresa "10.0" y "5.0"
        String simulatedInput = "10.0\n5.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // 2. Ejecución
        PS_1_1_R.main(new String[]{});

        // 3. Verificación
        String output = outContent.toString();
        assertTrue(output.contains("Suma: 15.0"), "La salida debe contener la suma correcta.");
        assertTrue(output.contains("Resta: 5.0"), "La salida debe contener la resta correcta.");
        assertTrue(output.contains("Multiplicación: 50.0"), "La salida debe contener la multiplicación correcta.");
    }
}