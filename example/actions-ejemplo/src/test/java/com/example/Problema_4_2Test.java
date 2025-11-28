package com.example;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import org.junit.jupiter.api.Test; // Usamos la interfaz List para más flexibilidad

class Problema_4_2Test {

    @Test
    void testEliminarDuplicados_CasoNormal() {
        // 1. Arrange (Preparar)
        ArrayList<Integer> original = new ArrayList<>(List.of(10, 20, 10, 30, 20, 40));
        
        // LinkedHashSet debe mantener el orden de la PRIMERA aparición
        List<Integer> esperado = List.of(10, 20, 30, 40); 

        // 2. Act (Actuar)
        ArrayList<Integer> resultado = Problema_4_2.eliminarDuplicados(original);

        // 3. Assert (Verificar)
        // assertIterableEquals es la mejor forma de comparar listas en JUnit 5
        assertIterableEquals(esperado, resultado, "La eliminación de duplicados falló o no mantuvo el orden");
    }

    @Test
    void testEliminarDuplicados_SinDuplicados() {
        // 1. Arrange
        ArrayList<Integer> original = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> esperado = List.of(1, 2, 3, 4, 5); 

        // 2. Act
        ArrayList<Integer> resultado = Problema_4_2.eliminarDuplicados(original);

        // 3. Assert
        assertIterableEquals(esperado, resultado, "La lista sin duplicados debería permanecer igual");
    }

    @Test
    void testEliminarDuplicados_TodosIguales() {
        // 1. Arrange
        ArrayList<Integer> original = new ArrayList<>(List.of(7, 7, 7, 7));
        List<Integer> esperado = List.of(7); 

        // 2. Act
        ArrayList<Integer> resultado = Problema_4_2.eliminarDuplicados(original);

        // 3. Assert
        assertIterableEquals(esperado, resultado, "Debería quedar un solo elemento si todos son iguales");
    }

    @Test
    void testEliminarDuplicados_ListaVacia() {
        // 1. Arrange
        ArrayList<Integer> original = new ArrayList<>();
        List<Integer> esperado = List.of(); // Una lista vacía

        // 2. Act
        ArrayList<Integer> resultado = Problema_4_2.eliminarDuplicados(original);

        // 3. Assert
        assertIterableEquals(esperado, resultado, "Una lista vacía de entrada debe dar una lista vacía de salida");
    }
    
    @Test
    void testEliminarDuplicados_ConNegativos() {
        // 1. Arrange
        ArrayList<Integer> original = new ArrayList<>(List.of(-5, 10, -5, 0, 10, -5));
        List<Integer> esperado = List.of(-5, 10, 0); 

        // 2. Act
        ArrayList<Integer> resultado = Problema_4_2.eliminarDuplicados(original);

        // 3. Assert
        assertIterableEquals(esperado, resultado, "La lógica falló con números negativos");
    }
}