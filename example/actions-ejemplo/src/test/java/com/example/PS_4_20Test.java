package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PS_4_20Test {

    // Delta (margen de error) para comparar números double
    private static final double DELTA = 0.001;

    /**
     * Prueba el caso "normal" donde la matriz es cuadrada (M = N).
     */
    @Test
    void testGenerarArreglo_MatrizCuadrada() {
        // 1. Arrange
        int m = 3;
        int n = 3;
        double[] B = {10.0, 20.0, 30.0};
        
        // Lógica:
        // Fila i=0: [B[0], B[1], B[2]] -> [10, 20, 30] (i<=j siempre)
        // Fila i=1: [0,    B[1], B[2]] -> [ 0, 20, 30] (i > j en j=0)
        // Fila i=2: [0,    0,    B[2]] -> [ 0,  0, 30] (i > j en j=0, j=1)
        double[][] esperado = {
            { 10.0, 20.0, 30.0 },
            {  0.0, 20.0, 30.0 },
            {  0.0,  0.0, 30.0 }
        };

        // 2. Act
        double[][] resultado = PS_4_20.generarArregloA(m, n, B);

        // 3. Assert
        // Para 2D arrays, debemos verificar fila por fila para poder usar DELTA
        assertEquals(esperado.length, resultado.length, "El número de filas es incorrecto");
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i], DELTA, "La fila " + i + " no coincide");
        }
    }

    /**
     * Prueba el caso donde hay más filas que columnas (M > N).
     */
    @Test
    void testGenerarArreglo_MasFilasQueColumnas() {
        // 1. Arrange
        int m = 3;
        int n = 2;
        double[] B = {5.0, 6.0};

        // Fila i=0: [B[0], B[1]] -> [5, 6]
        // Fila i=1: [0,    B[1]] -> [0, 6]
        // Fila i=2: [0,    0   ] -> [0, 0]
        double[][] esperado = {
            { 5.0, 6.0 },
            { 0.0, 6.0 },
            { 0.0, 0.0 }
        };

        // 2. Act
        double[][] resultado = PS_4_20.generarArregloA(m, n, B);

        // 3. Assert
        assertEquals(esperado.length, resultado.length);
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i], DELTA, "La fila " + i + " no coincide");
        }
    }
    
    /**
     * Prueba el caso donde hay más columnas que filas (N > M).
     */
    @Test
    void testGenerarArreglo_MasColumnasQueFilas() {
        // 1. Arrange
        int m = 2;
        int n = 3;
        double[] B = {1.0, 2.0, 3.0};

        // Fila i=0: [B[0], B[1], B[2]] -> [1, 2, 3]
        // Fila i=1: [0,    B[1], B[2]] -> [0, 2, 3]
        double[][] esperado = {
            { 1.0, 2.0, 3.0 },
            { 0.0, 2.0, 3.0 }
        };

        // 2. Act
        double[][] resultado = PS_4_20.generarArregloA(m, n, B);

        // 3. Assert
        assertEquals(esperado.length, resultado.length);
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i], DELTA, "La fila " + i + " no coincide");
        }
    }

    /**
     * Prueba el caso límite donde no hay filas (M = 0).
     */
    @Test
    void testGenerarArreglo_CeroFilas() {
        // 1. Arrange
        int m = 0;
        int n = 3;
        double[] B = {1.0, 2.0, 3.0};

        // El resultado debe ser un arreglo de 0 filas
        double[][] esperado = new double[0][0]; // Arreglo vacío

        // 2. Act
        double[][] resultado = PS_4_20.generarArregloA(m, n, B);

        // 3. Assert
        assertEquals(0, resultado.length, "El arreglo A debe tener 0 filas");
    }
}
