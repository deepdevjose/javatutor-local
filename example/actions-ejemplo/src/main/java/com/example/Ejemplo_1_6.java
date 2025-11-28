package com.example;
import java.util.Scanner;

public class Ejemplo_1_6 {

    /**
     * Este es el método principal para ejecutar el programa manualmente.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Lectura de 4 números enteros ---");
        
        System.out.print("Ingrese el valor A: ");
        int A = sc.nextInt();
        
        System.out.print("Ingrese el valor B: ");
        int B = sc.nextInt();
        
        System.out.print("Ingrese el valor C: ");
        int C = sc.nextInt();
        
        System.out.print("Ingrese el valor D: ");
        int D = sc.nextInt();
        
      
        sc.close(); 

        System.out.println("\n--- Números en orden inverso ---");
        System.out.println("Valor D: " + D);
        System.out.println("Valor C: " + C);
        System.out.println("Valor B: " + B);
        System.out.println("Valor A: " + A);
    }

   
    public static int[] obtenerValoresInversos(int A, int B, int C, int D) {
        // La lógica pura es solo regresar los valores en el orden D, C, B, A
        return new int[]{D, C, B, A};
    }
}