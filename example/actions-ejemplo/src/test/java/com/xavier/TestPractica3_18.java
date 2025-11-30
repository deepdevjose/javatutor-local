package com.xavier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPractica3_18 {

    @Test
    public void testBasico() {
        assertEquals(8.0, Practica3_18.powNoPow(2.0, 3), 1e-9);
        assertEquals(1.0, Practica3_18.powNoPow(5.0, 0), 1e-9);
        assertEquals(27.0, Practica3_18.powNoPow(3.0, 3), 1e-9);
    }

    @Test
    public void testDecimales() {
        assertEquals(2.25, Practica3_18.powNoPow(1.5, 2), 1e-9);
        assertEquals(0.125, Practica3_18.powNoPow(0.5, 3), 1e-9);
    }
}
