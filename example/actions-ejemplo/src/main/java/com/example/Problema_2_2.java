package com.example; // Asegúrate de que esté en tu paquete

import java.util.Scanner;

/**
 * @author DELL
 */
public class Problema_2_2 {

    /**
     * Esta es la lógica de negocio, separada del Scanner.
     * Recibe P y Q, y devuelve true si la expresión se satisface,
     * o false en caso contrario.
     * ESTE ES EL MÉTODO QUE PROBAREMOS.
     */
    public boolean evaluarExpresion(int p, int q) {
        double exp = Math.pow(p, 3) + Math.pow(q, 4) - 2 * Math.pow(p, 2);

        if (exp < 680) {
            // Nota: Si exp es 0, 3.5 / 0 dará 'Infinity'.
            // 'Infinity < 680' es falso, así que se maneja correctamente.
            double result = 3.5 / exp;
            
            if (result < 680) {
                return true; // La expresión se satisface
            } else {
                return false; // No se satisface
            }
        } else {
            return false; // No se satisface
        }
    }

    /**
     * Tu método main original, ahora modificado para USAR
     * el método de lógica que creamos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos un objeto de nuestra propia clase para usar el método
        Problema_2_2 app = new Problema_2_2();
        boolean repetir = true;
        
        while (repetir) {
            System.out.println("Ingrese el valor de P:");
            int p = sc.nextInt();

            System.out.println("Ingrese el valor de Q:");
            int q = sc.nextInt();

            // Llamamos a nuestro método de lógica
            boolean satisface = app.evaluarExpresion(p, q);

            if (satisface) {
                System.out.println("La expresión se satisface.");
                System.out.println("P = " + p + ", Q = " + q);
            } else {
                System.out.println("La expresión no se satisface.");
            }
            
            System.out.println("¿Desea realizar otro cálculo? (S/N)");
            String respuesta = sc.next();
            repetir = respuesta.equalsIgnoreCase("S");
        }
    }
}