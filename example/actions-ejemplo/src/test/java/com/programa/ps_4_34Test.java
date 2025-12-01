package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
// No necesitamos @BeforeEach
import org.junit.jupiter.api.Test;

class ps_4_34Test {

    private ps_4_34 pf = new ps_4_34();

    @Test
    void testGetDeptoMayorProduccion() {
        // Test para 'a': Depto con mayor producción total
        double[][][] fabricaTest = new double[12][4][3];
        
        // Datos: Depto 2 (Bebidas) debe ganar
        fabricaTest[0][0][0] = 100; // Dulces
        fabricaTest[0][0][1] = 50;  // Conservas
        fabricaTest[0][0][2] = 1000; // Bebidas
        fabricaTest[1][1][2] = 500; // Bebidas

    assertEquals("Bebidas", pf.getDeptoMayorProduccion(fabricaTest), "ps_4_34 - testGetDeptoMayorProduccion: Se esperaba 'Bebidas' como depto con mayor producción");
    }

    @Test
    void testGetMesMayorProdAnio2() {
        // Test para 'b': Mes del 2do año (idx 1) con mayor producción
        double[][][] fabricaTest = new double[12][4][3];

        // Datos: Mes 2 (índice 1) debe ganar
        fabricaTest[0][1][0] = 10; // Mes 1, Año 2
        fabricaTest[1][1][0] = 50; // Mes 2, Año 2
        fabricaTest[2][1][0] = 20; // Mes 3, Año 2

    assertEquals(2, pf.getMesMayorProdAnio2(fabricaTest), "ps_4_34 - testGetMesMayorProdAnio2: Se esperaba mes 2 para el año 2 con mayor producción");
    }

    @Test
    void testGetAnioMayorProduccion() {
        // Test para 'c': Año con mayor producción total
        double[][][] fabricaTest = new double[12][4][3];
        
        // Datos: Año 3 (índice 2) debe ganar
        fabricaTest[0][0][0] = 5;   // Año 1
        fabricaTest[0][1][0] = 10;  // Año 2
        fabricaTest[0][2][0] = 1000; // Año 3
        fabricaTest[0][3][0] = 1;   // Año 4

    assertEquals(3, pf.getAnioMayorProduccion(fabricaTest), "ps_4_34 - testGetAnioMayorProduccion: Se esperaba el año 3 como el de mayor producción");
    }

    @Test
    void testGetDetalleMaxIndividual() {
        // Test para 'd': Máximo valor individual
        double[][][] fabricaTest = new double[12][4][3];

        // Datos: El valor 9999 debe ser el máximo
        fabricaTest[0][0][0] = 100;
        fabricaTest[5][2][1] = 9999; // Mes 6, Año 3, Depto 1 (Conservas)
        fabricaTest[0][0][2] = 1000;

    assertEquals("Mes: 6, Año: 3, Depto: Conservas", pf.getDetalleMaxIndividual(fabricaTest), "ps_4_34 - testGetDetalleMaxIndividual: Se esperaba detalle del máximo individual en Mes 6, Año 3, Depto Conservas");
    }
}