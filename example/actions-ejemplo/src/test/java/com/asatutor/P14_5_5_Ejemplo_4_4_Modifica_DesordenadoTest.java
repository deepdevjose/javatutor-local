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
 * Clase de prueba para P14_5_5_Ejemplo_4_4_Modifica_Desordenado.
 * Simula la entrada del usuario y captura la salida de la consola para verificar
 * que el programa se comporta como se espera.
 */
public class P14_5_5_Ejemplo_4_4_Modifica_DesordenadoTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        // Redirige la salida estándar para capturarla
        System.setOut(new PrintStream(outContent));
        // Asegura un formato de número consistente
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    public void restoreStreams() {
        // Restaura los flujos originales de entrada y salida
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    /**
     * Proporciona una cadena de texto como entrada simulada para el programa y lo ejecuta.
     * @param data La entrada del usuario simulada, con saltos de línea (\n).
     */
    private void provideInputAndRun(String data) {
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        System.setIn(testInput);
        P14_5_5_Ejemplo_4_4_Modifica_Desordenado_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoElementoExiste_deberiaModificarloEImprimirArreglo() {
        // Simula la entrada: tamaño 5, arreglo 10 20 30 40 50, modificar 30 por 99
        String input = "5\n10\n20\n30\n40\n50\n30\n99\n";
        provideInputAndRun(input);

        // Capturamos la salida y la normalizamos para una búsqueda más sencilla.
        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");

        // Verificamos que el mensaje de "Arreglo modificado" esté presente.
        assertTrue(actualOutput.contains("Arreglo modificado:"), "Debería mostrar el mensaje de arreglo modificado.");

        // Verificamos que el resultado final del arreglo (10 20 99 40 50) esté en la salida.
        assertTrue(actualOutput.endsWith("10 20 99 40 50"), "El arreglo modificado no es el esperado.");
    }

    @Test
    void main_cuandoElementoNoExiste_deberiaImprimirMensaje() {
        String input = "3\n1\n2\n3\n99\n100\n";
        provideInputAndRun(input);

        String expectedOutput = "El elemento 99 no está en el arreglo.";
        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(actualOutput.endsWith(expectedOutput));
    }

    @Test
    void main_cuandoArregloEstaVacio_deberiaImprimirMensaje() {
        String input = "0\n";
        provideInputAndRun(input);
        String expectedOutput = "El arreglo está vacío.";
        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(actualOutput.endsWith(expectedOutput));
    }
}