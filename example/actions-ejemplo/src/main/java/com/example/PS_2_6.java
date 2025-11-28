package com.example;

import java.util.Scanner;

/**
 *
 * @author imac27
 */
public class PS_2_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia del viaje de ida (en km): ");
        int distanciaIda = scanner.nextInt();
        
        System.out.print("Ingrese el tiempo de estancia (en días): ");
        int tiempoEstancia = scanner.nextInt();
        scanner.close();
        
        // Llamar a la lógica refactorizada
        double precioFinal = calcularPrecioBillete(distanciaIda, tiempoEstancia);
        
        // Imprimir el resultado (usando printf para formato de moneda)
        System.out.printf("El precio del billete de ida y vuelta es: $%.2f%n", precioFinal);
    }

    /**
     * Calcula el precio del billete de ida y vuelta, aplicando descuentos si cumplen
     * las condiciones.
     * Esta es la lógica que probaremos.
     *
     * @param distanciaIda Distancia del viaje de ida (en km).
     * @param tiempoEstancia Tiempo de estancia (en días).
     * @return El precio final del billete.
     */
    public static double calcularPrecioBillete(int distanciaIda, int tiempoEstancia) {
        int distanciaVuelta = distanciaIda;
        int distanciaTotal = distanciaIda + distanciaVuelta; // o (distanciaIda * 2)
        double precioPorKm = 0.23;
        
        double precioBillete = distanciaTotal * precioPorKm;
        
        // Lógica del descuento
        if (tiempoEstancia > 7 && distanciaTotal > 800) {
            // Aplicar descuento del 30% (es más eficiente multiplicar por 0.7)
            precioBillete = precioBillete * 0.70;
        }
        
        return precioBillete;
    }
}