package com.anahi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Problema24Solucion;

public class Problema24Test {

    @Test
    void promedioCorrecto() {
        double p = Problema24Solucion.promedio(6, 6, 6, 6, 6);
        assertEquals(6.0, p, 1e-9);
    }

    @Test
    void promedioDecimales() {
        double p = Problema24Solucion.promedio(5.5, 7.0, 6.2, 8.1, 4.4);
        assertEquals((5.5+7.0+6.2+8.1+4.4)/5.0, p, 1e-9);
    }

    @Test
    void estadoAprobado() {
        assertEquals("aprobado", Problema24Solucion.estado(6.0));
        assertEquals("aprobado", Problema24Solucion.estado(9.9));
    }

    @Test
    void estadoNoAprobado() {
        assertEquals("no aprobado", Problema24Solucion.estado(5.99));
    }
}
