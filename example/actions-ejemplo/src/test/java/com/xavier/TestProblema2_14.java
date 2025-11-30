package com.xavier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestProblema2_14 {

    @Test
    public void testCostoNormal() {
        assertEquals(100.0, Problema2_14.calcularCostoTotal(1, 10, 4), 0.001);
    }

    @Test
    public void testConAumentoPorEdad() {
        assertEquals(110.0, Problema2_14.calcularCostoTotal(1, 18, 4), 0.001);
    }

    @Test
    public void testTipo4SinAumento() {
        assertEquals(320.0, Problema2_14.calcularCostoTotal(4, 30, 10), 0.001);
    }
}
