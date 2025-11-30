package com.xavier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPractica3_44 {

    @Test
    public void testCasoValido() {
        // No verifica impresión, solo que no ocurra error con N positivo
        Practica3_44.ejecutar(5);
    }

    @Test
    public void testCasoInvalido() {
        // Solo validamos que el método no truene con números negativos
        Practica3_44.ejecutar(-2); 
    }
}
