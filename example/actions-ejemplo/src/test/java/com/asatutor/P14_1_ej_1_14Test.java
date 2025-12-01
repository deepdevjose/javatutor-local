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
 * Clase de prueba para App.
 *
 * Probar un método `main` que interactúa con la consola (System.in y System.out)
 * es más complejo que probar métodos simples.
 *
 * Aquí se muestra cómo hacerlo:
 * 1. Se redirige la entrada estándar (System.in) para simular que un usuario escribe datos.
 * 2. Se redirige la salida estándar (System.out) para "capturar" lo que el programa imprime.
 * 3. Se llama al método main.
 * 4. Se comprueba que la salida capturada sea la esperada.
 * 5. Se restauran los flujos originales de System.in y System.out.
 */
public class P14_1_ej_1_14Test {

    // Guardamos los flujos originales de la consola
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    // Usaremos un ByteArrayOutputStream para capturar la salida
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        // Redirigimos System.out a nuestro stream para capturar la salida
        System.setOut(new PrintStream(outContent));
        // Establecemos el Locale para asegurar que el punto decimal es '.'
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    public void restoreStreams() {
        // Restauramos los flujos originales
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    /**
     * Simula la entrada del usuario y comprueba la salida del programa.
     */
    private void provideInputAndRun(String data) {
        // Creamos un stream de entrada con los datos proporcionados
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        // Redirigimos System.in a nuestro stream de prueba
        System.setIn(testInput);

        // Llamamos al método main para que se ejecute con nuestra entrada simulada
        P14_1_ej_1_14_tmpl.main(new String[0]);
    }

    @Test
    void main_cuandoSeIntroduceUnNumeroPositivo_deberiaImprimirCuadradoYCubo() {
        // Proporcionamos el número "5" como si el usuario lo escribiera,
        // seguido de un salto de línea.
        provideInputAndRun("5\n");

        // Capturamos la salida del programa como un String
        String output = outContent.toString();

        // Comprobamos que la salida contiene los resultados esperados.
        // Usamos assertTrue y contains para ser flexibles con el texto de la pregunta.
        assertTrue(output.contains("El cuadrado de 5 es: 25.0"), "La salida debería contener el cuadrado de 5.");
        assertTrue(output.contains("El cubo de 5 es: 125.0"), "La salida debería contener el cubo de 5.");
    }

    @Test
    void main_cuandoSeIntroduceCero_deberiaImprimirCero() {
        provideInputAndRun("0\n");
        String output = outContent.toString();
        assertTrue(output.contains("El cuadrado de 0 es: 0.0"), "La salida debería contener el cuadrado de 0.");
        assertTrue(output.contains("El cubo de 0 es: 0.0"), "La salida debería contener el cubo de 0.");
    }
}