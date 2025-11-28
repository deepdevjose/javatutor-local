package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Problema_1_7Test {

    // ¡Ojo, mana! Como son 'double', usamos un DELTA (margen de error)
    // para que no se ponga intensa la compu por decimales.
    private static final double DELTA = 0.001;

    @Test
    void testAreaTrianguloValido_3_4_5() {
        // 1. Arrange (Preparamos)
        // El triángulo clásico 3-4-5 debe dar 6
        double l1 = 3.0;
        double l2 = 4.0;
        double l3 = 5.0;
        double areaEsperada = 6.0;

        // 2. Act (Actuamos)
        double areaCalculada = Problema_1_7.calcularAreaHeron(l1, l2, l3);

        // 3. Assert (Verificamos)
        assertEquals(areaEsperada, areaCalculada, DELTA, "El área para 3-4-5 debe ser 6");
    }

    @Test
    void testAreaTrianguloInvalido() {
        // 1. Arrange
        // (1 + 2) no es mayor que 10, ¡esto no es un triángulo!
        double l1 = 1.0;
        double l2 = 2.0;
        double l3 = 10.0;
        double errorEsperado = -1.0; // El código de error que definimos

        // 2. Act
        double areaCalculada = Problema_1_7.calcularAreaHeron(l1, l2, l3);

        // 3. Assert
        assertEquals(errorEsperado, areaCalculada, DELTA, "Un triángulo inválido debe regresar -1.0");
    }

    @Test
    void testAreaTrianguloAreaCero() {
        // 1. Arrange
        // (1 + 1 = 2) Es un triángulo "plano"
        double l1 = 1.0;
        double l2 = 1.0;
        double l3 = 2.0;
        double areaEsperada = 0.0;

        // 2. Act
        double areaCalculada = Problema_1_7.calcularAreaHeron(l1, l2, l3);

        // 3. Assert
        assertEquals(areaEsperada, areaCalculada, DELTA, "Un triángulo plano debe tener área 0");
    }
    
    @Test
    void testAreaTrianguloValido_Decimales() {
        // 1. Arrange
        // (5, 6, 7) da un área con decimales
        double l1 = 5.0;
        double l2 = 6.0;
        double l3 = 7.0;
        double areaEsperada = 14.6969; // Raíz cuadrada de 216

        // 2. Act
        double areaCalculada = Problema_1_7.calcularAreaHeron(l1, l2, l3);

        // 3. Assert
        assertEquals(areaEsperada, areaCalculada, DELTA, "El área para 5-6-7 está mal calculada");
    }
}