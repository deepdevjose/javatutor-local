package com.tutor; // Mismo paquete que el otro archivo

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
 * Esta clase prueba el método 'main' de la clase Ejemplo_1_8_R.
 * Demuestra cómo simular la entrada del usuario y capturar la salida de la consola.
 */
public class Ejemplo_1_8_RTest { 

    // Guardamos los flujos originales de la consola para restaurarlos después de cada prueba.
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    // Este objeto capturará la salida que normalmente iría a la consola.
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        // Antes de cada prueba, redirigimos System.out a nuestro capturador.
        System.setOut(new PrintStream(outContent));
        // Aseguramos que el formato de número decimal use un punto.
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    public void restoreStreams() {
        // Después de cada prueba, restauramos los flujos originales.
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testMainExecution() {
        // 1. Preparación: Simulamos la entrada del usuario.
        // Cada '\n' simula que el usuario presiona "Enter".
        String simulatedInput = "12345\n" + // Matrícula
                                "10.0\n" + // Calificación 1
                                "9.5\n" +  // Calificación 2
                                "8.0\n" +  // Calificación 3
                                "7.5\n" +  // Calificación 4
                                "9.0\n";   // Calificación 5

        // Redirigimos System.in para que lea de nuestra cadena simulada.
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        
        // 2. Ejecución: Llamamos al método main para que se ejecute con nuestra entrada simulada.
        Ejemplo_1_8_R.main(new String[]{});
        
        // 3. Verificación: Comprobamos si la salida capturada contiene el texto esperado.
        // El promedio de (10.0 + 9.5 + 8.0 + 7.5 + 9.0) / 5.0 es 8.8.
        assertTrue(outContent.toString().contains("Promedio de calificaciones: 8.8"));
        assertTrue(outContent.toString().contains("Matrícula del alumno: 12345"));
    }
}