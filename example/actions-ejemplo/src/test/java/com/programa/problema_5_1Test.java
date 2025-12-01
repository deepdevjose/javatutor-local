package com.programa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

// IMPORTANTE: Importamos la clase estática interna para poder usar "MatrizElemento" directamente
import com.programa.problema_5_1.MatrizElemento;

class problema_5_1Test {

    // ELIMINADO: Ya no necesitamos instanciar la clase principal
    // private problema_5_1 s = new problema_5_1(); 

    @Test
    void testSumaEsparcida() {
        int M = 3, N = 4;

        // Matriz A: [5,0,0,8], [0,0,7,0], [0,3,0,0]
        List<MatrizElemento> A1 = new ArrayList<>();
        // Al haber hecho el import arriba, podemos seguir usando "new MatrizElemento(...)"
        A1.add(new MatrizElemento(0, 0, 5));
        A1.add(new MatrizElemento(0, 3, 8));
        A1.add(new MatrizElemento(1, 2, 7));
        A1.add(new MatrizElemento(2, 1, 3));
        
        // Matriz B: [0,0,0,8], [0,6,0,0], [0,3,4,0]
        List<MatrizElemento> B1 = new ArrayList<>();
        B1.add(new MatrizElemento(0, 3, 8));
        B1.add(new MatrizElemento(1, 1, 6));
        B1.add(new MatrizElemento(2, 1, 3));
        B1.add(new MatrizElemento(2, 2, 4));

        // C = A + B
        int[][] C_esperada = {
            {5, 0, 0, 16}, // 8+8=16
            {0, 6, 7, 0},
            {0, 6, 4, 0}   // 3+3=6
        };

        // CAMBIO: Llamada directa a la función estática (Clase.metodo)
        int[][] C_real = problema_5_1.sumar(A1, B1, M, N);

        assertArrayEquals(C_esperada, C_real, "problema_5_1 - testSumaEsparcida: La suma de matrices esparcidas no coincide con la esperada");
    }
}