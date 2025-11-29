package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ejemplo_2_5_test {

    @Test
    void testEjecutarFlujoValoresConocidos() {
        ejemplo_2_5 sut = new ejemplo_2_5();

        assertEquals("Se ejecutó la ACCION 1. Luego, se ejecutó la ACCION Y.", sut.ejecutarFlujo(1));
        assertEquals("Se ejecutó la ACCION 2. Luego, se ejecutó la ACCION Y.", sut.ejecutarFlujo(2));
        assertEquals("Se ejecutó la ACCION 3. Luego, se ejecutó la ACCION Y.", sut.ejecutarFlujo(3));
    }

    @Test
    void testEjecutarFlujoValorPorDefecto() {
        ejemplo_2_5 sut = new ejemplo_2_5();
        assertEquals("De otra forma: Se ejecutó la ACCION X. Luego, se ejecutó la ACCION Y.", sut.ejecutarFlujo(99));
    }
}
