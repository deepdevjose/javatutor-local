package com.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class problema_5_1 {

    // --- DEFINICIÓN DE ESTRUCTURA (STRUCT) ---
    // Representa un elemento no cero de la matriz dispersa.
    // 'public' para que sea accesible desde tests u otras clases sin getters/setters.
    public static class MatrizElemento {
        public int ren, col, val;
        
        public MatrizElemento(int ren, int col, int val) {
            this.ren = ren; 
            this.col = col; 
            this.val = val;
        }
    }

    // --- MÓDULO DE PROCESAMIENTO (Función Pura) ---
    // Recibe dos listas (matrices dispersas) y devuelve una matriz densa (int[][])
    public static int[][] sumar(List<MatrizElemento> A1, List<MatrizElemento> B1, int M, int N) {
        int[][] C = new int[M][N]; // Inicializada en 0 por defecto
        int i = 0, j = 0;

        // Algoritmo de mezcla (Merge) de listas ordenadas
        while (i < A1.size() && j < B1.size()) {
            MatrizElemento elA = A1.get(i);
            MatrizElemento elB = B1.get(j);

            if (elA.ren < elB.ren) {
                // El renglón de A es menor, se copia A
                C[elA.ren][elA.col] = elA.val;
                i++;
            } else if (elB.ren < elA.ren) {
                // El renglón de B es menor, se copia B
                C[elB.ren][elB.col] = elB.val;
                j++;
            } else { 
                // Renglones iguales, comparamos columnas
                if (elA.col < elB.col) {
                    C[elA.ren][elA.col] = elA.val;
                    i++;
                } else if (elB.col < elA.col) {
                    C[elB.ren][elB.col] = elB.val;
                    j++;
                } else { 
                    // Misma posición (renglón y columna): Se suman
                    C[elA.ren][elA.col] = elA.val + elB.val;
                    i++;
                    j++;
                }
            }
        }
        
        // Copiar los elementos restantes si una lista se acabó antes que la otra
        while (i < A1.size()) { 
            MatrizElemento el = A1.get(i);
            C[el.ren][el.col] = el.val; 
            i++; 
        }
        while (j < B1.size()) { 
            MatrizElemento el = B1.get(j);
            C[el.ren][el.col] = el.val; 
            j++; 
        }
        
        return C;
    }

    // --- BLOQUE PRINCIPAL (Main) ---
    public static void main(String[] args) {
        // Configuración de dimensiones
        int M = 3, N = 4;
        
        // 1. Preparar Datos (Simulación de entrada)
        List<MatrizElemento> A1 = new ArrayList<>();
        A1.add(new MatrizElemento(0, 0, 5));
        A1.add(new MatrizElemento(1, 2, 7));
        
        List<MatrizElemento> B1 = new ArrayList<>();
        B1.add(new MatrizElemento(0, 0, 10)); // Coincide con A1 (se sumará: 5+10=15)
        B1.add(new MatrizElemento(2, 2, 9));  // Nuevo elemento
        
        // 2. Procesar (Llamada directa a función estática)
        int[][] C = sumar(A1, B1, M, N);

        // 3. Salida de Resultados
        System.out.println("--- Matriz Resultante C (A + B) ---");
        for (int r = 0; r < M; r++) {
            System.out.println(Arrays.toString(C[r]));
        }
    }
}