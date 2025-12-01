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

public class P14_13_ps_4_28Test {

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
        P14_13_ps_4_28_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoEsCuadradoMagico_deberiaImprimirExito() {
        // Cuadrado mágico de 3x3 (Lo Shu)
        String input = "3\n8\n1\n6\n3\n5\n7\n4\n9\n2\n";
        provideInputAndRun(input);
        assertTrue(outContent.toString().contains("La matriz es un cuadrado mágico"), "Debería detectar un cuadrado mágico.");
    }

    @Test
    void main_cuandoNoEsCuadradoMagico_deberiaImprimirFallo() {
        // Matriz no mágica
        String input = "3\n1\n2\n3\n4\n5\n6\n7\n8\n9\n";
        provideInputAndRun(input);
        assertTrue(outContent.toString().contains("La matriz no es un cuadrado mágico"), "Debería detectar que no es un cuadrado mágico.");
    }
}
