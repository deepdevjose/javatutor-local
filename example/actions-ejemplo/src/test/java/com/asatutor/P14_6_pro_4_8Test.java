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
 * Clase de prueba para P14_6_pro_4_8.
 * Simula la entrada del usuario y captura la salida para verificar el resultado.
 */
public class P14_6_pro_4_8Test {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        // Usar Locale.US para asegurar que el punto decimal sea '.'
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
        P14_6_pro_4_8_tmpl.main(new String[0]);
    }

    @Test
    void testMezclaDeCalificaciones() {
        // 5 alumnos con calificaciones: 10, 9, 7, 6, 5
        String input = "5\n10\n9\n7\n6\n5\n";
        provideInputAndRun(input);

        // Normalizar la salida para facilitar la búsqueda
        String output = outContent.toString().replace(",", ".");
        
        assertTrue(output.contains("Promedio general: 7.40"), "El promedio debe ser 7.40");
        assertTrue(output.contains("Alumnos aprobados (>6): 3"), "Debe haber 3 aprobados");
        assertTrue(output.contains("Alumnos reprobados (<=6): 2"), "Debe haber 2 reprobados");
        assertTrue(output.contains("Porcentaje de aprobados: 60.00%"), "El porcentaje de aprobados debe ser 60.00%");
        assertTrue(output.contains("Porcentaje de reprobados: 40.00%"), "El porcentaje de reprobados debe ser 40.00%");
        assertTrue(output.contains("Alumnos con calificación mayor a 8: 2"), "Debe haber 2 alumnos con más de 8");
    }

    @Test
    void testSinCalificaciones() {
        String input = "0\n";
        provideInputAndRun(input);
        assertTrue(outContent.toString().contains("No hay alumnos para procesar."), "Debe mostrar un mensaje si no hay alumnos");
    }
}