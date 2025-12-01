package com.anahi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.anahi.soluciones.Ejemplo42Solucion;

public class Ejemplo42Test {

    @Test
    void promedioCorrecto() {
        assertEquals(10.0, Ejemplo42Solucion.promedio(700.0, 70), 1e-9);
    }

    @Test
    void contarMayores() {
        double[] s = new double[70];
        // 35 sueldos en 8, 35 sueldos en 12 -> prom=10, mayores=35
        for (int i=0;i<35;i++) s[i]=8.0;
        for (int i=35;i<70;i++) s[i]=12.0;
        int cont = Ejemplo42Solucion.contarMayoresQue(s, 10.0);
        assertEquals(35, cont);
    }
}
