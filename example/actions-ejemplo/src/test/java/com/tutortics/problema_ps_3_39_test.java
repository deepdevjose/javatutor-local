package com.tutortics;
// tests/problema_ps_3_39_test.java

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class problema_ps_3_39_test {

    @Test
    void testFactorial() {
        assertEquals(1, problema_ps_3_39.factorial(0));
        assertEquals(1, problema_ps_3_39.factorial(1));
        assertEquals(120, problema_ps_3_39.factorial(5));
        assertEquals(3628800, problema_ps_3_39.factorial(10));
    }

    @Test
    void testCalcularF_Condicion1_XYZ_Positivos() {
        // Caso: X>0, Y>0, Z>0. Debe calcular Z!/Y!
        // F(5, 3, 4) -> 4! / 3! = 24 / 6 = 4.0
        assertEquals(4.0, problema_ps_3_39.calcularF(5, 3, 4), 0.001);
    }

    @Test
    void testCalcularF_Condicion2_SoloX_Positivo() {
        // Caso: X>0, pero Y o Z no. Debe calcular X!
        // F(5, 0, 4) -> 5! = 120.0
        assertEquals(120.0, problema_ps_3_39.calcularF(5, 0, 4), 0.001);
        // F(4, -2, -1) -> 4! = 24.0
        assertEquals(24.0, problema_ps_3_39.calcularF(4, -2, -1), 0.001);
    }

    @Test
    void testCalcularF_Condicion3_OtroCaso() {
        // Caso: X <= 0. Debe devolver 1.0
        // F(0, 5, 10) -> 1.0
        assertEquals(1.0, problema_ps_3_39.calcularF(0, 5, 10), 0.001);
        // F(-5, 2, 3) -> 1.0
        assertEquals(1.0, problema_ps_3_39.calcularF(-5, 2, 3), 0.001);
    }
}
