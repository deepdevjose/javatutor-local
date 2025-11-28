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
 * Pruebas para la clase Problema_3_1_R.
 */
public class Problema_3_1_RTest { // El nombre del archivo debe ser Problema_3_1RTest.java

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
    void testCalculoMixto() {
        // Impares: 5, 3 (Suma=8). Pares: 10, 8, 2 (Suma=20, Prom=6.66...)
        String simulatedInput = "5\n" + // Cantidad de números
                                "5\n" + "10\n" + "3\n" + "8\n" + "2\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_3_1_R.main(new String[]{});

        String output = outContent.toString();
        // Usamos String.format con Locale.US para asegurar el punto decimal
        String expectedAvg = String.format(Locale.US, "%.3f", 20.0 / 3.0);
        
        assertTrue(output.contains("Suma de impares: 8"), "La salida debe contener la suma de impares correcta.");
        assertTrue(output.contains("Promedio de pares: " + expectedAvg.substring(0, 5)), "La salida debe contener el promedio de pares correcto (aprox 6.66).");
    }
}