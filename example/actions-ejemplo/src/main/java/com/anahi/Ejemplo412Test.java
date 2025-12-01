package com.anahi;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Ejemplo412Solucion;

public class Ejemplo412Test {

    @Test
    void swapFunciona() {
        int[] v = {3, 1, 2};
        Ejemplo412Solucion.swap(v, 0, 2);
        assertArrayEquals(new int[]{2,1,3}, v);
    }

    @Test
    void indiceMenorDesdeCorrecto() {
        int[] v = {25, 84, 32, 35, 61, 44, 29, 52};
        assertEquals(6, Ejemplo412Solucion.indiceMenorDesde(v, 0, v.length)); // 29 en pos 6
        assertEquals(2, Ejemplo412Solucion.indiceMenorDesde(v, 2, v.length)); // 32 en pos 2
    }

    @Test
    void seleccionOrdena() {
        int[] v = {25, 84, 32, 35, 61, 44, 29, 52};
        Ejemplo412Solucion.seleccion(v, v.length);
        assertArrayEquals(new int[]{25,29,32,35,44,52,61,84}, v);
    }
}
