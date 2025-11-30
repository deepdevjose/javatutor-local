package com.xavier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestPractica4_32 {

    @Test
    public void testSumaConTraspuesta() {
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] esperado = {
            {1 + 5, 2 + 7},
            {3 + 6, 4 + 8}
        };

        int[][] resultado = Practica4_32.sumarConTraspuesta(A, B);

        for (int i = 0; i < 2; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
    }
}
