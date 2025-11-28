package com.tutor; // O tu paquete específico

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

/**
 * Pruebas para la clase PS_5_1R.
 */
public class PS_5_1_RTest { // El nombre del archivo debe ser PS_5_1RTest.java

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        Locale.setDefault(Locale.US);
    }

    @AfterEach
    void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testMainExecution() {
        // 1. Preparación: Simulamos la entrada para 1 producto, una venta y luego salir.
        String simulatedInput = "1\n" + // N = 1 producto
            "101\n" + // Clave
            "Martillo\n" + // Descripción
            "20\n" + // Existencia
            "5\n" + // Mínimo
            "150.0\n" + // Precio
            "a\n" + // Opción Venta
            "101\n" + // Clave para vender
            "16\n" + // Cantidad a vender (deja la existencia en 4, por debajo del mínimo 5)
            "e\n"; // Salir
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // 2. Ejecución
        PS_5_1_R.main(new String[]{});
        
        // 3. Verificación
        String output = outContent.toString();
        assertTrue(output.contains("Venta realizada correctamente. ¡Atención! La existencia del producto está por debajo del mínimo."), 
            "Debe mostrar el mensaje de venta exitosa con advertencia de mínimo.");
    }
}

