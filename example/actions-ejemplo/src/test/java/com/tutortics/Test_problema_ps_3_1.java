package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests para el Problema PS 3.1 - Suma de N Primeros Números Naturales
 */
public class Test_problema_ps_3_1 {

    @Test
    public void testSumaPrimerosNumeros() {
        // Test 1: N = 1
        assertEquals(1, problema_ps_3_1.calcularSuma(1), 
            "La suma de los primeros 1 números debe ser 1");
        
        // Test 2: N = 5
        assertEquals(15, problema_ps_3_1.calcularSuma(5), 
            "La suma de 1+2+3+4+5 debe ser 15");
        
        // Test 3: N = 10
        assertEquals(55, problema_ps_3_1.calcularSuma(10), 
            "La suma de los primeros 10 números debe ser 55");
        
        // Test 4: N = 100
        assertEquals(5050, problema_ps_3_1.calcularSuma(100), 
            "La suma de los primeros 100 números debe ser 5050");
        
        // Test 5: N = 0
        assertEquals(0, problema_ps_3_1.calcularSuma(0), 
            "La suma de los primeros 0 números debe ser 0");
    }

    @Test
    public void testCasosEspeciales() {
        // Test con N = 3
        assertEquals(6, problema_ps_3_1.calcularSuma(3), 
            "La suma de 1+2+3 debe ser 6");
        
        // Test con N = 4
        assertEquals(10, problema_ps_3_1.calcularSuma(4), 
            "La suma de 1+2+3+4 debe ser 10");
        
        // Test con N = 20
        assertEquals(210, problema_ps_3_1.calcularSuma(20), 
            "La suma de los primeros 20 números debe ser 210");
    }

    @Test
    public void testFormulaMatematica() {
        // Verificar que el resultado coincide con la fórmula: n*(n+1)/2
        for (int n = 1; n <= 50; n++) {
            int esperado = n * (n + 1) / 2;
            assertEquals(esperado, problema_ps_3_1.calcularSuma(n), 
                "La suma debe coincidir con la fórmula n*(n+1)/2 para n=" + n);
        }
    }
}
