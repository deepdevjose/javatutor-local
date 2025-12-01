package com.asatutor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Clase de prueba para P14_9_ps_3_6.
 * Simula la entrada del usuario y captura la salida para verificar el resultado.
 */
public class P14_9_ps_3_6Test {

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

    private void provideInputAndRun(String data) {
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        System.setIn(testInput);
        P14_9_ps_3_6_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoSueldosSonMixtos_deberiaAplicarAumentoCorrectamente() {
        // 3 empleados con sueldos: 500 (<800), 800 (==800), 1000 (>800)
        String input = "3\n500\n800\n1000\n";
        provideInputAndRun(input);

        String output = outContent.toString().replace(",", ".");
        assertTrue(output.contains("Nuevo sueldo: $575.00"), "El sueldo de 500 debe aumentar a 575.00");
        assertTrue(output.contains("Nuevo sueldo: $800.00"), "El sueldo de 800 no debe cambiar.");
        assertTrue(output.contains("Nuevo sueldo: $1000.00"), "El sueldo de 1000 no debe cambiar.");
    }
}