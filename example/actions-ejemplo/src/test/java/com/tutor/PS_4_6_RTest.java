package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Pruebas para la clase PS_4_6R.
 */
public class PS_4_6_RTest { // El nombre del archivo debe ser PS_4_6RTest.java

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testMainExecution() {
        // 1. Ejecución: Llamamos al main del archivo resuelto.
        PS_4_6_R.main(new String[]{});

        // 2. Verificación: Comprobamos si la salida contiene los valores esperados.
        String output = outContent.toString();

        assertTrue(output.contains("Los primeros 100 números Fibonacci son:"), "La salida debe contener el título correcto.");
        // Verificamos el inicio de la serie
        assertTrue(output.contains("[0, 1, 1, 2, 3, 5, 8,"), "El inicio de la serie Fibonacci no es correcto.");
        // Verificamos un número grande hacia el final para confirmar el uso de BigInteger
        // F(92) = 7540113804746346429
        assertTrue(output.contains("7540113804746346429"), "La serie debe contener números grandes, indicando el uso de BigInteger.");
    }
}