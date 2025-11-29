package com.tutortics;

/**
 * Problema PS 3.5 - Suma de Serie Armónica
 * 
 * Calcula la suma de la serie: 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
 * 
 * Esta es una implementación usando programación estructurada.
 * Todos los métodos son estáticos y no se crean instancias de la clase.
 */
public class problema_ps_3_5 {
    
    /**
     * Calcula la suma de la serie armónica: 1 + 1/2 + 1/3 + ... + 1/N
     * 
     * @param n Número de términos de la serie
     * @return Suma de la serie armónica parcial
     */
    public static double calcularSerie(int n) {
        double suma = 0.0;
        
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }
        
        return suma;
    }
    
    /**
     * Método principal para probar la funcionalidad
     */
    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println("=== Suma de Serie Armónica ===\n");
        
        // Caso 1: N = 4
        int n1 = 4;
        double resultado1 = calcularSerie(n1);
        System.out.printf("N = %d: Suma = %.4f%n", n1, resultado1);
        System.out.println("Cálculo: 1 + 1/2 + 1/3 + 1/4 = 1.0000 + 0.5000 + 0.3333 + 0.2500\n");
        
        // Caso 2: N = 1
        int n2 = 1;
        double resultado2 = calcularSerie(n2);
        System.out.printf("N = %d: Suma = %.4f%n", n2, resultado2);
        System.out.println("Cálculo: 1/1 = 1.0000\n");
        
        // Caso 3: N = 10
        int n3 = 10;
        double resultado3 = calcularSerie(n3);
        System.out.printf("N = %d: Suma = %.4f%n", n3, resultado3);
        System.out.println("Cálculo: 1 + 1/2 + 1/3 + ... + 1/10\n");
        
        // Caso 4: N = 100
        int n4 = 100;
        double resultado4 = calcularSerie(n4);
        System.out.printf("N = %d: Suma = %.4f%n", n4, resultado4);
        System.out.println("Nota: La serie armónica crece logarítmicamente\n");
    }
}
