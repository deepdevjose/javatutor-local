package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PS_2_7Test {

    // Delta (margen de error) para comparar números decimales (double)
    private static final double DELTA = 0.001;

    @Test
    void testSueldoMenorA_10000_Aumento15() {
        // Prueba el bloque del 15%
        double sueldo = 8000.00;
        double esperado = 8000.00 * 1.15; // 9200.0
        
        double resultado = PS_2_7.calcularNuevoSueldo(sueldo);
        
        assertEquals(esperado, resultado, DELTA, "El aumento del 15% es incorrecto");
    }

    @Test
    void testSueldoEntre_10000_y_15000_Aumento11() {
        // Prueba el bloque del 11%
        double sueldo = 12000.00;
        double esperado = 12000.00 * 1.11; // 13320.0
        
        double resultado = PS_2_7.calcularNuevoSueldo(sueldo);
        
        assertEquals(esperado, resultado, DELTA, "El aumento del 11% es incorrecto");
    }

    @Test
    void testSueldoMayorOIgualA_15000_Aumento8() {
        // Prueba el bloque del 8%
        double sueldo = 20000.00;
        double esperado = 20000.00 * 1.08; // 21600.0
        
        double resultado = PS_2_7.calcularNuevoSueldo(sueldo);
        
        assertEquals(esperado, resultado, DELTA, "El aumento del 8% es incorrecto");
    }

    @Test
    void testSueldoLimite_10000_Exacto_Aumento11() {
        // Prueba el límite exacto donde cambia de 15% a 11%
        // Si gana 10000, ya NO es "< 10000", por lo tanto aplica el 11%
        double sueldo = 10000.00;
        double esperado = 10000.00 * 1.11; // 11100.0
        
        double resultado = PS_2_7.calcularNuevoSueldo(sueldo);
        
        assertEquals(esperado, resultado, DELTA, "El límite en 10000 debe aplicar 11%");
    }

    @Test
    void testSueldoLimite_15000_Exacto_Aumento8() {
        // Prueba el límite exacto donde cambia de 11% a 8%
        // Si gana 15000, ya NO es "< 15000", por lo tanto aplica el 8%
        double sueldo = 15000.00;
        double esperado = 15000.00 * 1.08; // 16200.0
        
        double resultado = PS_2_7.calcularNuevoSueldo(sueldo);
        
        assertEquals(esperado, resultado, DELTA, "El límite en 15000 debe aplicar 8%");
    }
    
    @Test
    void testSueldoJustoDebajoDe_10000_Aumento15() {
        // Prueba el límite justo por debajo de 10000
        double sueldo = 9999.99;
        double esperado = 9999.99 * 1.15; // 11499.9885
        
        double resultado = PS_2_7.calcularNuevoSueldo(sueldo);
        
        assertEquals(esperado, resultado, DELTA, "El sueldo justo debajo de 10000 debe aplicar 15%");
    }
}