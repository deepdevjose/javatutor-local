package com.anahi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Ps221Solucion;

public class Ps221Test {

    @Test
    void categoria1_descuento35() {
        assertEquals(650.0, Ps221Solucion.calcularPago(1000.0, 1), 1e-6);
    }

    @Test
    void categoria2_descuento22() {
        assertEquals(780.0, Ps221Solucion.calcularPago(1000.0, 2), 1e-6);
    }

    @Test
    void categoria3_descuento15() {
        assertEquals(850.0, Ps221Solucion.calcularPago(1000.0, 3), 1e-6);
    }

    @Test
    void categoria4_descuento5() {
        assertEquals(950.0, Ps221Solucion.calcularPago(1000.0, 4), 1e-6);
    }

    @Test
    void categoria5_sinDescuento() {
        assertEquals(1000.0, Ps221Solucion.calcularPago(1000.0, 5), 1e-6);
    }
}
