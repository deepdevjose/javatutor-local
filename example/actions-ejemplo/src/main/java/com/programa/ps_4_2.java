package com.programa;

import java.util.Scanner;

public class ps_4_2 {

    // Lógica separada
    public int contarOcurrencias(int[] vec, int num) {
        if (vec == null) return 0;
        int contador = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] == num) {
                contador++;
            }
        }
        return contador;
    }

    // El main solo maneja I/O
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ps_4_2 c = new ps_4_2();

        // Llenar el arreglo
        int[] vec = new int[10]; // O 100
        System.out.println("Ingrese " + vec.length + " números:");
        for(int i=0; i < vec.length; i++) {
            vec[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int num = scanner.nextInt();
        int total = c.contarOcurrencias(vec, num);
        
        System.out.printf("El número %d se encuentra %d veces en el arreglo.\n", num, total);
        scanner.close();
    }
}