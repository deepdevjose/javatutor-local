package com.anahi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Ejemplo112Solucion;

public class Ejemplo112Test {

    @Test
    void pruebaBasica() {
        double a = 2.0, b = 1.0; // (2+1)^2 / 3 = 9/3 = 3
        double esperado = 3.0;
        double obtenido = Ejemplo112Solucion.calcular(a, b);
        assertEquals(esperado, obtenido, 1e-9);
    }

    @Test
    void pruebaDecimales() {
        double a = 1.5, b = 2.2; // (3.7)^2 / 3 = 13.69/3 = 4.563333...
        double esperado = (Math.pow(a + b, 2)) / 3.0;
        double obtenido = Ejemplo112Solucion.calcular(a, b);
        assertEquals(esperado, obtenido, 1e-9);
    }
}
