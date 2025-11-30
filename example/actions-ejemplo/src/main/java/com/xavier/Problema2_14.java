package com.xavier;

/**
 * Problema 2.14
 * 
 * Instrucciones para el alumno:
 * -------------------------------------------------------------
 * Se tiene un hospital que cobra por día según el tipo de enfermedad:
 *
 * Tipo 1 → $25 por día
 * Tipo 2 → $16 por día
 * Tipo 3 → $20 por día
 * Tipo 4 → $32 por día
 *
 * Además:
 * - Si la edad del paciente está entre 14 y 22 años (inclusive),
 *   se aumenta un 10% al costo total.
 *
 * Debes completar el método calcularCostoTotal(), aplicando:
 * - Costo = días * costoPorTipo
 * - Si la edad está en [14, 22], aplicar incremento del 10%.
 *
 * El método main() es solo demostrativo.
 */
public class Problema2_14 {

    /**
     * Calcula el costo total del hospital según:
     * - tipoEnf: tipo de enfermedad (1 a 4)
     * - edad: edad del paciente
     * - dias: días hospitalizado
     */
    public static double calcularCostoTotal(int tipoEnf, int edad, int dias) {

        // TODO: asignar costo por día según tipo de enfermedad
        double costoDia = 0;

        // TODO: calcular costo base
        double costoTotal = 0;

        // TODO: aplicar aumento del 10% si la edad está entre 14 y 22

        return costoTotal; // ← reemplazar por el valor correcto
    }

    public static void main(String[] args) {
        // Ejemplo opcional
        int tipo = 3, edad = 18, dias = 5;
        System.out.println("Costo total: " + calcularCostoTotal(tipo, edad, dias));
    }
}
