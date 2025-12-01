package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ejemplo_2_12Test {

    private ejemplo_2_12 ordenador = new ejemplo_2_12();

    @Test
    void testPermutacion_A_B_C() {
        assertEquals("10, 5, 1", ordenador.ordenar(10, 5, 1), "ejemplo_2_12 - testPermutacion_A_B_C: Se esperaba el orden '10, 5, 1' para (10,5,1)");
    }

    @Test
    void testPermutacion_A_C_B() {
        assertEquals("10, 5, 1", ordenador.ordenar(10, 1, 5), "ejemplo_2_12 - testPermutacion_A_C_B: Se esperaba '10, 5, 1' para (10,1,5)");
    }

    @Test
    void testPermutacion_B_A_C() {
        assertEquals("10, 5, 1", ordenador.ordenar(5, 10, 1), "ejemplo_2_12 - testPermutacion_B_A_C: Se esperaba '10, 5, 1' para (5,10,1)");
    }

    @Test
    void testPermutacion_B_C_A() {
        assertEquals("10, 5, 1", ordenador.ordenar(1, 10, 5), "ejemplo_2_12 - testPermutacion_B_C_A: Se esperaba '10, 5, 1' para (1,10,5)");
    }

    @Test
    void testPermutacion_C_A_B() {
        assertEquals("10, 5, 1", ordenador.ordenar(5, 1, 10), "ejemplo_2_12 - testPermutacion_C_A_B: Se esperaba '10, 5, 1' para (5,1,10)");
    }

    @Test
    void testPermutacion_C_B_A() {
        assertEquals("10, 5, 1", ordenador.ordenar(1, 5, 10), "ejemplo_2_12 - testPermutacion_C_B_A: Se esperaba '10, 5, 1' para (1,5,10)");
    }

    @Test
    void testNumerosIguales() {
        // El libro dice que son distintos, pero probamos qué pasa si no
        assertEquals("5, 5, 5", ordenador.ordenar(5, 5, 5), "ejemplo_2_12 - testNumerosIguales: Se esperaba '5, 5, 5' para (5,5,5)");
        assertEquals("10, 10, 1", ordenador.ordenar(10, 10, 1), "ejemplo_2_12 - testNumerosIguales: Se esperaba '10, 10, 1' para (10,10,1)");
    }
}