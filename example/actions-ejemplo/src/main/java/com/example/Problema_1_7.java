
package com.example;
import java.util.Locale;
import java.util.Scanner;

public class Problema_1_7 {

    /**
     * Este es tu main original, ¡no lo tocamos!
     * Sigue funcionando para que lo pruebes a mano.
     */
    public static void main(String[] args) {
        // Usar Locale.US para asegurar que el Scanner lea decimales con '.'
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("--- Calculadora de Área de Triángulo (Fórmula de Herón) ---");
        
        System.out.print("Ingrese la longitud del Lado 1 (L1): ");
        double L1 = sc.nextDouble();
        
        System.out.print("Ingrese la longitud del Lado 2 (L2): ");
        double L2 = sc.nextDouble();
        
        System.out.print("Ingrese la longitud del Lado 3 (L3): ");
        double L3 = sc.nextDouble();
        
        sc.close(); // ¡Cerramos el scanner, beba!

        // 1. Calcular el semiperímetro (S)
        double S = (L1 + L2 + L3) / 2.0;

        // 2. Calcular el Área
        // (Validación opcional: asegurarse de que el radicando no sea negativo)
        double radicando = S * (S - L1) * (S - L2) * (S - L3);
        
        if (radicando < 0) {
            System.out.println("\nError: Los lados ingresados no forman un triángulo válido.");
        } else {
            double AREA = Math.sqrt(radicando);

            System.out.println("\n--- Resultados ---");
            System.out.printf("Lados: L1=%.2f, L2=%.2f, L3=%.2f%n", L1, L2, L3);
            System.out.printf("Semiperímetro (S): %.4f%n", S);
            System.out.printf("Área del triángulo: %.4f%n", AREA);
        }
    }

    
    public static double calcularAreaHeron(double L1, double L2, double L3) {
        double S = (L1 + L2 + L3) / 2.0;
        double radicando = S * (S - L1) * (S - L2) * (S - L3);
        
        if (radicando < 0) {
            return -1.0; // Usamos -1.0 como señal de error (triángulo inválido)
        } else {
            return Math.sqrt(radicando); // Regresamos el área
        }
    }
}