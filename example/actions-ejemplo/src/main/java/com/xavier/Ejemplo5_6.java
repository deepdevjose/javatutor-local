package com.xavier;

/**
 * Ejemplo 5.6 - Registros anidados (Empleado - Domicilio)
 *
 * Instrucciones para el alumno:
 * --------------------------------------------------------
 * Este ejercicio muestra cómo crear:
 *   - Un registro (clase) anidado llamado Domicilio
 *   - Un registro principal Empleado que contiene un Domicilio
 *
 * El objetivo es:
 *   1. Definir adecuadamente ambas clases.
 *   2. Crear un objeto Domicilio.
 *   3. Crear un objeto Empleado que contenga el domicilio.
 *   4. Mostrar los datos en pantalla.
 *
 * NO colocar datos reales ni soluciones completas.
 * Deja TODOs para que el alumno escriba la solución.
 */
public class Ejemplo5_6 {

    // ============================
    // Clase anidada: DOMICILIO
    // ============================
    static class Domicilio {

        // TODO: agregar atributos (ejemplo: calle, número, ciudad, país)
        // String calle;
        // int numero;

        // TODO: crear constructor para inicializar el domicilio

        // TODO: sobrescribir toString() para mostrar el domicilio formateado
        @Override
        public String toString() {
            return ""; // TODO: reemplazar por salida formateada
        }
    }

    // ============================
    // Clase principal: EMPLEADO
    // ============================
    static class Empleado {

        // TODO: agregar atributos (ejemplo: numero, nombre, direccion, departamento, nivel, sueldo)

        // TODO: crear constructor para inicializar un empleado

        // TODO: sobrescribir toString() para mostrar todos los datos del empleado
        @Override
        public String toString() {
            return ""; // TODO: reemplazar por salida formateada
        }
    }

    // ============================
    // Método principal
    // ============================
    public static void main(String[] args) {

        // TODO: crear objeto Domicilio (sin datos reales)
        // Domicilio dom = new Domicilio(...);

        // TODO: crear objeto Empleado usando el domicilio creado
        // Empleado emp = new Empleado(...);

        // TODO: imprimir el empleado
        // System.out.println(emp);
    }
}
