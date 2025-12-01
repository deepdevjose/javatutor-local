package com.programa;

import java.util.Scanner;

public class ejemplo_3_2 {

    // Lógica separada
    public double calcularNomina(double[] sueldos) {
        double nomina = 0;
        for (double sueldo : sueldos) {
            nomina += sueldo;
        }
        return nomina;
    }

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejemplo_3_2 nr = new ejemplo_3_2();
        
        final int TOTAL_TRABAJADORES = 10;
        double[] sueldos = new double[TOTAL_TRABAJADORES];

        System.out.println("Ingrese los " + TOTAL_TRABAJADORES + " sueldos:");

        for (int i = 0; i < TOTAL_TRABAJADORES; i++) {
            System.out.print("Sueldo del trabajador " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        double nominaTotal = nr.calcularNomina(sueldos);
        System.out.printf("\nEl total de la nómina es: %.2f\n", nominaTotal);
        
        scanner.close();
    }
}