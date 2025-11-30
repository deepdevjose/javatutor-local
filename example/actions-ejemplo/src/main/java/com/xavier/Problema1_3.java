package com.xavier;

/**
 * Problema 1.3
 * 
 * Instrucciones para el alumno:
 * -------------------------------------------------------------
 * Este problema consiste en realizar dos conversiones:
 *
 * 1) Convertir peso de libras a kilogramos.
 *    Fórmula: kg = libras * 0.453592
 *
 * 2) Convertir longitud de pies a metros.
 *    Fórmula del libro: metros = pies * 0.3047
 *
 * Debes completar los métodos convertirPeso() y convertirLongitud()
 * para devolver los valores convertidos correctamente.
 *
 * El método mostrarDatos() solo sirve para mostrar los resultados con texto,
 * pero no es necesario modificarlo para pasar los tests.
 */
public class Problema1_3 {

    /**
     * Convierte libras a kilogramos.
     */
    public double convertirPeso(double libras) {

        // TODO: implementar la conversión libras → kilogramos (0.453592)

        return 0; // ← reemplazar por el resultado correcto
    }

    /**
     * Convierte pies a metros.
     */
    public double convertirLongitud(double pies) {

        // TODO: implementar la conversión pies → metros (0.3047)

        return 0; // ← reemplazar por el resultado correcto
    }

    /**
     * Método para mostrar datos en consola (no necesario para el test).
     */
    public void mostrarDatos(String nombre, double pesoLibras, double longitudPies) {
        double pesoKg = convertirPeso(pesoLibras);
        double longitudMetros = convertirLongitud(longitudPies);

        System.out.println("Dinosaurio: " + nombre);
        System.out.println("Peso en kilogramos: " + pesoKg);
        System.out.println("Longitud en metros: " + longitudMetros);
    }

    public static void main(String[] args) {
        // Ejemplo opcional
        Problema1_3 p = new Problema1_3();
        p.mostrarDatos("Tyrannosaurus Rex", 15000, 40);
    }
}
