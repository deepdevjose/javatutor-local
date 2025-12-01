package com.anahi;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Ps55Solucion;
import com.anahi.soluciones.Ps55Solucion.Hab;
import com.anahi.soluciones.Ps55Solucion.Hue;

public class Ps55Test {

    @Test
    void contarDisponiblesYReserva() {
        Hab[] habs = new Hab[]{
            new Hab(101,"SI",500,"SI"),
            new Hab(102,"DO",800,"NO"),
            new Hab(201,"TR",1200,"SI")
        };
        int nH = habs.length;
        Hue[] hues = new Hue[10];
        int[] mH = new int[]{1};
        hues[0] = new Hue(102,"Ana",10);

        assertEquals(1, Ps55Solucion.contarDisponibles(habs,nH,"SI"));
        assertTrue(Ps55Solucion.reservar(habs,nH,hues,mH,201,"Luis",15));
        assertEquals("NO", habs[2].disp);
    }

    @Test
    void calcularPagoYEliminar() {
        Hab[] habs = new Hab[]{
            new Hab(101,"SI",500,"NO"),
            new Hab(102,"DO",800,"SI")
        };
        Hue[] hues = new Hue[10];
        int[] mH = new int[]{1};
        hues[0] = new Hue(101,"Ana",10);

        // 3 noches * 500 = 1500
        assertEquals(1500.0, Ps55Solucion.calcularPago(habs,2,hues,mH[0],"Ana",13), 1e-9);
        assertTrue(Ps55Solucion.eliminarHuesped(habs,2,hues,mH,"Ana"));
        assertEquals("SI", habs[0].disp);
        assertEquals(0, mH[0]);
    }
}
