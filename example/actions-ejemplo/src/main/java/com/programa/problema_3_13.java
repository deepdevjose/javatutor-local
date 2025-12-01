package com.programa;

import java.util.Scanner;

public class problema_3_13 {

    
    static class ReporteClima {
        double promedioCentro;
        int mesMenorLluviaSur;
        double registroMenorLluviaSur;
        String regionMayorLluvia;
    }

    
    public static ReporteClima procesarDatos(double[] rno, double[] rce, double[] rsu) {
        ReporteClima reporte = new ReporteClima();
        
        double arno = 0, arce = 0, arsu = 0; // Acumuladores anuales
        reporte.registroMenorLluviaSur = Double.MAX_VALUE;
        reporte.mesMenorLluviaSur = -1;

        
        for (int i = 0; i < 12; i++) {
            arno += rno[i];
            arce += rce[i];
            arsu += rsu[i];


            if (rsu[i] < reporte.registroMenorLluviaSur) {
                reporte.registroMenorLluviaSur = rsu[i];
                reporte.mesMenorLluviaSur = i + 1; 
            }
        }

        // a) Cálculo Promedio Centro
        reporte.promedioCentro = arce / 12.0;

        // c) Determinación de Región con mayor lluvia
        if (arno > arce && arno > arsu) {
            reporte.regionMayorLluvia = "NORTE";
        } else if (arce > arno && arce > arsu) {
            reporte.regionMayorLluvia = "CENTRO";
        } else {
            reporte.regionMayorLluvia = "SUR";
        }
        
        return reporte;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declaración de variables (Arreglos)
        double[] rno = new double[12];
        double[] rce = new double[12];
        double[] rsu = new double[12];

        // 2. Entrada de Datos (Input)
        for (int i = 0; i < 12; i++) {
            System.out.println("--- Mes " + (i + 1) + " ---");
            System.out.print("Lluvia Región Norte: ");
            rno[i] = scanner.nextDouble();
            System.out.print("Lluvia Región Centro: ");
            rce[i] = scanner.nextDouble();
            System.out.print("Lluvia Región Sur: ");
            rsu[i] = scanner.nextDouble();
        }

        // 3. Procesamiento (Llamada a función estática)
        ReporteClima reporte = procesarDatos(rno, rce, rsu);

        // 4. Salida de Datos (Output)
        System.out.printf("\na) Promedio anual Región Centro: %.2f\n", reporte.promedioCentro);
        System.out.printf("b) Menor lluvia Región Sur fue en el mes %d (Registro: %.2f)\n", 
                          reporte.mesMenorLluviaSur, reporte.registroMenorLluviaSur);
        System.out.println("c) Región con mayor lluvia anual: " + reporte.regionMayorLluvia);
        
        scanner.close();
    }
}