package com.anahi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Ps15Solucion;

public class Ps15Test {

    @Test
    void montoFinalBasico() {
        // MD=1000, TASA=5% => 1050
        assertEquals(1050.0, Ps15Solucion.montoFinal(1000.0, 5.0), 1e-9);
    }

    @Test
    void montoFinalDecimales() {
        // MD=1234.56, TASA=2.5% => 1234.56 + 30.864 = 1265.424
        assertEquals(1265.424, Ps15Solucion.montoFinal(1234.56, 2.5), 1e-6);
    }

    @Test
    void tasaCero() {
        assertEquals(500.0, Ps15Solucion.montoFinal(500.0, 0.0), 1e-9);
    }
}
