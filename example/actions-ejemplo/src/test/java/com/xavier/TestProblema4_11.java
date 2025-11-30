package com.xavier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestProblema4_11 {

    @Test
    public void testMezclaCorrecta() {
        String[] sur = {"Argentina", "Brasil", "Chile"};
        String[] centro = {"Belice", "Costa Rica"};
        String[] norte = {"Canadá", "Estados Unidos", "México"};

        String[] resultado = Problema4_11.mezclarArreglos(sur, centro, norte);

        assertEquals(8, resultado.length);
        assertEquals("Argentina", resultado[0]);
        assertEquals("México", resultado[7]);
    }

    @Test
    public void testMezclaVacia() {
        String[] sur = {};
        String[] centro = {};
        String[] norte = {"Canadá"};
        
        String[] resultado = Problema4_11.mezclarArreglos(sur, centro, norte);

        assertArrayEquals(new String[]{"Canadá"}, resultado);
    }
}
