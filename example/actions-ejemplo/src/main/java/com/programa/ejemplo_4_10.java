package com.programa;

import java.util.Random;

public class ejemplo_4_10 {



    // a) Lluvias mensuales de cada estado, 3er año (índice 2)
    // Devuelve una matriz 32x12
    public double[][] getLluviasAnio3(double[][][] met) {
        double[][] lluviasAnio = new double[32][12];
        for (int e = 0; e < 32; e++) {
            for (int m = 0; m < 12; m++) {
                lluviasAnio[e][m] = met[e][m][2]; // Año índice 2
            }
        }
        return lluviasAnio;
    }

    // b) Total lluvias en el país, 4to año (índice 3)
    public double calcTotalAnio4(double[][][] met) {
        double totalAnio4 = 0;
        for (int e = 0; e < 32; e++) {
            for (int m = 0; m < 12; m++) {
                totalAnio4 += met[e][m][3]; // Año índice 3
            }
        }
        return totalAnio4;
    }

    public double calcTotalEst17Anio5(double[][][] met) {
        double totalEst17Anio5 = 0;
        for (int m = 0; m < 12; m++) {
            totalEst17Anio5 += met[16][m][4]; // Estado 16, Año 4
        }
        return totalEst17Anio5;
    }

    public double calcGranTotal(double[][][] met) {
        double granTotal = 0;
        for (int e = 0; e < 32; e++) {
            for (int m = 0; m < 12; m++) {
                for (int a = 0; a < 5; a++) {
                    granTotal += met[e][m][a];
                }
            }
        }
        return granTotal;
    }

    public static void main(String[] args) {
        ejemplo_4_10 m3d = new ejemplo_4_10();
        double[][][] met = new double[32][12][5];
        Random rand = new Random();
        for (int e = 0; e < 32; e++) {
            for (int m = 0; m < 12; m++) {
                for (int a = 0; a < 5; a++) {
                    met[e][m][a] = rand.nextDouble() * 100;
                }
            }
        }
        
        System.out.println("--- a) Lluvias del 3er año ---");
        System.out.println("(Salida omitida por brevedad...)\n");
       

        System.out.printf("--- b) Total Lluvias 4to año: %.2f\n", m3d.calcTotalAnio4(met));
        System.out.printf("--- c) Total Lluvias Est. 17 (Último año): %.2f\n", m3d.calcTotalEst17Anio5(met));
        System.out.printf("--- d) Gran Total 5 años: %.2f\n", m3d.calcGranTotal(met));
    }
}