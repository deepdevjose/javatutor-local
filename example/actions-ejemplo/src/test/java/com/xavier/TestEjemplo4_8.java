package com.xavier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestEjemplo4_8 {

    @Test
    public void testTamañoMatriz() {
        double[][] matriz = Ejemplo4_8.crearMatriz();
        assertEquals(15, matriz.length);
        assertEquals(5, matriz[0].length);
    }

    @Test
    public void testTotalElementos() {
        double[][] matriz = Ejemplo4_8.crearMatriz();
        int total = Ejemplo4_8.contarElementos(matriz);
        assertEquals(75, total);
    }
}
