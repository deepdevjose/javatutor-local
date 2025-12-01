package com.anahi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Problema28Solucion;

public class Problema28Test {

    @Test
    void tasasEnFronteras() {
        assertEquals(0.00, Problema28Solucion.descuento(499.99), 1e-9);
        assertEquals(0.05, Problema28Solucion.descuento(500.00), 1e-9);
        assertEquals(0.05, Problema28Solucion.descuento(1000.00), 1e-9);
        assertEquals(0.11, Problema28Solucion.descuento(1000.01), 1e-9);
        assertEquals(0.11, Problema28Solucion.descuento(7000.00), 1e-9);
        assertEquals(0.18, Problema28Solucion.descuento(7000.01), 1e-9);
        assertEquals(0.18, Problema28Solucion.descuento(15000.00), 1e-9);
        assertEquals(0.25, Problema28Solucion.descuento(15000.01), 1e-9);
    }

    @Test
    void calcularPago() {
        // Ejemplo: compra=1000 -> 5% -> pagar=950
        assertEquals(950.0, Problema28Solucion.pagar(1000.0), 1e-9);

        // compra=8000 -> 18% -> 6560
        assertEquals(6560.0, Problema28Solucion.pagar(8000.0), 1e-9);

        // compra=400 -> 0% -> 400
        assertEquals(400.0, Problema28Solucion.pagar(400.0), 1e-9);
    }
}
