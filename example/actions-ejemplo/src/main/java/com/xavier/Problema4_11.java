package com.xavier;

/**
 * Problema 4.11
 *
 * Instrucciones:
 * -------------------------------------------------------------
 * Los alumnos deben mezclar tres arreglos de cadenas (sur, centro, norte)
 * en un solo arreglo llamado "america", ordenado alfabéticamente.
 *
 * El método que deben completar es:
 *     mezclarArreglos(String[] sur, String[] centro, String[] norte)
 *
 * El test verificará:
 *  - Que el arreglo resultante esté correctamente ordenado
 *  - Que contenga todos los elementos de los 3 arreglos
 *
 * No se debe imprimir nada. Solo regresar el arreglo mezclado.
 */
public class Problema4_11 {

    /**
     * Mezcla alfabéticamente los arreglos sur, centro y norte.
     *
     * TODO: Implementar la lógica de mezcla ordenada.
     * Pueden usar compareToIgnoreCase para comparar cadenas.
     */
    public static String[] mezclarArreglos(String[] sur, String[] centro, String[] norte) {

        // TODO 1: obtener tamaños
        int tps = sur.length;
        int tpc = centro.length;
        int tpn = norte.length;

        // TODO 2: crear arreglo "america" con espacio total
        String[] america = new String[tps + tpc + tpn];

        // TODO 3: usar índices para mezclar
        int ps = 0, pc = 0, pn = 0, pa = 0;

        // TODO 4: mezclar mientras los tres tengan elementos

        // TODO 5: mezclar cuando solo quedan dos arreglos

        // TODO 6: copiar los elementos que sobren

        return america;
    }
}
