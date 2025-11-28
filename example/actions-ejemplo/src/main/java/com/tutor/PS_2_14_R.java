package com.tutor; // O tu paquete específico
import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código calcula f(x) basándose en el módulo 4 de x,
 * con toda la lógica en el método main.
 */
public class PS_2_14_R { // El nombre del archivo debe ser PS_2_14R.java

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();

        double resultado;
        int mod = x % 4;

        // Usamos if-else if para que sea más claro para principiantes.
        if (mod == 0) {
            resultado = Math.pow(x, 2);
        } else if (mod == 1) {
            resultado = x / 6.0;
        } else if (mod == 2) {
            resultado = Math.sqrt(x);
        } else if (mod == 3) {
            resultado = Math.pow(x, 3) + 5;
        } else {
            // Este caso maneja módulos negativos, como -1, -2, -3.
            // Podríamos añadir una lógica más compleja, pero para un
            // principiante, asignar un valor por defecto es suficiente.
            resultado = 0; // Valor por defecto para casos inesperados.
        }

        System.out.println("El resultado de f(x) es: " + resultado);

        sc.close();
    }
}
