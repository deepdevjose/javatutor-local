package com.xavier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPractica4_16 {

    @Test
    public void testDiagonalCorrecta() {
        double[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Diagonal principal esperada: 1, 5, 9
        double[] esperada = {1, 5, 9};
        double[] obtenida = new double[3];

        for (int i = 0; i < 3; i++) {
            obtenida[i] = A[i][i];
        }

        assertArrayEquals(esperada, obtenida, 1e-9);
    }
}
