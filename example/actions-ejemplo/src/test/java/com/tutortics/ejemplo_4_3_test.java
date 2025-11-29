package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ejemplo_4_3_test {

    @Test
    void testCrearArregloTamanoYValores() {
        ejemplo_4_3 sut = new ejemplo_4_3();
        int[] arr = sut.crearArreglo(5);

        assertNotNull(arr);
        assertEquals(5, arr.length);
        // Valores esperados: (i+1)*10
        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
        assertEquals(50, arr[4]);
    }
}
