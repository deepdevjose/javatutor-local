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
 * Pruebas para la clase PS_2_12_R.
 */
public class PS_2_12_RTest { // El nombre del archivo debe ser PS_2_12_RTest.java

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

    private void runTestWithInput(String input, String expectedSport) {
        // Limpiar el contenido de la salida antes de cada ejecución
        outContent.reset();
        
        // Simular la entrada del usuario
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Ejecutar el main
        PS_2_12_R.main(new String[]{});

        // Verificar la salida
        String output = outContent.toString();
        assertTrue(output.contains("Deporte apropiado: " + expectedSport),
            "Para una temperatura de " + input.trim() + "°F, el deporte debe ser " + expectedSport);
    }

    @Test
    void testDeportesPorRango() {
        runTestWithInput("90\n", "Natación"); // > 85
        runTestWithInput("85.1\n", "Natación"); // > 85
        runTestWithInput("85\n", "Tenis"); // <= 85 y > 70
        runTestWithInput("70.1\n", "Tenis"); // <= 85 y > 70
        runTestWithInput("70\n", "Golf"); // <= 70 y > 32
        runTestWithInput("32.1\n", "Golf"); // <= 70 y > 32
        runTestWithInput("32\n", "Esquí"); // <= 32 y > 10
        runTestWithInput("10.1\n", "Esquí"); // <= 32 y > 10
        runTestWithInput("10\n", "Marcha"); // <= 10
        runTestWithInput("-5\n", "Marcha"); // <= 10
    }
}