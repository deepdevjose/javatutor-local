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
 * Clase de prueba para P14_5_4_Ejemplo_4_4_Insertar_Desordenado.
 * Simula la entrada del usuario y captura la salida para verificar el resultado.
 */
public class P14_5_4_Ejemplo_4_4_Insertar_DesordenadoTest {

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
        P14_5_4_Ejemplo_4_4_Insertar_Desordenado_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoUsuarioInsertaVariosYPara_deberiaMostrarArregloFinal() {
        // Simula: insertar 10, continuar (s), insertar 20, parar (n)
        String input = "10\ns\n20\nn\n";
        provideInputAndRun(input);

        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(actualOutput.contains("Arreglo actual: 10 20"), "Debería mostrar el arreglo con 10 y 20.");
        assertTrue(actualOutput.endsWith("Proceso finalizado."), "Debería finalizar el proceso.");
    }

    @Test
    void main_cuandoArregloSeLlena_deberiaMostrarMensajeDeLleno() {
        // Simula llenar un arreglo de capacidad 5
        String input = "1\ns\n2\ns\n3\ns\n4\ns\n5\n";
        provideInputAndRun(input);

        String actualOutput = outContent.toString().trim().replaceAll("\\s+", " ");
        assertTrue(actualOutput.contains("Arreglo actual: 1 2 3 4 5"), "Debería mostrar el arreglo lleno.");
        assertTrue(actualOutput.contains("No hay más espacio para insertar elementos."), "Debería mostrar el mensaje de que no hay espacio.");
        assertTrue(actualOutput.endsWith("Proceso finalizado."), "Debería finalizar el proceso.");
    }
}