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
 * Clase de prueba para P14_7_ej_5_1.
 * Simula la entrada del usuario y captura la salida para verificar el resultado.
 */
public class P14_7_ej_5_1Test {

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
        P14_7_ej_5_1_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoSeIngresanDatos_deberiaImprimirReporte() {
        String input = "Juan Perez\nAvenida Siempre Viva 742\nSistemas Computacionales\n123456\n";
        provideInputAndRun(input);

        String output = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(output.contains("Nombre: Juan Perez"), "El reporte debe contener el nombre correcto.");
        assertTrue(output.contains("Matrícula: 123456"), "El reporte debe contener la matrícula correcta.");
        assertTrue(output.contains("Dirección: Avenida Siempre Viva 742"), "El reporte debe contener la dirección correcta.");
        assertTrue(output.contains("Carrera: Sistemas Computacionales"), "El reporte debe contener la carrera correcta.");
    }
}