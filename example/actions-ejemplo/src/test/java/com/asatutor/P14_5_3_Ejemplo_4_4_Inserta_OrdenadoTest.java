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
 * Clase de prueba para P14_5_3_Ejemplo_4_4_Inserta_Ordenado.
 * Simula la entrada del usuario y captura la salida para verificar el resultado.
 */
public class P14_5_3_Ejemplo_4_4_Inserta_OrdenadoTest {

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
        P14_5_3_Ejemplo_4_4_Inserta_Ordenado_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoSeInsertaCorrectamente_deberiaMostrarArreglo() {
        // Simula: tamaño 4, arreglo 10 20 40 50, insertar 30
        String input = "4\n10\n20\n40\n50\n30\n";
        provideInputAndRun(input);

        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(actualOutput.contains("Elemento insertado exitosamente."), "Debería mostrar el mensaje de éxito.");
        assertTrue(actualOutput.endsWith("10 20 30 40 50"), "El arreglo resultante no es el esperado.");
    }

    @Test
    void main_cuandoElementoYaExiste_deberiaMostrarMensaje() {
        // Simula: tamaño 3, arreglo 10 20 30, insertar 20
        String input = "3\n10\n20\n30\n20\n";
        provideInputAndRun(input);

        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(actualOutput.contains("No se pudo insertar el elemento (ya existe)."), "Debería mostrar el mensaje de que ya existe.");
        assertTrue(actualOutput.endsWith("10 20 30"), "El arreglo no debería haber cambiado.");
    }
}