package com.xavier;

/**
 * Ejemplo 2.10 - Estructura selectiva doble y anidada
 *
 * Instrucciones para el alumno:
 * ------------------------------------------
 * Este ejercicio consiste en implementar una
 * estructura de decisiones basada en 3 condiciones:
 *
 *  - condicion1
 *  - condicion2
 *  - condicion3
 *
 * Dependiendo del valor de cada una, se deberá
 * imprimir en pantalla:
 *      "Operación 21"
 *      "Operación 22"
 *      "Operación 31"
 *      o "Sin operación"
 *
 * Consulta el diagrama de flujo del Ejemplo 2.10
 * para guiar tu implementación.
 */
public class Ejemplo2_10 {

    /**
     * Método que evalúa 3 condiciones booleanas y devuelve
     * una cadena según el caso correspondiente.
     */
    public static String evaluarCondiciones(boolean condicion1, boolean condicion2, boolean condicion3) {

        // ===========================
        // TODO: IMPLEMENTAR LA LÓGICA
        // ---------------------------
        // Basarse en el siguiente flujo:
        //
        // Si condicion1 es verdadera:
        //     Si condicion2 también lo es → "Operación 21"
        //     De lo contrario → "Operación 22"
        //
        // Si condicion1 es falsa:
        //     Si condicion3 es verdadera → "Operación 31"
        //
        // Si ninguno de los casos anteriores se cumple →
        //     "Sin operación"
        // ===========================

        return ""; // TODO: reemplazar por el resultado correcto
    }

    public static void main(String[] args) {

        // ===========================
        // TODO: PROBAR EL MÉTODO
        // ---------------------------
        // Usa diferentes combinaciones de true/false
        // para comprobar que tu implementación funciona.
        // Ejemplos sugeridos:
        // true, false, true
        // true, true, false
        // false, false, true
        // ===========================

        System.out.println(evaluarCondiciones(true, false, true));
        System.out.println(evaluarCondiciones(true, true, false));
        System.out.println(evaluarCondiciones(false, false, true));
    }
}
