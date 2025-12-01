package com.programa;

import java.util.Random;

public class ps_4_34 {

    private String[] deptos = {"Dulces", "Conservas", "Bebidas"};

    // a) Departamento con mayor producción en 4 años
    public String getDeptoMayorProduccion(double[][][] fabrica) {
        double[] totalDepto = new double[3];
        for (int d = 0; d < 3; d++) {
            for (int m = 0; m < 12; m++) {
                for (int a = 0; a < 4; a++) {
                    totalDepto[d] += fabrica[m][a][d];
                }
            }
        }
        
        int maxDeptoIdx = 0;
        if (totalDepto[1] > totalDepto[0]) maxDeptoIdx = 1;
        if (totalDepto[2] > totalDepto[maxDeptoIdx]) maxDeptoIdx = 2;
        
        return deptos[maxDeptoIdx];
    }

    // b) Mes del 2do año (índice 1) con mayor producción
    public int getMesMayorProdAnio2(double[][][] fabrica) {
        double maxProdMes = -1;
        int mesMax = -1;
        for (int m = 0; m < 12; m++) {
            double sumaMes = 0;
            for (int d = 0; d < 3; d++) {
                sumaMes += fabrica[m][1][d]; // Año índice 1
            }
            if (sumaMes > maxProdMes) {
                maxProdMes = sumaMes;
                mesMax = m + 1; // Mes 1-12
            }
        }
        return mesMax;
    }

    // c) Año con mayor producción
    public int getAnioMayorProduccion(double[][][] fabrica) {
        double[] totalAnio = new double[4];
        for (int a = 0; a < 4; a++) {
            for (int m = 0; m < 12; m++) {
                for (int d = 0; d < 3; d++) {
                    totalAnio[a] += fabrica[m][a][d];
                }
            }
        }
        int maxAnioIdx = 0;
        for (int a = 1; a < 4; a++) {
            if (totalAnio[a] > totalAnio[maxAnioIdx]) maxAnioIdx = a;
        }
        return maxAnioIdx + 1; // Año 1-4
    }

    // d) Depto, mes y año de la mayor producción individual
    // Devolvemos un string para simplificar
    public String getDetalleMaxIndividual(double[][][] fabrica) {
        double maxIndividual = -1;
        int mesM = 0, anioM = 0, deptoM = 0;
        for (int m = 0; m < 12; m++) {
            for (int a = 0; a < 4; a++) {
                for (int d = 0; d < 3; d++) {
                    if (fabrica[m][a][d] > maxIndividual) {
                        maxIndividual = fabrica[m][a][d];
                        mesM = m + 1;
                        anioM = a + 1;
                        deptoM = d;
                    }
                }
            }
        }
        return String.format("Mes: %d, Año: %d, Depto: %s", mesM, anioM, deptos[deptoM]);
    }

    // Main para simulación
    public static void main(String[] args) {
        ps_4_34 pf = new ps_4_34();
        double[][][] fabrica = new double[12][4][3];
        Random rand = new Random();
        for (int m = 0; m < 12; m++) {
            for (int a = 0; a < 4; a++) {
                for (int d = 0; d < 3; d++) {
                    fabrica[m][a][d] = rand.nextDouble() * 1000;
                }
            }
        }
        
        System.out.println("a) Depto. con mayor producción: " + pf.getDeptoMayorProduccion(fabrica));
        System.out.println("b) Mes de mayor producción (2do año): Mes " + pf.getMesMayorProdAnio2(fabrica));
        System.out.println("c) Año con mayor producción: " + pf.getAnioMayorProduccion(fabrica));
        System.out.println("d) Mayor producción individual: " + pf.getDetalleMaxIndividual(fabrica));
    }
}