package com.programa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ps_1_13Test {

    private ps_1_13 p = new ps_1_13();

    @Test
    void testCalculosPrisma() {
        double per = 25; // 5 lados de 5
        double apo = 3.44;
        double alt = 10;

        // Cálculos
        double areaBase = p.calcularAreaBase(per, apo); // (25 * 3.44) / 2 = 43
        double areaLateral = p.calcularAreaLateral(per, alt); // 25 * 10 = 250
        double areaTotal = p.calcularAreaTotal(areaBase, areaLateral); // (2 * 43) + 250 = 336
        double volumen = p.calcularVolumen(areaBase, alt); // 43 * 10 = 430

        assertEquals(43.0, areaBase, 0.001, "ps_1_13 - testCalculosPrisma: Área de la base incorrecta (esperado 43.0)");
        assertEquals(250.0, areaLateral, 0.001, "ps_1_13 - testCalculosPrisma: Área lateral incorrecta (esperado 250.0)");
        assertEquals(336.0, areaTotal, 0.001, "ps_1_13 - testCalculosPrisma: Área total incorrecta (esperado 336.0)");
        assertEquals(430.0, volumen, 0.001, "ps_1_13 - testCalculosPrisma: Volumen incorrecto (esperado 430.0)");
    }
}