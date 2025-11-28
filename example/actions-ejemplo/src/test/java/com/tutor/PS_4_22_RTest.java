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
 * Pruebas para la clase PS_4_22R.
 */
public class PS_4_22_RTest { // El nombre del archivo debe ser PS_4_22RTest.java

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
        // 1. Preparación: Simulamos la entrada del usuario para 3 fábricas y una consulta para el mes 1.
        String simulatedInput = "3\n" + // N = 3 fábricas
            "101\n" + "10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000\n" + // Fab 101, Total=120000
            "102\n" + "25000 25000 25000 25000 25000 25000 25000 25000 25000 25000 25000 25000\n" + // Fab 102, Total=300000
            "103\n" + "160000 20000 1000 0 0 0 0 0 0 0 0 0\n" + // Fab 103, Total=181000
            "1\n"; // Mes de consulta para inciso (b)
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // 2. Ejecución
        PS_4_22_R.main(new String[]{});

        // 3. Verificación
        String output = outContent.toString();
        assertTrue(output.contains("La fábrica con mayor producción fue: 102"), "Inciso (a): La fábrica 102 debe ser la de mayor producción.");
        assertTrue(output.contains("Producción total anual: 300000.0"), "Inciso (a): La producción de la fábrica 102 debe ser 300000.0");
        assertTrue(output.contains("Fábrica clave: 103"), "Inciso (b): La fábrica 103 debe aparecer para el mes 1.");
        assertFalse(output.contains("Fábrica clave: 101"), "Inciso (b): La fábrica 101 no debe aparecer para el mes 1.");
    }
}