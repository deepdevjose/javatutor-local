package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// 1. BUENA PRÁCTICA: Los nombres de clases deben empezar con Mayúscula
//    Te recomiendo renombrar el archivo y la clase a: Problema_3_15Test
public class problema_3_15Test {

    // 2. CORRECCIÓN: Usa el nombre de tu clase de lógica (Problema_3_15)
    private Problema_3_15 calc;
    
    private static final double DELTA = 0.001; 

    @BeforeEach
    void setUp() {
        // 3. CORRECCIÓN: Crea una instancia de tu clase de lógica
        calc = new Problema_3_15();
    }

    // ... (El resto de tus métodos @Test quedan exactamente igual) ...
    
    @Test
    void testTipoHDuracionLarga() {
        calc.procesarLlamada("H", 5);
        assertEquals(15.81, calc.getCuenta(), DELTA);
    }
    
    @Test
    void testTipoHDuracionCorta() {
        calc.procesarLlamada("H", 2);
        assertEquals(8.79, calc.getCuenta(), DELTA);
    }

    @Test
    void testTipoLDuracionCorta() {
        calc.procesarLlamada("L", 2);
        assertEquals(8.79, calc.getCuenta(), DELTA);
        assertEquals(1, calc.getCL()); 
    }

    @Test
    void testTipoOtroDuracionLarga() {
        calc.procesarLlamada("Z", 5);
        assertEquals(9.75, calc.getCuenta(), DELTA);
    }

    @Test
    void testMultiplesLlamadasAcumuladas() {
        calc.procesarLlamada("H", 5); // 15.81
        calc.procesarLlamada("L", 2); // 8.79
        assertEquals(24.6, calc.getCuenta(), DELTA);
        assertEquals(1, calc.getCL());
    }

    @Test
    void testLimiteTipoL() {
        for (int i = 0; i < 50; i++) {
            calc.procesarLlamada("L", 2); 
        }
        assertEquals(439.5, calc.getCuenta(), DELTA);
        assertEquals(50, calc.getCL());

        // Llamada 51
        calc.procesarLlamada("L", 2);
        assertEquals(448.89, calc.getCuenta(), DELTA);
        assertEquals(51, calc.getCL());
    }
}