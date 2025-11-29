package com.tutortics;
// tests/ejemplo_1.13_test.java

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ejemplo_1_13_test {

    @Test
    void testCalcularPromedio() {
        // Arrange: Crear una instancia de la clase a probar
    ejemplo_1_13 calculator = new ejemplo_1_13();
        
        // Act: Llamar al método con datos de prueba
        double promedio = calculator.calcularPromedio(10.0, 9.0, 8.0, 7.0, 6.0);
        
        // Assert: Verificar que el resultado es el esperado
        // (10+9+8+7+6) / 5 = 40 / 5 = 8.0
        // Restaurado: verificar el valor correcto
        assertEquals(8.0, promedio, 0.001, "El promedio de 10,9,8,7,6 debería ser 8.0");
    }

    @Test
    void testCalcularPromedioConDecimales() {
        // Arrange
        ejemplo_1_13 calculator = new ejemplo_1_13();
        
        // Act
        double promedio = calculator.calcularPromedio(8.5, 9.5, 7.0, 10.0, 8.0);
        
        // Assert
        // (8.5 + 9.5 + 7.0 + 10.0 + 8.0) / 5 = 43 / 5 = 8.6
        assertEquals(8.6, promedio, 0.001, "El promedio de 8.5,9.5,7,10,8 debería ser 8.6");
    }
}
