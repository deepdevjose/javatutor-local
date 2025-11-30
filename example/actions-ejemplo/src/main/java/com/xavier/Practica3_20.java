package com.xavier;

import java.util.Scanner;

/**
 * Práctica 3.20 - Cálculo del costo por consumo eléctrico.
 *
 * Reglas:
 *  - Si el consumo es ≤ 140 KVH → costo fijo $35.
 *  - De 141 a 310 KVH → cada KVH adicional cuesta $0.98.
 *  - Más de 310 KVH → cada KVH extra cuesta $0.67.
 *
 * Instrucciones para el alumno:
 * --------------------------------------------------------
 * 1. Implementar el método calcularCosto() con base en las reglas anteriores.
 * 2. El método debe recibir el consumo total y retornar el costo.
 * 3. Completar el main para leer datos del usuario y mostrar recibos.
 */
public class Practica3_20 {

    /**
     * Calcula el costo total según el consumo.
     *
     * @param consumo consumo total en KVH
     * @return costo a pagar
     */
    public static double calcularCosto(double consumo) {

        // TODO: implementar los 3 casos especificados arriba.
        //       if (consumo <= 140) { ... }
        //       else if (consumo <= 310) { ... }
        //       else { ... }

        return 0; // <-- cambiar cuando el alumno lo implemente
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: inicializar variable para acumular total de cobros del periodo
        // double totalCobros = 0;

        System.out.println("Compañía de Luz del Centro");
        System.out.println("============================");

        String continuar;

        do {
            // TODO: pedir al usuario:
            //  - Nombre del cliente
            //  - Dirección
            //  - Registro inicial (KVH)
            //  - Registro final (KVH)

            // TODO: calcular el consumo: consumo = regFin - regIni

            // TODO: llamar a calcularCosto(consumo)

            // TODO: mostrar recibo formateado

            // TODO: actualizar totalCobros

            // TODO: preguntar si desea ingresar otro cliente
            continuar = "n"; // <-- modificar cuando el alumno complete interacción

        } while (continuar.equalsIgnoreCase("s"));

        // TODO: mostrar total de cobros del periodo

        sc.close();
    }
}
