package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PS_2_6Test {

    // Margen de error para comparar doubles
    private static final double DELTA = 0.001;

    @Test
    void testConDescuento() {
        // Caso: Estancia larga (10 días > 7) Y Distancia larga (1000 km > 800)
        // distanciaIda = 500 km -> distanciaTotal = 1000 km
        // tiempoEstancia = 10 días
        // Precio base: 1000 * 0.23 = 230.0
        // Precio final con 30% desc: 230.0 * 0.7 = 161.0
        double precio = PS_2_6.calcularPrecioBillete(500, 10);
        assertEquals(161.0, precio, DELTA);
    }

    @Test
    void testSinDescuentoPorEstanciaCorta() {
        // Caso: Estancia corta (5 días <= 7)
        // distanciaIda = 500 km -> distanciaTotal = 1000 km (cumple)
        // tiempoEstancia = 5 días (no cumple)
        // Precio base: 1000 * 0.23 = 230.0
        // Precio final: 230.0 (sin descuento)
        double precio = PS_2_6.calcularPrecioBillete(500, 5);
        assertEquals(230.0, precio, DELTA);
    }

    @Test
    void testSinDescuentoPorDistanciaCorta() {
        // Caso: Distancia corta (600 km <= 800)
        // distanciaIda = 300 km -> distanciaTotal = 600 km (no cumple)
        // tiempoEstancia = 10 días (cumple)
        // Precio base: 600 * 0.23 = 138.0
        // Precio final: 138.0 (sin descuento)
        double precio = PS_2_6.calcularPrecioBillete(300, 10);
        assertEquals(138.0, precio, DELTA);
    }

    @Test
    void testSinDescuentoAmbosCortos() {
        // Caso: Ni estancia ni distancia cumplen
        // distanciaIda = 300 km -> distanciaTotal = 600 km
        // tiempoEstancia = 5 días
        // Precio base: 600 * 0.23 = 138.0
        // Precio final: 138.0 (sin descuento)
        double precio = PS_2_6.calcularPrecioBillete(300, 5);
        assertEquals(138.0, precio, DELTA);
    }

    @Test
    void testSinDescuentoEnLimites() {
        // Caso: Justo en el límite (no aplica descuento, se necesita ">")
        // distanciaIda = 400 km -> distanciaTotal = 800 km (no cumple, necesita > 800)
        // tiempoEstancia = 7 días (no cumple, necesita > 7)
        // Precio base: 800 * 0.23 = 184.0
        // Precio final: 184.0 (sin descuento)
        double precio = PS_2_6.calcularPrecioBillete(400, 7);
        assertEquals(184.0, precio, DELTA);
    }

    @Test
    void testConDescuentoSobreElLimite() {
        // Caso: Justo por encima del límite
        // distanciaIda = 401 km -> distanciaTotal = 802 km (cumple)
        // tiempoEstancia = 8 días (cumple)
        // Precio base: 802 * 0.23 = 184.46
        // Precio final con 30% desc: 184.46 * 0.7 = 129.122
        double precio = PS_2_6.calcularPrecioBillete(401, 8);
        assertEquals(129.122, precio, DELTA);
    }
}