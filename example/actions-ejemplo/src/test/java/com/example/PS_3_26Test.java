package com.example;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PS_3_26Test {

    // Margen de error para comparar doubles
    private static final double DELTA = 0.001;

    @Test
    void testEstadisticasGrupoMixto() {
        // 1. Arrange (Preparar)
        // Creamos una lista con 3 alumnos: 2 F, 1 M
        List<PS_3_26.Alumno> lista = List.of(
            new PS_3_26.Alumno(0, 8.0), // Femenino, Promedio 8
            new PS_3_26.Alumno(1, 10.0), // Masculino, Promedio 10
            new PS_3_26.Alumno(0, 9.0)  // Femenino, Promedio 9
        );
        
        // N = 3
        // Femenino: C=2, Suma=17.0, Prom=8.5, Porc=(2/3)*100 = 66.666...
        // Masculino: C=1, Suma=10.0, Prom=10.0, Porc=(1/3)*100 = 33.333...
        // General: C=3, Suma=27.0, Prom=9.0

        // 2. Act (Actuar)
        PS_3_26.Estadisticas stats = PS_3_26.calcularEstadisticas(lista);

        // 3. Assert (Verificar)
        assertEquals(66.666, stats.porcentajeFemenino, DELTA);
        assertEquals(8.5, stats.promedioFemenino, DELTA);
        assertEquals(33.333, stats.porcentajeMasculino, DELTA);
        assertEquals(10.0, stats.promedioMasculino, DELTA);
        assertEquals(9.0, stats.promedioGeneral, DELTA);
    }

    @Test
    void testEstadisticasListaVacia() {
        // 1. Arrange
        // Creamos una lista vacía
        List<PS_3_26.Alumno> lista = Collections.emptyList();
        
        // 2. Act
        PS_3_26.Estadisticas stats = PS_3_26.calcularEstadisticas(lista);

        // 3. Assert
        // Todos los valores deben ser 0 gracias a las protecciones (N > 0)
        assertEquals(0.0, stats.porcentajeFemenino, DELTA);
        assertEquals(0.0, stats.promedioFemenino, DELTA);
        assertEquals(0.0, stats.porcentajeMasculino, DELTA);
        assertEquals(0.0, stats.promedioMasculino, DELTA);
        assertEquals(0.0, stats.promedioGeneral, DELTA);
    }
    
    @Test
    void testEstadisticasSoloFemenino() {
        // 1. Arrange
        List<PS_3_26.Alumno> lista = List.of(
            new PS_3_26.Alumno(0, 7.0),
            new PS_3_26.Alumno(0, 8.0)
        );
        
        // N = 2
        // Femenino: C=2, Suma=15.0, Prom=7.5, Porc=100.0
        // Masculino: C=0, Suma=0, Prom=0, Porc=0.0
        // General: C=2, Suma=15.0, Prom=7.5

        // 2. Act
        PS_3_26.Estadisticas stats = PS_3_26.calcularEstadisticas(lista);

        // 3. Assert
        assertEquals(100.0, stats.porcentajeFemenino, DELTA);
        assertEquals(7.5, stats.promedioFemenino, DELTA);
        assertEquals(0.0, stats.porcentajeMasculino, DELTA);
        assertEquals(0.0, stats.promedioMasculino, DELTA);
        assertEquals(7.5, stats.promedioGeneral, DELTA);
    }
    
    @Test
    void testEstadisticasSoloMasculino() {
        // 1. Arrange
        List<PS_3_26.Alumno> lista = List.of(
            new PS_3_26.Alumno(1, 10.0)
        );
        
        // N = 1
        // Femenino: C=0, Suma=0, Prom=0, Porc=0.0
        // Masculino: C=1, Suma=10.0, Prom=10.0, Porc=100.0
        // General: C=1, Suma=10.0, Prom=10.0

        // 2. Act
        PS_3_26.Estadisticas stats = PS_3_26.calcularEstadisticas(lista);

        // 3. Assert
        assertEquals(0.0, stats.porcentajeFemenino, DELTA);
        assertEquals(0.0, stats.promedioFemenino, DELTA);
        assertEquals(100.0, stats.porcentajeMasculino, DELTA);
        assertEquals(10.0, stats.promedioMasculino, DELTA);
        assertEquals(10.0, stats.promedioGeneral, DELTA);
    }
}