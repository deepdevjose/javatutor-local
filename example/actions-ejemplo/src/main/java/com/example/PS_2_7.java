package com.example;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PS_2_7 {

    /**
     * Método principal que maneja la entrada y salida del usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = sc.nextDouble();
        sc.close(); // Buena práctica cerrar el scanner

        // Llama al método de lógica para obtener el resultado
        double nuevoSueldo = calcularNuevoSueldo(sueldo);

        System.out.println("El nuevo sueldo del trabajador es: $" + nuevoSueldo);
    }

    /**
     * Calcula el nuevo sueldo basado en las reglas de aumento.
     * Esta función SÍ es testeable.
     *
     * @param sueldoActual El sueldo ingresado.
     * @return El nuevo sueldo calculado.
     */
    public static double calcularNuevoSueldo(double sueldoActual) {
        if (sueldoActual < 10000) {
            return sueldoActual * 1.15; // Aumento del 15%
        } else if (sueldoActual < 15000) {
            // Esto incluye sueldos >= 10000 Y < 15000
            return sueldoActual * 1.11; // Aumento del 11%
        } else {
            // Esto incluye sueldos >= 15000
            return sueldoActual * 1.08; // Aumento del 8%
        }
    }
}