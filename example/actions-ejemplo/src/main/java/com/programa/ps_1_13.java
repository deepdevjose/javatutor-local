package com.programa;

import java.util.Scanner;

public class ps_1_13 {

    public double calcularAreaBase(double per, double apo) {
        return (per * apo) / 2.0;
    }

    public double calcularAreaLateral(double per, double alt) {
        return per * alt;
    }

    public double calcularAreaTotal(double areaBase, double areaLateral) {
        return (2 * areaBase) + areaLateral;
    }

    public double calcularVolumen(double areaBase, double alt) {
        return areaBase * alt;
    }
    
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ps_1_13 p = new ps_1_13();

        System.out.print("Ingrese el perímetro de la base (PER): ");
        double per = scanner.nextDouble();
        System.out.print("Ingrese el apotema (APO): ");
        double apo = scanner.nextDouble();
        System.out.print("Ingrese la altura (ALT): ");
        double alt = scanner.nextDouble();

        double areaBase = p.calcularAreaBase(per, apo);
        double areaLateral = p.calcularAreaLateral(per, alt);
        double areaTotal = p.calcularAreaTotal(areaBase, areaLateral);
        double volumen = p.calcularVolumen(areaBase, alt);

        System.out.println("\n--- Resultados del Prisma ---");
        System.out.printf("Área de la Base: %.2f\n", areaBase);
        System.out.printf("Área Lateral: %.2f\n", areaLateral);
        System.out.printf("Área Total: %.2f\n", areaTotal);
        System.out.printf("Volumen: %.2f\n", volumen);
        
        scanner.close();
    }
}