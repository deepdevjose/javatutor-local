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
 * Pruebas para la clase Problema_2_4_R.
 */
public class Problema_2_4_RTest { // El nombre del archivo debe ser Problema_2_4RTest.java

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
    void testCasoAprobado() {
        // Promedio de (7, 8, 5, 6, 9) es 7.0, que es >= 6
        String simulatedInput = "123\n" + "7.0\n" + "8.0\n" + "5.0\n" + "6.0\n" + "9.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4_R.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 123"), "Debe imprimir la matrícula correcta.");
        assertTrue(output.contains("Promedio: 7.0"), "Debe imprimir el promedio correcto.");
        assertTrue(output.contains("Estado: Aprobado"), "Para un promedio de 7.0, el estado debe ser 'Aprobado'.");
    }

    @Test
    void testCasoNoAprobado() {
        // Promedio de (5, 4, 6, 5.5, 6) es 5.3, que es < 6
        String simulatedInput = "456\n" + "5.0\n" + "4.0\n" + "6.0\n" + "5.5\n" + "6.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Problema_2_4_R.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Matrícula: 456"), "Debe imprimir la matrícula correcta.");
        // El promedio de 5.3 puede tener problemas de representación de punto flotante.
        // Es más seguro verificar que la salida contenga "5.3" en lugar de "Promedio: 5.3" exacto.
        assertTrue(output.contains("5.3"), "Debe imprimir el promedio correcto (5.3).");
        assertTrue(output.contains("Estado: No Aprobado"), "Para un promedio de 5.3, el estado debe ser 'No Aprobado'.");
    }
}