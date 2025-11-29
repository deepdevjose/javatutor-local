package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class problema_2_9_test {

    @Test
    void testCalcularImpuestoYPrecioTotal() {
        problema_2_9 sut = new problema_2_9();

        // Menor o igual a 20 -> impuesto 0
        assertEquals(0.0, sut.calcularImpuesto(20), 0.001);

        // Entre 20 y 40 -> (precio-20)*0.30
        assertEquals((30 - 20) * 0.30, sut.calcularImpuesto(30), 0.001);

        // Entre 40 y 500 -> (20*0.30) + (precio-40)*0.40
        double imp = (20 * 0.30) + (100 - 40) * 0.40;
        assertEquals(imp, sut.calcularImpuesto(100), 0.001);

        // Mayor a 500 -> (20*0.30) + (precio-40)*0.50
        double imp2 = (20 * 0.30) + (600 - 40) * 0.50;
        assertEquals(imp2, sut.calcularImpuesto(600), 0.001);

        // Precio total suma precio base e impuesto
        assertEquals(600 + imp2, sut.calcularPrecioTotal(600), 0.001);
    }
}
