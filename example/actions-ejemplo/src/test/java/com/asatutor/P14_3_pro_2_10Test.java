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
 * Clase de prueba para P14_3_pro_2_10.
 * Simula la entrada del usuario para tres números y verifica el resultado.
 */
public class P14_3_pro_2_10Test {

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

    private void provideInputAndRun(String input) {
        InputStream testInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInput);
        P14_3_pro_2_10_tmpl.main(new String[0]);
    }

    @Test
    void testA_EsElMayor() {
        provideInputAndRun("10\n5\n0\n");
        assertTrue(outContent.toString().contains("A es el mayor."), "A debería ser el mayor");
    }

    @Test
    void testB_EsElMayor() {
        provideInputAndRun("5\n10\n0\n");
        assertTrue(outContent.toString().contains("B es el mayor."), "B debería ser el mayor");
    }

    @Test
    void testC_EsElMayor() {
        provideInputAndRun("0\n5\n10\n");
        assertTrue(outContent.toString().contains("C es el mayor."), "C debería ser el mayor");
    }

    @Test
    void testA_y_B_SonMayores() {
        provideInputAndRun("10\n10\n5\n");
        assertTrue(outContent.toString().contains("A y B son los mayores."), "A y B deberían ser los mayores");
    }

    @Test
    void testA_y_C_SonMayores() {
        provideInputAndRun("10\n5\n10\n");
        assertTrue(outContent.toString().contains("A y C son los mayores."), "A y C deberían ser los mayores");
    }

    @Test
    void testB_y_C_SonMayores() {
        provideInputAndRun("5\n10\n10\n");
        assertTrue(outContent.toString().contains("B y C son los mayores."), "B y C deberían ser los mayores");
    }

    @Test
    void testTodosSonIguales() {
        provideInputAndRun("10\n10\n10\n");
        assertTrue(outContent.toString().contains("A, B y C son iguales."), "La salida para tres números iguales es incorrecta");
    }
}