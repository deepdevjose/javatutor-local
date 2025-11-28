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
 * Pruebas para la clase Problema_4_17_R.
 */
public class Problema_4_17_RTest { // El nombre del archivo debe ser Problema_4_17RTest.java

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
        // 1. Preparación
        // Matriz de 2x3: [[1, 2, 3], [4, 5, 6]]
        String simulatedInput = "2\n" + "3\n" + "1\n" + "2\n" + "3\n" + "4\n" + "5\n" + "6\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // 2. Ejecución
        Problema_4_17_R.main(new String[]{});

        // 3. Verificación
        String output = outContent.toString().replace("\r\n", "\n"); // Normalizar saltos de línea
        assertTrue(output.contains("1 4 \n2 5 \n3 6 \n"), "La salida debe contener la matriz transpuesta 3x2 formateada.");
    }
}