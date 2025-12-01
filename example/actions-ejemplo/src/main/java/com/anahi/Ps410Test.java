package com.anahi;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Ps410Solucion;

public class Ps410Test {

    @Test
    void insertaEnMedioYExtremos() {
        int[] a = new int[10];
        int n = 0;
        // insertar 5, luego 1, luego 9 -> queda [1,5,9]
        n = Ps410Solucion.insertarOrdenado(a, n, 5);
        n = Ps410Solucion.insertarOrdenado(a, n, 1);
        n = Ps410Solucion.insertarOrdenado(a, n, 9);
        assertEquals(3, n);
        assertArrayEquals(new int[]{1,5,9,0,0,0,0,0,0,0}, a);
    }

    @Test
    void eliminaValor() {
        int[] a = new int[10];
        int n = 0;
        for (int v : new int[]{1,3,3,7}) n = Ps410Solucion.insertarOrdenado(a, n, v);
        // eliminar primera ocurrencia de 3 -> [1,3,7]
        n = Ps410Solucion.eliminarValor(a, n, 3);
        assertEquals(3, n);
        assertArrayEquals(new int[]{1,3,7,7,0,0,0,0,0,0}, a);
    }
}
