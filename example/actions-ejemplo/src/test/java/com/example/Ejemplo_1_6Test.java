package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Ejemplo_1_6Test {

    @Test
    void testObtenerValoresInversos_NumerosPositivos() {
        // 1. Arrange (Preparamos)
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        
        // El orden esperado es D, C, B, A
        int[] esperado = {40, 30, 20, 10};

        // 2. Act (Actuamos)
        int[] resultado = Ejemplo_1_6.obtenerValoresInversos(A, B, C, D);

        // 3. Assert (¡Verificamos, mija!)
        assertArrayEquals(esperado, resultado, "El arreglo inverso no es el esperado");
    }

    @Test
    void testObtenerValoresInversos_ConCerosYNegativos() {
        // 1. Arrange
        int A = -5;
        int B = 0;
        int C = 99;
        int D = -1;
        
        // El orden esperado es D, C, B, A
        int[] esperado = {-1, 99, 0, -5};

        // 2. Act
        int[] resultado = Ejemplo_1_6.obtenerValoresInversos(A, B, C, D);

        // 3. Assert
        assertArrayEquals(esperado, resultado, "El arreglo con negativos y ceros falló");
    }

    @Test
    void testObtenerValoresInversos_TodosIguales() {
        // 1. Arrange
        int A = 7;
        int B = 7;
        int C = 7;
        int D = 7;
        
        int[] esperado = {7, 7, 7, 7};

        // 2. Act
        int[] resultado = Ejemplo_1_6.obtenerValoresInversos(A, B, C, D);

        // 3. Assert
        assertArrayEquals(esperado, resultado, "El arreglo con números iguales falló");
    }
}