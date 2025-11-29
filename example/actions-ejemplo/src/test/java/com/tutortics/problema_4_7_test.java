package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class problema_4_7_test {

    @Test
    void testBusquedaBinariaEncontradoYNoEncontrado() {
        int[] vector = {1,2,3,4,5,6,7,8,9};
        int n = vector.length;

        // Elementos encontrados
        assertTrue(problema_4_7.busquedaBinaria(vector, n, 1));
        assertTrue(problema_4_7.busquedaBinaria(vector, n, 5));
        assertTrue(problema_4_7.busquedaBinaria(vector, n, 9));
        
        // Elemento no encontrado
        assertFalse(problema_4_7.busquedaBinaria(vector, n, 99));
        assertFalse(problema_4_7.busquedaBinaria(vector, n, 0));
        assertFalse(problema_4_7.busquedaBinaria(vector, n, 10));
    }

    @Test
    void testBusquedaBinariaElementosUnicos() {
        int[] vector = {5};
        
        assertTrue(problema_4_7.busquedaBinaria(vector, 1, 5));
        assertFalse(problema_4_7.busquedaBinaria(vector, 1, 3));
    }
}
