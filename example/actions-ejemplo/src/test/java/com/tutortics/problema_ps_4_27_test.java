package com.tutortics;
// tests/problema_ps_4_27_test.java

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class problema_ps_4_27_test {

    private problema_ps_4_27 problema;

    @BeforeEach
    void setUp() {
        problema = new problema_ps_4_27();
    }

    @Test
    void testGenerarVectorB() {
        // Arrange
        int n = 3;
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Act
        // B[0] (i=1): Suma fila 0 -> 1+2+3 = 6
        // B[1] (i=2): Producto col 1 -> 2*5*8 = 80
        // B[2] (i=3): (Prod col 1) / (Suma fila 0) -> 80 / 6 = 13.333...
        double[] b_esperado = {6.0, 80.0, 13.333333};
        
        double[] b_calculado = problema.generarVectorB(matrizA, n);

        // Assert
        assertArrayEquals(b_esperado, b_calculado, 0.001);
    }
    
    @Test
    void testDivisionPorCero() {
        // Arrange
        int n = 3;
        int[][] matrizA = {
            {-1, 0, 1}, // Suma es 0
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Act
        // B[0] (i=1): Suma fila 0 -> -1+0+1 = 0
        // B[1] (i=2): Producto col 1 -> 0*5*8 = 0
        // B[2] (i=3): (Prod col 1) / (Suma fila 0) -> 0 / 0 -> Se asigna 0 por la lógica implementada
        double[] b_esperado = {0.0, 0.0, 0.0};
        
        double[] b_calculado = problema.generarVectorB(matrizA, n);

        // Assert
        assertArrayEquals(b_esperado, b_calculado, 0.001);
    }
}
