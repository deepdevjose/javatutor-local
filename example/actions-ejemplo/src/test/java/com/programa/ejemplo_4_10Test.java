package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ejemplo_4_10Test {

    private ejemplo_4_10 m3d = new ejemplo_4_10();
    // Usamos un set de datos conocido
    // [Estado][Mes][Año]
    private double[][][] metTest = new double[32][12][5];

    @BeforeEach
    void setUp() {
        // Llenamos solo los datos que nos interesan
        // Estado 17 (idx 16), Año 5 (idx 4)
        metTest[16][0][4] = 10;
        metTest[16][1][4] = 20; // 10+20=30
        
        // Año 4 (idx 3)
        metTest[0][0][3] = 100;
        metTest[1][0][3] = 200; // 100+200=300
        
        // Gran Total (30 + 300 = 330)
    }

    @Test
    void testCalcTotalAnio4() {
        assertEquals(300.0, m3d.calcTotalAnio4(metTest), 0.001, "ejemplo_4_10 - testCalcTotalAnio4: El total del año 4 debe ser 300.0 para los datos de prueba");
    }

    @Test
    void testCalcTotalEst17Anio5() {
        assertEquals(30.0, m3d.calcTotalEst17Anio5(metTest), 0.001, "ejemplo_4_10 - testCalcTotalEst17Anio5: El total del estado 17 en el año 5 debe ser 30.0 para los datos de prueba");
    }

    @Test
    void testCalcGranTotal() {
        // Suma todos los elementos. En nuestro test, es 30 + 300 = 330
        assertEquals(330.0, m3d.calcGranTotal(metTest), 0.001, "ejemplo_4_10 - testCalcGranTotal: El gran total debe ser 330.0 para los datos de prueba");
    }
}