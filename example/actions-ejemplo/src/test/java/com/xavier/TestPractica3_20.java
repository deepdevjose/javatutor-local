package com.xavier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPractica3_20 {

    @Test
    public void testCostoBajo() {
        assertEquals(35.0, Practica3_20.calcularCosto(100), 1e-9);
    }

    @Test
    public void testCostoMedio() {
        assertEquals(35 + (200 - 140) * 0.98, Practica3_20.calcularCosto(200), 1e-9);
    }

    @Test
    public void testCostoAlto() {
        assertEquals(35 + 170 * 0.98 + (400 - 310) * 0.67, Practica3_20.calcularCosto(400), 1e-9);
    }
}
