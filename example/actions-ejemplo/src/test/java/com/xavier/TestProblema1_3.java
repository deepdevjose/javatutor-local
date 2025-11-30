package com.xavier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProblema1_3 {

    @Test
    public void testConversionPeso() {
        Problema1_3 p = new Problema1_3();
        assertEquals(45.3592, p.convertirPeso(100), 0.0001);
    }

    @Test
    public void testConversionLongitud() {
        Problema1_3 p = new Problema1_3();
        assertEquals(3.047, p.convertirLongitud(10), 0.0001);
    }
}
