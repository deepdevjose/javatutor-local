package com.programa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class problema_4_13Test {

    private problema_4_13 ir = new problema_4_13();

    @Test
    void testIntercambioMatrizPar() {
        // Matriz N=4
        int[][] original = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };
        int[][] esperado = {
            {4, 4, 4, 4},
            {3, 3, 3, 3},
            {2, 2, 2, 2},
            {1, 1, 1, 1}
        };
        
        ir.intercambiar(original); // Modifica 'original'
        
        // assertArrayEquals es necesario para comparar el contenido de los arreglos
        assertArrayEquals(esperado, original, "problema_4_13 - testIntercambioMatrizPar: La matriz debe invertirse por filas para N=4");
    }

    @Test
    void testIntercambioMatrizImpar() {
        // Matriz N=3 (el renglón del medio no se mueve)
        int[][] original = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };
        int[][] esperado = {
            {3, 3, 3},
            {2, 2, 2},
            {1, 1, 1}
        };
        
        ir.intercambiar(original);
        assertArrayEquals(esperado, original, "problema_4_13 - testIntercambioMatrizImpar: La matriz debe invertirse por filas para N=3 (fila central permanece)");
    }
}