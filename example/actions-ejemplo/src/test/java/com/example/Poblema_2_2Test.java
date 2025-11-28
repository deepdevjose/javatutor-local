package com.example; // Mismo paquete

// Importaciones de JUnit 5
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para Problema_2_2
 */
class Problema_2_2Test {

    // Declaramos la variable de la clase que queremos probar
    Problema_2_2 app;

    // Este método se ejecuta antes de CADA prueba
    @BeforeEach
    void setUp() {
        // Creamos una nueva instancia limpia para cada test
        app = new Problema_2_2();
    }

    @Test
    void testCuandoSeSatisface() {
        // Probamos un caso que debe dar 'true'
        // P=2, Q=1 -> exp = 8 + 1 - 2*4 = 1
        // 1 < 680 (true)
        // result = 3.5 / 1 = 3.5
        // 3.5 < 680 (true)
        // Resultado: se satisface
        assertTrue(app.evaluarExpresion(2, 1), "P=2, Q=1 debería satisfacer la expresión.");
        
        // Otro caso 'true'
        // P=1, Q=0 -> exp = 1 + 0 - 2 = -1
        // -1 < 680 (true)
        // result = 3.5 / -1 = -3.5
        // -3.5 < 680 (true)
        // Resultado: se satisface
        assertTrue(app.evaluarExpresion(1, 0), "P=1, Q=0 debería satisfacer la expresión.");
    }

    @Test
    void testCuandoNoSatisfacePorExpGrande() {
        // Probamos un caso donde el primer 'if' falla
        // P=10, Q=5 -> exp = 1000 + 625 - 200 = 1425
        // 1425 < 680 (false)
        // Resultado: no se satisface
        assertFalse(app.evaluarExpresion(10, 5), "P=10, Q=5 no debería satisfacer (exp > 680).");
    }

    @Test
    void testCuandoNoSatisfacePorDivision() {
        // Probamos un caso donde el segundo 'if' falla (división por cero)
        // P=0, Q=0 -> exp = 0 + 0 - 0 = 0
        // 0 < 680 (true)
        // result = 3.5 / 0 = Infinity
        // Infinity < 680 (false)
        // Resultado: no se satisface
        assertFalse(app.evaluarExpresion(0, 0), "P=0, Q=0 no debería satisfacer (División por cero).");
    }
}