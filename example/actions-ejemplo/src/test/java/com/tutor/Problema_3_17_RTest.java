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
 * Pruebas para la clase Problema_3_17_R.
 */
public class Problema_3_17_RTest { // El nombre del archivo debe ser Problema_3_17RTest.java

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
    void testPrimosMenoresQue20() {
        // 1. Preparación: Simulamos que el usuario ingresa "20"
        String simulatedInput = "20\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // 2. Ejecución: Llamamos al main del archivo resuelto
        Problema_3_17_R.main(new String[]{});

        // 3. Verificación
        String output = outContent.toString();
        // Los primos menores que 20 son: 2, 3, 5, 7, 11, 13, 17, 19. Son 8 números.
        // Buscamos la línea exacta para evitar falsos positivos con la línea de resumen.
        assertFalse(output.contains("Número Primo: 1\n"), "No debe imprimir el 1, ya que no es primo.");
        assertTrue(output.contains("Número Primo: 2"), "Debe imprimir el 2");
        assertTrue(output.contains("Número Primo: 19"), "Debe imprimir el 19");
        assertTrue(output.contains("Total de primos menores que 20: 8"), "El conteo final de primos menores que 20 debe ser 8.");
    }
}