package com.example;

// Importaciones necesarias para JUnit 5
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PS_2_5_Test {

    @Test
    void testCalcularResultados_ValoresNormales() {
        // 1. Arrange (Preparar)
        int A = 10;
        int B = 5;
        int C = 8;
        int D = 2;

        // (A-C)^2 / D = (10-8)^2 / 2 = 2^2 / 2 = 4 / 2 = 2
        // (A-B)^3 / D = (10-5)^3 / 2 = 5^3 / 2 = 125 / 2 = 62 (división entera)
        int[] esperado = {2, 62}; 

        // 2. Act (Actuar)
        int[] resultado = PS_2_5.calcularResultados(A, B, C, D);

        // 3. Assert (Verificar)
        assertArrayEquals(esperado, resultado, "El cálculo con valores normales es incorrecto");
    }

    @Test
    void testCalcularResultados_DivisionPorCero() {
        // 1. Arrange
        int A = 10;
        int B = 5;
        int C = 8;
        int D = 0; // El valor que debe fallar

        // 2. Act & 3. Assert
        // Verificamos que se lanza la excepción correcta
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            PS_2_5.calcularResultados(A, B, C, D);
        });

        // Opcional: Verificar el mensaje de la excepción
        String mensajeEsperado = "D no puede ser igual a 0. No se puede calcular la expresión.";
        assertEquals(mensajeEsperado, exception.getMessage(), "El mensaje de error no es el esperado");
    }

    @Test
    void testCalcularResultados_ResultadoCero() {
        // 1. Arrange
        int A = 5;
        int B = 5; // (A-B) será 0
        int C = 5; // (A-C) será 0
        int D = 10;

        // (5-5)^2 / 10 = 0 / 10 = 0
        // (5-5)^3 / 10 = 0 / 10 = 0
        int[] esperado = {0, 0};

        // 2. Act
        int[] resultado = PS_2_5.calcularResultados(A, B, C, D);

        // 3. Assert
        assertArrayEquals(esperado, resultado, "El cálculo con resultado 0 es incorrecto");
    }

    @Test
    void testCalcularResultados_TruncamientoEntero() {
        // 1. Arrange
        int A = 3;
        int B = 1;
        int C = 1;
        int D = 3;

        // (A-C)^2 / D = (3-1)^2 / 3 = 2^2 / 3 = 4 / 3 = 1 (se trunca)
        // (A-B)^3 / D = (3-1)^3 / 3 = 2^3 / 3 = 8 / 3 = 2 (se trunca)
        int[] esperado = {1, 2};

        // 2. Act
        int[] resultado = PS_2_5.calcularResultados(A, B, C, D);

        // 3. Assert
        assertArrayEquals(esperado, resultado, "El truncamiento de la división entera falló");
    }
}