package com.asatutor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Clase de prueba para P14_2_ej_2_6.
 * Esta prueba redirige la entrada y salida estándar para simular
 * la interacción del usuario y verificar el resultado en la consola.
 */
public class P14_2_ej_2_6Test {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    /**
     * Simula la entrada del usuario y ejecuta el método main.
     * @param data El dato a simular como entrada del usuario (ej. "1\n").
     */
    private void provideInputAndRun(String data) {
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        System.setIn(testInput);
        P14_2_ej_2_6_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoSelectorEs1_deberiaRealizarAccion1() {
        provideInputAndRun("1\n");
        String output = outContent.toString();
        assertTrue(output.contains("Realizando acción 1"), "La salida debería contener 'Realizando acción 1'");
        assertTrue(output.contains("Realizando acción X"), "La salida siempre debe contener 'Realizando acción X'");
    }

    @Test
    void main_cuandoSelectorEs4_deberiaRealizarAccion2() {
        provideInputAndRun("4\n");
        String output = outContent.toString();
        assertTrue(output.contains("Realizando acción 2"), "La salida debería contener 'Realizando acción 2'");
        assertTrue(output.contains("Realizando acción X"), "La salida siempre debe contener 'Realizando acción X'");
    }

    @Test
    void main_cuandoSelectorEsOtroValor_deberiaRealizarAccion3() {
        provideInputAndRun("99\n");
        String output = outContent.toString();
        assertTrue(output.contains("Realizando acción 3"), "La salida debería contener 'Realizando acción 3'");
        assertTrue(output.contains("Realizando acción X"), "La salida siempre debe contener 'Realizando acción X'");
    }
}