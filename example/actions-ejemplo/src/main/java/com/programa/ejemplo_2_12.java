package com.programa;

import java.util.Scanner;
public class ejemplo_2_12 {


    public String ordenar(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    return a + ", " + b + ", " + c; // A, B, C
                } else {
                    return a + ", " + c + ", " + b; // A, C, B
                }
            } else {
                return c + ", " + a + ", " + b; // C, A, B
            }
        } else { // B >= A
            if (b > c) {
                if (a > c) {
                    return b + ", " + a + ", " + c; // B, A, C
                } else {
                    return b + ", " + c + ", " + a; // B, C, A
                }
            } else {
                return c + ", " + b + ", " + a; // C, B, A
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejemplo_2_12 ordenador = new ejemplo_2_12();

        System.out.print("Ingrese el número A: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el número B: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el número C: ");
        int c = scanner.nextInt();

        String resultado = ordenador.ordenar(a, b, c);
        System.out.println("Orden descendente: " + resultado);
        
        scanner.close();
    }
}