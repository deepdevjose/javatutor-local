package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ps_3_22Test {
    
    private ps_3_22 pa = new ps_3_22();

    @Test
    void testPromedioSimple() {
        assertEquals(10.0, pa.calcularPromedio(10, 10, 10, 10, 10), "ps_3_22 - testPromedioSimple: Promedio de cinco 10 debe ser 10.0");
    }

    @Test
    void testPromedioMixto() {
        assertEquals(8.0, pa.calcularPromedio(7, 8, 8, 9, 8), "ps_3_22 - testPromedioMixto: Promedio esperado 8.0 para (7,8,8,9,8)");
    }

    @Test
    void testPromedioConCeros() {
        assertEquals(4.0, pa.calcularPromedio(10, 10, 0, 0, 0), "ps_3_22 - testPromedioConCeros: Promedio de (10,10,0,0,0) debe ser 4.0");
    }
}