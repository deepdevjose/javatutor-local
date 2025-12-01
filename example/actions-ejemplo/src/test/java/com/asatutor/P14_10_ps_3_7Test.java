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
 * Clase de prueba para P14_10_ps_3_7.
 * Simula la entrada del usuario y captura la salida para verificar el resultado.
 */
public class P14_10_ps_3_7Test {

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
        P14_10_ps_3_7_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoSueldosSonMixtos_deberiaCalcularNominaCorrectamente() {
        // 3 empleados con sueldos: 5000 (<10k), 20000 (entre 10k-25k), 30000 (>25k)
        String input = "3\n5000\n20000\n30000\n";
        provideInputAndRun(input);

        String output = outContent.toString().replace(",", ".");
        assertTrue(output.contains("Nuevo sueldo: $5500.00"), "El sueldo de 5000 debe aumentar a 5500.00");
        assertTrue(output.contains("Nuevo sueldo: $21400.00"), "El sueldo de 20000 debe aumentar a 21400.00");
        assertTrue(output.contains("Nuevo sueldo: $32400.00"), "El sueldo de 30000 debe aumentar a 32400.00");
        assertTrue(output.contains("El total de la nueva nómina es: $59300.00"), "La nómina total debe ser 59300.00");
    }
}