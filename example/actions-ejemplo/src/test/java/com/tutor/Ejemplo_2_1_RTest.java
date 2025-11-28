package com.tutor;

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
 * Esta clase prueba el método 'main' de la clase Ejemplo_2_1.
 */
public class Ejemplo_2_1_RTest {

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
    void testCasoAprobado() {
        // 1. Preparación: Simulamos que el usuario ingresa "9.5"
        String simulatedInput = "9.5\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        
        // 2. Ejecución: Llamamos al main del archivo resuelto
        Ejemplo_2_1_R.main(new String[]{});
        
        // 3. Verificación: La salida debe contener "Aprobado"
        String output = outContent.toString();
        assertTrue(output.contains("Aprobado"), "Para una calificación de 9.5, la salida debería ser 'Aprobado'");
    }

    @Test
    void testCasoNoAprobado() {
        // 1. Preparación: Simulamos que el usuario ingresa "7.0"
        String simulatedInput = "7.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        
        // 2. Ejecución: Llamamos al main del archivo resuelto
        Ejemplo_2_1_R.main(new String[]{});
        
        // 3. Verificación: La salida NO debe contener "Aprobado".
        // Usamos trim() para quitar espacios en blanco y saltos de línea.
        // La salida de los "System.out.print" puede quedar, pero no la palabra "Aprobado".
        String output = outContent.toString();
        assertFalse(output.contains("Aprobado"), "Para una calificación de 7.0, no se debería imprimir 'Aprobado'");
    }
}