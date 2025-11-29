package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class problema_ps_3_2_test {

    @Test
    void testPromedioCalificacionesBasico() {
        double[] calificaciones = {85, 90, 78, 92, 88, -1};
        double promedio = problema_ps_3_2.calcularPromedio(calificaciones);
        assertEquals(86.6, promedio, 0.01);
    }

    @Test
    void testPromedioTresCalificaciones() {
        double[] calificaciones = {100, 90, 80, -1};
        double promedio = problema_ps_3_2.calcularPromedio(calificaciones);
        assertEquals(90.0, promedio, 0.01);
    }

    @Test
    void testPromedioUnaCalificacion() {
        double[] calificaciones = {100, -1};
        double promedio = problema_ps_3_2.calcularPromedio(calificaciones);
        assertEquals(100.0, promedio, 0.01);
    }

    @Test
    void testPromedioSinCalificaciones() {
        double[] calificaciones = {-1};
        double promedio = problema_ps_3_2.calcularPromedio(calificaciones);
        assertEquals(0.0, promedio, 0.01);
    }

    @Test
    void testPromedioConDecimales() {
        double[] calificaciones = {85.5, 90.75, 88.25, -1};
        double promedio = problema_ps_3_2.calcularPromedio(calificaciones);
        assertEquals(88.1667, promedio, 0.01);
    }

    @Test
    void testPromedioCalificacionesPerfectas() {
        double[] calificaciones = {100, 100, 100, 100, -1};
        double promedio = problema_ps_3_2.calcularPromedio(calificaciones);
        assertEquals(100.0, promedio, 0.01);
    }
}
