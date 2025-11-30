package com.xavier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestEjemplo5_6 {

    @Test
    public void testDomicilio() {
        Ejemplo5_6.Domicilio d = new Ejemplo5_6.Domicilio("Av. Reforma", 55, "CDMX", "México");
        assertEquals("Av. Reforma #55, CDMX, México", d.toString());
    }

    @Test
    public void testEmpleadoCompleto() {
        Ejemplo5_6.Domicilio d = new Ejemplo5_6.Domicilio("Calle 3", 22, "Toluca", "México");
        Ejemplo5_6.Empleado e = new Ejemplo5_6.Empleado(3, "Ana Torres", d, "Recursos Humanos", 1, 15000.0);

        assertTrue(e.toString().contains("Ana Torres"));
        assertTrue(e.toString().contains("Recursos Humanos"));
    }
}
