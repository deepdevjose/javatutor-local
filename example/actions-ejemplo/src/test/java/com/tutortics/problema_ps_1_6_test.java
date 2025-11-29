package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class problema_ps_1_6_test {

    @Test
    void testCalcularEngancheYMensualidad() {
        // Test con monto de 100,000
        double mon = 100000.0;
        double eng = problema_ps_1_6.calcularEnganche(mon);
        double men = problema_ps_1_6.calcularMensualidad(mon, eng);
        
        // Enganche 35% -> 35000
        assertEquals(35000.0, eng, 0.001);
        // Mensualidad -> 65000/18
        assertEquals(65000.0/18.0, men, 0.001);
    }

    @Test
    void testCalcularEnganche() {
        // Test enganche con diferentes montos
        assertEquals(35000.0, problema_ps_1_6.calcularEnganche(100000), 0.001);
        assertEquals(87500.0, problema_ps_1_6.calcularEnganche(250000), 0.001);
        assertEquals(0.0, problema_ps_1_6.calcularEnganche(0), 0.001);
    }

    @Test
    void testCalcularMensualidad() {
        // Test mensualidad con monto de 180,000
        double mon = 180000.0;
        double eng = problema_ps_1_6.calcularEnganche(mon);
        double men = problema_ps_1_6.calcularMensualidad(mon, eng);
        
        assertEquals(6500.0, men, 0.001);
    }
}
