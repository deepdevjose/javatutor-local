package com.xavier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPractica3_19 {

    @Test
    public void testPotenciasSimples() {
        assertEquals(8, Practica3_19.powNoMul(2, 3));
        assertEquals(1, Practica3_19.powNoMul(5, 0));
        assertEquals(9, Practica3_19.powNoMul(3, 2));
    }

    @Test
    public void testPotenciasGrandes() {
        assertEquals(16, Practica3_19.powNoMul(2, 4));
        assertEquals(27, Practica3_19.powNoMul(3, 3));
    }
}
