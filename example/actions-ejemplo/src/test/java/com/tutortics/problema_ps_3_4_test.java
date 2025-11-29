package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class problema_ps_3_4_test {

    @Test
    void testTablaMultiplicarDel7() {
        int[] esperado = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(7);
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testTablaMultiplicarDel5() {
        int[] esperado = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(5);
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testTablaMultiplicarDel1() {
        int[] esperado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(1);
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testTablaMultiplicarDel0() {
        int[] esperado = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(0);
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testTablaMultiplicarDel12() {
        int[] esperado = {12, 24, 36, 48, 60, 72, 84, 96, 108, 120};
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(12);
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testTablaMultiplicarNegativo() {
        int[] esperado = {-3, -6, -9, -12, -15, -18, -21, -24, -27, -30};
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(-3);
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testTamanioArreglo() {
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(7);
        assertEquals(10, resultado.length);
    }

    @Test
    void testPrimerElemento() {
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(9);
        assertEquals(9, resultado[0]);  // 9 × 1 = 9
    }

    @Test
    void testUltimoElemento() {
        int[] resultado = problema_ps_3_4.generarTablaMultiplicar(9);
        assertEquals(90, resultado[9]);  // 9 × 10 = 90
    }
}
