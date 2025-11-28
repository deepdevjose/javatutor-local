package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Pruebas para la clase Problema_4_4_R.
 */
public class Problema_4_4_RTest { // El nombre del archivo debe ser Problema_4_4RTest.java

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
        // No hay entrada simulada porque el programa no la necesita.
        Problema_4_4_R.main(new String[]{});

        // 2. Verificación: Comprobamos si la salida contiene el arreglo esperado.
        String output = outContent.toString();
        String expectedArrayString = "[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113]";

        assertTrue(output.contains("Los primeros 30 números primos son:"), "La salida debe contener el título correcto.");
        // Usamos trim() en la salida para eliminar posibles saltos de línea al final.
        assertTrue(output.trim().endsWith(expectedArrayString), "La salida debe terminar con el arreglo de los primeros 30 primos.");
    }
}