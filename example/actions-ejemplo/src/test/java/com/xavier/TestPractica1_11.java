package com.xavier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestPractica1_11 {

    @Test
    public void testPerimetroTrianguloEquilatero() {
        // Triángulo equilátero con lados de longitud 1
        double x1 = 0, y1 = 0;
        double x2 = 1, y2 = 0;
        double x3 = 0.5, y3 = Math.sqrt(3) / 2;

        double d12 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double d23 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double d31 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double perimetro = d12 + d23 + d31;

        assertEquals(3.0, perimetro, 0.0001);
    }
}
