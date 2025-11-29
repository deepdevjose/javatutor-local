package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class problema_ps_3_3_test {

    @Test
    void testContarParesImparesEquilibrado() {
        int[] numeros = {12, 7, 8, 15, 20, 3};
        problema_ps_3_3.ResultadoConteo resultado = problema_ps_3_3.contarParesImpares(numeros, 6);
        assertEquals(3, resultado.pares);
        assertEquals(3, resultado.impares);
    }

    @Test
    void testTodosPares() {
        int[] numeros = {2, 4, 6, 8, 10};
        problema_ps_3_3.ResultadoConteo resultado = problema_ps_3_3.contarParesImpares(numeros, 5);
        assertEquals(5, resultado.pares);
        assertEquals(0, resultado.impares);
    }

    @Test
    void testTodosImpares() {
        int[] numeros = {1, 3, 5, 7};
        problema_ps_3_3.ResultadoConteo resultado = problema_ps_3_3.contarParesImpares(numeros, 4);
        assertEquals(0, resultado.pares);
        assertEquals(4, resultado.impares);
    }

    @Test
    void testConCero() {
        int[] numeros = {0, 1, 2, 3};
        problema_ps_3_3.ResultadoConteo resultado = problema_ps_3_3.contarParesImpares(numeros, 4);
        assertEquals(2, resultado.pares);  // 0 y 2 son pares
        assertEquals(2, resultado.impares);  // 1 y 3 son impares
    }

    @Test
    void testUnSoloNumero() {
        int[] numeros = {7};
        problema_ps_3_3.ResultadoConteo resultado = problema_ps_3_3.contarParesImpares(numeros, 1);
        assertEquals(0, resultado.pares);
        assertEquals(1, resultado.impares);
    }

    @Test
    void testNumerosNegativos() {
        int[] numeros = {-2, -3, -4, -5};
        problema_ps_3_3.ResultadoConteo resultado = problema_ps_3_3.contarParesImpares(numeros, 4);
        assertEquals(2, resultado.pares);   // -2 y -4
        assertEquals(2, resultado.impares);  // -3 y -5
    }

    @Test
    void testNumerosMixtos() {
        int[] numeros = {10, 15, 22, 33, 44, 55, 66};
        problema_ps_3_3.ResultadoConteo resultado = problema_ps_3_3.contarParesImpares(numeros, 7);
        assertEquals(4, resultado.pares);   // 10, 22, 44, 66
        assertEquals(3, resultado.impares);  // 15, 33, 55
    }
}
