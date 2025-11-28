package com.example; // Mismo paquete

// Importaciones de JUnit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList; // Importamos ArrayList para crear los datos

/**
 * Esta es la clase de prueba para Ejemplo_3_4
 */
class Ejemplo_3_4_Test { // El nombre puede variar un poco (Ejemplo_3_4Test)

    /**
     * La anotación @Test le dice a JUnit que esto es una prueba.
     */
    @Test
    void testSumaDeVariosGastos() {
        // 1. PREPARAR (Arrange)
        // Creamos la clase que queremos probar
        Ejemplo_3_4 app = new Ejemplo_3_4();
        
        // Creamos una lista de gastos de prueba
        ArrayList<Double> misGastos = new ArrayList<>();
        misGastos.add(10.0);
        misGastos.add(20.5);
        misGastos.add(5.0);
        
        // Definimos el resultado que esperamos
        double sumaEsperada = 35.5;

        // 2. ACTUAR (Act)
        // Llamamos al método de lógica que creamos
        double sumaCalculada = app.calcularTotalGastos(misGastos); // Esta línea ahora funcionará

        // 3. VERIFICAR (Assert)
        // Comparamos si lo esperado es igual a lo calculado
        assertEquals(sumaEsperada, sumaCalculada, 0.001, "La suma de 10, 20.5 y 5 debe ser 35.5");
    }

    @Test
    void testSumaConListaVacia() {
        // 1. PREPARAR
        Ejemplo_3_4 app = new Ejemplo_3_4();
        ArrayList<Double> gastosVacios = new ArrayList<>();
        double sumaEsperada = 0.0; // Si no hay gastos, la suma es 0

        // 2. ACTUAR
        double sumaCalculada = app.calcularTotalGastos(gastosVacios); // Esta línea también funcionará

        // 3. VERIFICAR
        assertEquals(sumaEsperada, sumaCalculada, 0.001, "La suma de una lista vacía debe ser 0.0");
    }
}