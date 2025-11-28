package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PS_4_4Test {

    @Test
    void testProductoVectoresNormales() {
        // 1. Arrange (Preparar)
        int N = 3;
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};
        
        // Producto = (1*4) + (2*5) + (3*6) = 4 + 10 + 18 = 32
        int esperado = 32;

        // 2. Act (Actuar)
        int resultado = PS_4_4.calcularProducto(A, B, N);

        // 3. Assert (Verificar)
        assertEquals(esperado, resultado, "El producto escalar con valores normales es incorrecto");
    }

    @Test
    void testProductoVectoresConNegativos() {
        // 1. Arrange
        int N = 3;
        int[] A = {-1, 2, -3};
        int[] B = {4, -5, 6};
        
        // Producto = (-1*4) + (2*-5) + (-3*6) = -4 - 10 - 18 = -32
        int esperado = -32;

        // 2. Act
        int resultado = PS_4_4.calcularProducto(A, B, N);

        // 3. Assert
        assertEquals(esperado, resultado, "El producto escalar con valores negativos es incorrecto");
    }

    @Test
    void testProductoVectoresConCeros() {
        // 1. Arrange
        int N = 4;
        int[] A = {1, 100, 3, 50};
        int[] B = {0, 0, 0, 0};
        
        // Producto = (1*0) + (100*0) + (3*0) + (50*0) = 0
        int esperado = 0;

        // 2. Act
        int resultado = PS_4_4.calcularProducto(A, B, N);

        // 3. Assert
        assertEquals(esperado, resultado, "El producto escalar con un vector cero debe ser 0");
    }

    @Test
    void testProductoVectoresTamanoUno() {
        // 1. Arrange
        int N = 1;
        int[] A = {10};
        int[] B = {5};
        
        // Producto = (10*5) = 50
        int esperado = 50;

        // 2. Act
        int resultado = PS_4_4.calcularProducto(A, B, N);

        // 3. Assert
        assertEquals(esperado, resultado, "El producto escalar con N=1 es incorrecto");
    }

    @Test
    void testProductoVectoresTamanoCero() {
        // 1. Arrange
        int N = 0;
        int[] A = {}; // Vector vacío
        int[] B = {}; // Vector vacío
        
        // El bucle for (i=0; i<0; ...) no se ejecuta. Devuelve 0.
        int esperado = 0;

        // 2. Act
        int resultado = PS_4_4.calcularProducto(A, B, N);

        // 3. Assert
        assertEquals(esperado, resultado, "El producto escalar con N=0 debe ser 0");
    }
}