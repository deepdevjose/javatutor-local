package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests para el Problema PS 3.5 - Suma de Serie Armónica
 * 
 * Verifica que el método calcularSerie() funcione correctamente
 * para diferentes valores de N.
 */
class problema_ps_3_5_test {
    
    private static final double DELTA = 0.0001; // Tolerancia para comparaciones de doubles
    
    /**
     * Test básico: N = 4
     * Serie: 1 + 1/2 + 1/3 + 1/4
     * Resultado esperado: 2.0833
     */
    @Test
    void testSerieN4() {
        int n = 4;
        double esperado = 2.0833;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertEquals(esperado, resultado, DELTA, 
            "La suma de la serie para N=4 debería ser aproximadamente 2.0833");
    }
    
    /**
     * Test: N = 1
     * Serie: 1/1
     * Resultado esperado: 1.0
     */
    @Test
    void testSerieN1() {
        int n = 1;
        double esperado = 1.0;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertEquals(esperado, resultado, DELTA,
            "La suma de la serie para N=1 debería ser 1.0");
    }
    
    /**
     * Test: N = 10
     * Serie: 1 + 1/2 + 1/3 + ... + 1/10
     * Resultado esperado: 2.9290
     */
    @Test
    void testSerieN10() {
        int n = 10;
        double esperado = 2.9290;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertEquals(esperado, resultado, DELTA,
            "La suma de la serie para N=10 debería ser aproximadamente 2.9290");
    }
    
    /**
     * Test: N = 2
     * Serie: 1 + 1/2
     * Resultado esperado: 1.5
     */
    @Test
    void testSerieN2() {
        int n = 2;
        double esperado = 1.5;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertEquals(esperado, resultado, DELTA,
            "La suma de la serie para N=2 debería ser 1.5");
    }
    
    /**
     * Test: N = 5
     * Serie: 1 + 1/2 + 1/3 + 1/4 + 1/5
     * Resultado esperado: 2.2833
     */
    @Test
    void testSerieN5() {
        int n = 5;
        double esperado = 2.2833;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertEquals(esperado, resultado, DELTA,
            "La suma de la serie para N=5 debería ser aproximadamente 2.2833");
    }
    
    /**
     * Test: N = 100 (serie larga)
     * Verifica que el método funcione con valores grandes
     * Resultado esperado: 5.1874
     */
    @Test
    void testSerieN100() {
        int n = 100;
        double esperado = 5.1874;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertEquals(esperado, resultado, DELTA,
            "La suma de la serie para N=100 debería ser aproximadamente 5.1874");
    }
    
    /**
     * Test caso extremo: N = 0
     * No hay términos que sumar
     * Resultado esperado: 0.0
     */
    @Test
    void testSerieN0() {
        int n = 0;
        double esperado = 0.0;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertEquals(esperado, resultado, DELTA,
            "La suma de la serie para N=0 debería ser 0.0");
    }
    
    /**
     * Test: N = 3
     * Serie: 1 + 1/2 + 1/3
     * Resultado esperado: 1.8333
     * Verifica precisión decimal
     */
    @Test
    void testPrecisionDecimal() {
        int n = 3;
        double esperado = 1.8333;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertEquals(esperado, resultado, DELTA,
            "La suma de la serie para N=3 debería ser aproximadamente 1.8333");
    }
    
    /**
     * Test: Verifica que el resultado sea positivo para N > 0
     */
    @Test
    void testResultadoPositivo() {
        int n = 5;
        double resultado = problema_ps_3_5.calcularSerie(n);
        assertTrue(resultado > 0,
            "La suma de la serie para N>0 siempre debe ser positiva");
    }
    
    /**
     * Test: Verifica que la serie sea creciente
     * suma(N=5) debe ser mayor que suma(N=4)
     */
    @Test
    void testSerieCreciente() {
        double suma4 = problema_ps_3_5.calcularSerie(4);
        double suma5 = problema_ps_3_5.calcularSerie(5);
        assertTrue(suma5 > suma4,
            "La suma de la serie debe crecer cuando N aumenta");
    }
}
