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
 * Pruebas para la clase PS_2_13R.
 */
public class PS_2_13_RTest { // El nombre del archivo debe ser PS_2_13RTest.java

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
        // Caso 1: C es el mayor
        String simulatedInput = "10.9\n50.1\n100.5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // 2. Ejecución
        PS_2_13_R.main(new String[]{});

        // 3. Verificación
        String output = outContent.toString();
        assertTrue(output.contains("El numero mayor es: 100.5"), "La salida debe identificar a 100.5 como el mayor.");
    }
}