package com.anahi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Problema35Solucion;

public class Problema35Test {

    @Test
    void promediosBasicos() {
        // Positivos: 2, 6 -> promedio = 4
        // Todos: (2 + -3 + 6) / 3 = 5/3
        double propos = Problema35Solucion.promedio(2 + 6, 2);
        double promgen = Problema35Solucion.promedio(2 + -3 + 6, 3);
        assertEquals(4.0, propos, 1e-9);
        assertEquals(5.0/3.0, promgen, 1e-9);
    }

    @Test
    void sinPositivosPromedioCero() {
        double propos = Problema35Solucion.promedio(0, 0);
        assertEquals(0.0, propos, 1e-9);
    }

    @Test
    void esPositivoFunciona() {
        assertEquals(true, Problema35Solucion.esPositivo(1));
        assertEquals(false, Problema35Solucion.esPositivo(0));
        assertEquals(false, Problema35Solucion.esPositivo(-5));
    }
}
