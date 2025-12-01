package com.programa;

import java.util.Scanner;

public class problema_1_5 {


    public double calcularVolumen(double radio, double altura) {
        if (radio < 0 || altura < 0) return 0;
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public double calcularArea(double radio, double altura) {
        if (radio < 0 || altura < 0) return 0;
        return 2 * Math.PI * radio * altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problema_1_5 c = new problema_1_5(); // Creamos instancia

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double volumen = c.calcularVolumen(radio, altura);
        double area = c.calcularArea(radio, altura);

        System.out.println("--- Resultados ---");
        System.out.printf("Volumen: %.4f\n", volumen);
        System.out.printf("Área: %.4f\n", area);
        
        scanner.close();
    }
}