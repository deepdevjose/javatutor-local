package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class problema_4_15Test {

    @Test
    void testObtenerSucursalMasVendida() {
        double[][] montos = {
            {1000, 2000, 1500},
            {1200, 1800, 1600},
            {1100, 2100, 1700}
        };
        // La sucursal 2 tiene mayores ventas totales
        int resultado = problema_4_15.obtenerSucursalMasVendida(montos);
        assertEquals(2, resultado, "Debe retornar la sucursal 2 como la más vendida");
    }

    @Test
    void testCalcularPromedioVentasAnuales() {
        double[][] montos = {
            {1000, 2000, 3000},
            {1500, 2500, 3500}
        };
        double[] esperados = {2000.0, 2500.0};
        double[] resultado = problema_4_15.calcularPromedioVentasAnuales(montos);

        assertArrayEquals(esperados, resultado, 0.0001, "Los promedios anuales deben coincidir");
    }

    @Test
    void testObtenerAñoMayorPromedioVentas() {
        double[] promedios = {2000.0, 2500.0, 2400.0};
        int resultado = problema_4_15.obtenerAñoMayorPromedioVentas(promedios);
        assertEquals(2, resultado, "Debe retornar el año 2 como el de mayor promedio de ventas");
    }

    @Test
    void testConValoresNegativos() {
        double[][] montos = {
            {-100, -200, -300},
            {-50, -150, -250}
        };
        // La sucursal 1 tiene las menores pérdidas (menos negativo)
        int resultado = problema_4_15.obtenerSucursalMasVendida(montos);
        assertEquals(1, resultado, "Debe retornar la sucursal 1 incluso con valores negativos");

        double[] promedios = problema_4_15.calcularPromedioVentasAnuales(montos);
        assertEquals(-200.0, promedios[0], 0.0001);
        assertEquals(-150.0, promedios[1], 0.0001);

        int añoMayorPromedio = problema_4_15.obtenerAñoMayorPromedioVentas(promedios);
        assertEquals(2, añoMayorPromedio, "El año 2 tiene mayor (menos negativo) promedio");
    }

    @Test
    void testUnSoloElemento() {
        double[][] montos = {{500}};
        assertEquals(1, problema_4_15.obtenerSucursalMasVendida(montos));
        double[] promedios = problema_4_15.calcularPromedioVentasAnuales(montos);
        assertArrayEquals(new double[]{500}, promedios);
        assertEquals(1, problema_4_15.obtenerAñoMayorPromedioVentas(promedios));
    }
}
 