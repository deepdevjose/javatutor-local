package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PS_2_4Test {

    // Margen de error para comparar doubles
    private static final double DELTA = 0.001;

    @Test
    void testSueldoBajo() {
        // Prueba el caso: sueldo < 1000 (15% de aumento)
        // Sueldo: 800. Aumento: 800 * 0.15 = 120. Nuevo Sueldo: 920
        double nuevoSueldo = PS_2_4.calcularNuevoSueldo(800.0);
        assertEquals(920.0, nuevoSueldo, DELTA);
    }

    @Test
    void testSueldoAlto() {
        // Prueba el caso: sueldo > 1000 (12% de aumento)
        // Sueldo: 2000. Aumento: 2000 * 0.12 = 240. Nuevo Sueldo: 2240
        double nuevoSueldo = PS_2_4.calcularNuevoSueldo(2000.0);
        assertEquals(2240.0, nuevoSueldo, DELTA);
    }

    @Test
    void testSueldoEnLimite() {
        // Prueba el caso: sueldo == 1000 (cae en el "else", 12% de aumento)
        // Sueldo: 1000. Aumento: 1000 * 0.12 = 120. Nuevo Sueldo: 1120
        double nuevoSueldo = PS_2_4.calcularNuevoSueldo(1000.0);
        assertEquals(1120.0, nuevoSueldo, DELTA);
    }

    @Test
    void testSueldoJustoDebajoDelLimite() {
        // Prueba el caso: sueldo justo debajo de 1000 (15% de aumento)
        // Sueldo: 999.99. Aumento: 999.99 * 0.15 = 149.9985
        // Nuevo Sueldo: 999.99 + 149.9985 = 1149.9885
        double nuevoSueldo = PS_2_4.calcularNuevoSueldo(999.99);
        assertEquals(1149.9885, nuevoSueldo, DELTA);
    }
}