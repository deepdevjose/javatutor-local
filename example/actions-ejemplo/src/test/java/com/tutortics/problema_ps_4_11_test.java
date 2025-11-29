package com.tutortics;
// tests/problema_ps_4_11_test.java

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class problema_ps_4_11_test {

    private final String[] CIUDADES_PRUEBA = {"Madrid", "Bogotá", "Tokio", "Lima", "Buenos Aires"};

    @Test
    void testBusquedaExitosa() {
        assertTrue(problema_ps_4_11.buscarCiudad(CIUDADES_PRUEBA, "Tokio"), 
            "Debería encontrar 'Tokio' en el arreglo.");
    }

    @Test
    void testBusquedaNoExitosa() {
        assertFalse(problema_ps_4_11.buscarCiudad(CIUDADES_PRUEBA, "París"), 
            "'París' no está en el arreglo y debería devolver false.");
    }

    @Test
    void testBusquedaIgnoraMayusculas() {
        // Busca "bogotá" en minúsculas cuando en el arreglo está "Bogotá"
        assertTrue(problema_ps_4_11.buscarCiudad(CIUDADES_PRUEBA, "bogotá"), 
            "La búsqueda debería ignorar las mayúsculas y encontrar la ciudad.");
        
        // Busca "LIMA" en mayúsculas cuando en el arreglo está "Lima"
        assertTrue(problema_ps_4_11.buscarCiudad(CIUDADES_PRUEBA, "LIMA"),
            "La búsqueda debería ignorar las mayúsculas y encontrar la ciudad.");
    }
}
