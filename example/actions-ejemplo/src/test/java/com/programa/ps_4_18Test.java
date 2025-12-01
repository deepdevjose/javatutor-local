package com.programa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class ps_4_18Test {

    private ps_4_18 mi = new ps_4_18();

    @Test
    void testIdentidadN3() {
        int[][] esperado = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        int[][] real = mi.generarIdentidad(3);
        assertArrayEquals(esperado, real, "ps_4_18 - testIdentidadN3: La matriz identidad 3x3 debe tener 1s en la diagonal y 0s fuera de ella");
    }

    @Test
    void testIdentidadN1() {
        int[][] esperado = {
            {1}
        };
        int[][] real = mi.generarIdentidad(1);
        assertArrayEquals(esperado, real, "ps_4_18 - testIdentidadN1: La matriz identidad 1x1 debe ser {{1}}");
    }

    @Test
    void testIdentidadN0() {
        int[][] esperado = new int[0][0];
        int[][] real = mi.generarIdentidad(0);
        assertArrayEquals(esperado, real, "ps_4_18 - testIdentidadN0: Para n=0 debe retornarse una matriz vacía int[0][0]");
    }
}