package com.tutortics;
// src/test/java/problema_ps_5_6_test.java

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class problema_ps_5_6_test {

    private Profesor[] personalPrueba;
    private double promedioPrueba;

    @BeforeEach
    void setUp() {
        personalPrueba = new Profesor[]{
            new Profesor("Ana", 45, 'F'),
            new Profesor("Luis", 30, 'M'),
            new Profesor("Elena", 50, 'F'),
            new Profesor("Carlos", 25, 'M')
        };
        // Promedio = (45+30+50+25) / 4 = 150 / 4 = 37.5
        promedioPrueba = 37.5;
    }

    @Test
    void testCalcularEdadPromedio() {
        assertEquals(promedioPrueba, problema_ps_5_6.calcularEdadPromedio(personalPrueba), 0.001);
    }

    @Test
    void testEncontrarProfesorMasJoven() {
        assertEquals("Carlos", problema_ps_5_6.encontrarProfesorMasJoven(personalPrueba));
    }

    @Test
    void testEncontrarProfesorMasViejo() {
        assertEquals("Elena", problema_ps_5_6.encontrarProfesorMasViejo(personalPrueba));
    }

    @Test
    void testContarProfesorasMayoresAlPromedio() {
        // Ana (45 > 37.5) y Elena (50 > 37.5) son 2.
        assertEquals(2, problema_ps_5_6.contarProfesorasMayoresAlPromedio(personalPrueba, promedioPrueba));
    }

    @Test
    void testContarProfesoresMenoresAlPromedio() {
        // Luis (30 < 37.5) y Carlos (25 < 37.5) son 2.
        assertEquals(2, problema_ps_5_6.contarProfesoresMenoresAlPromedio(personalPrueba, promedioPrueba));
    }
}
