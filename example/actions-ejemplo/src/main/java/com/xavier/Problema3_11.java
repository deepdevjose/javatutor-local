package com.xavier;

/**
 * Problema 3.11
 *
 * Instrucciones para el alumno:
 * -------------------------------------------------------------
 * Se tiene un arreglo de votos donde cada elemento representa
 * un candidato (1 a 4). El alumno debe:
 *
 * 1) Contar cuántos votos recibió cada candidato.
 * 2) Calcular la suma total de votos.
 * 3) Calcular el porcentaje que representa cada candidato respecto al total.
 *
 * Los valores deben guardarse en las variables can1, can2, can3, can4,
 * sumv y por1, por2, por3, por4.
 *
 * Nota:
 * - El test llamará contarVotos(votos[]) y luego verificará los getters.
 * - No debes imprimir nada, solo llenar las variables.
 */
public class Problema3_11 {

    // Variables que el test verificará
    private int can1, can2, can3, can4;
    private int sumv;
    private double por1, por2, por3, por4;

    /**
     * Procesa los votos y calcula:
     * - Cantidad por candidato
     * - Total de votos
     * - Porcentajes
     */
    public void contarVotos(int[] votos) {

        // TODO 1: reiniciar contadores
        can1 = 0;
        can2 = 0;
        can3 = 0;
        can4 = 0;

        // TODO 2: contar votos según números 1, 2, 3, 4

        // TODO 3: calcular sumv = total de votos

        // TODO 4: calcular porcentajes por1..por4
        // Fórmula: (cantidad / total) * 100

    }

    // Getters usados por el test
    public int getCan1() { return can1; }
    public int getCan2() { return can2; }
    public int getCan3() { return can3; }
    public int getCan4() { return can4; }
    public int getSumv() { return sumv; }

    public double getPor1() { return por1; }
    public double getPor2() { return por2; }
    public double getPor3() { return por3; }
    public double getPor4() { return por4; }
}
