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
 * Clase de prueba para P14_5_1_Ejemplo_4_4_Elimina_Desordenado.
 * Simula la entrada del usuario y captura la salida para verificar el resultado.
 */
public class P14_5_1_Ejemplo_4_4_Elimina_DesordenadoTest {

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
        P14_5_1_Ejemplo_4_4_Elimina_Desordenado_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoElementoExiste_deberiaEliminarlo() {
        // Simula: tamaño 5, arreglo 10 20 30 40 50, eliminar 30
        String input = "5\n10\n20\n30\n40\n50\n30\n";
        provideInputAndRun(input);

        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(actualOutput.contains("Elemento eliminado."), "Debería mostrar el mensaje de elemento eliminado.");
        assertTrue(actualOutput.endsWith("10 20 40 50"), "El arreglo resultante no es el esperado.");
    }

    @Test
    void main_cuandoElementoNoExiste_deberiaMostrarMensaje() {
        // Simula: tamaño 3, arreglo 1 2 3, eliminar 99
        String input = "3\n1\n2\n3\n99\n";
        provideInputAndRun(input);

        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(actualOutput.contains("Elemento no encontrado."), "Debería mostrar el mensaje de elemento no encontrado.");
        assertTrue(actualOutput.endsWith("1 2 3"), "El arreglo no debería haber cambiado.");
    }
}