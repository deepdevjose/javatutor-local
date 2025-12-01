package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class problema_3_13Test {

    @Test
    void testProcesarDatos() {
        // CAMBIO 1: Ya no necesitamos instanciar la clase (new problema_3_13)
        // problema_3_13 m = new problema_3_13(); <-- Eliminado
        
        // Datos de prueba (12 meses)
        // Norte: 10 todo el año (Total 120)
        double[] rno = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        // Centro: 20 todo el año (Total 240, Promedio 20)
        double[] rce = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20};
        // Sur: 30 todo el año, excepto mes 3 (Marzo) con 5 (Total 335)
        double[] rsu = {30, 30, 5, 30, 30, 30, 30, 30, 30, 30, 30, 30};

        // CAMBIO 2: Llamamos al método estático directamente desde la clase.
        // CAMBIO 3: El tipo de dato ahora es la clase anidada 'problema_3_13.ReporteClima'
        problema_3_13.ReporteClima reporte = problema_3_13.procesarDatos(rno, rce, rsu);

        // a) Test Promedio Centro
        assertEquals(20.0, reporte.promedioCentro, 0.001, 
            "problema_3_13 - testProcesarDatos: Promedio Región Centro debe ser 20.0");
        
        // b) Test Menor Lluvia Sur
        assertEquals(5.0, reporte.registroMenorLluviaSur, 0.001, 
            "problema_3_13 - testProcesarDatos: Registro menor en Región Sur debe ser 5.0");
        
        assertEquals(3, reporte.mesMenorLluviaSur, 
            "problema_3_13 - testProcesarDatos: El mes con menor lluvia en Región Sur debe ser 3 (Marzo)");

        // c) Test Región Mayor
        assertEquals("SUR", reporte.regionMayorLluvia, 
            "problema_3_13 - testProcesarDatos: La región con mayor lluvia anual debe ser 'SUR'");
    }
}