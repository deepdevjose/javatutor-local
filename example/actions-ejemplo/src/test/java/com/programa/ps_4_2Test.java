package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ps_4_2Test {
    
    private ps_4_2 c = new ps_4_2();
    private int[] arregloDePrueba = {5, 10, 15, 5, 20, 5, 10, 5};

    @Test
    void testContarMultiplesOcurrencias() {
        int total = c.contarOcurrencias(arregloDePrueba, 5);
        assertEquals(4, total, "ps_4_2 - testContarMultiplesOcurrencias: Se esperaban 4 ocurrencias del número 5 en el arreglo de prueba");
    }

    @Test
    void testContarDosOcurrencias() {
        int total = c.contarOcurrencias(arregloDePrueba, 10);
        assertEquals(2, total, "ps_4_2 - testContarDosOcurrencias: Se esperaban 2 ocurrencias del número 10 en el arreglo de prueba");
    }

    @Test
    void testContarCeroOcurrencias() {
        int total = c.contarOcurrencias(arregloDePrueba, 99);
        assertEquals(0, total, "ps_4_2 - testContarCeroOcurrencias: Se esperaban 0 ocurrencias del número 99 en el arreglo de prueba");
    }
    
    @Test
    void testArregloVacio() {
        int[] vacio = {};
        int total = c.contarOcurrencias(vacio, 5);
        assertEquals(0, total, "ps_4_2 - testArregloVacio: Un arreglo vacío debe devolver 0 ocurrencias");
    }

    @Test
    void testArregloNulo() {
        int total = c.contarOcurrencias(null, 5);
        assertEquals(0, total, "ps_4_2 - testArregloNulo: Un arreglo nulo debe ser manejado y devolver 0 ocurrencias");
    }
}