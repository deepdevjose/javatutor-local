package com.xavier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestProblema3_11 {

    @Test
    public void testConteoYPorcentajes() {
        Problema3_11 p = new Problema3_11();
        int[] votos = {1, 3, 1, 4, 2, 2, 1, 4, 1, 1, 2, 1, 3, 1, 4, 0}; // ejemplo del libro
        p.contarVotos(votos);

        assertEquals(11, p.getCan1());
        assertEquals(5, p.getCan2());
        assertEquals(3, p.getCan3());
        assertEquals(5, p.getCan4());
        assertEquals(24, p.getSumv());

        // Validar porcentajes aproximados
        assertEquals(45.83, p.getPor1(), 0.1);
        assertEquals(20.83, p.getPor2(), 0.1);
        assertEquals(12.5, p.getPor3(), 0.1);
        assertEquals(20.83, p.getPor4(), 0.1);
    }
}
