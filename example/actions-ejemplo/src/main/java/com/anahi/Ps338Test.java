package com.anahi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Ps338Solucion;

public class Ps338Test {

    @Test
    void totalFacturaBasico() {
        double[] precios = new double[]{0, 45, 30, 58, 10, 12, 8, 7}; // 1..7
        int[] claves = new int[]{5, 6, 9, 1}; // incluye una clave inválida 9
        int[] cants  = new int[]{1, 2, 3, 1};
        // total = P5*1 + P6*2 + (clave 9 ignorada) + P1*1 = 12 + 16 + 45 = 73
        assertEquals(73.0, Ps338Solucion.totalFactura(precios, claves, cants), 1e-9);
    }

    @Test
    void totalFacturaMultiplesRenglones() {
        double[] precios = new double[]{0, 10, 20, 30, 40, 50, 60, 70}; // 1..7
        int[] claves = new int[]{1,2,3,4,5,6,7};
        int[] cants  = new int[]{1,1,1,1,1,1,1};
        assertEquals(10+20+30+40+50+60+70, Ps338Solucion.totalFactura(precios, claves, cants), 1e-9);
    }
}
