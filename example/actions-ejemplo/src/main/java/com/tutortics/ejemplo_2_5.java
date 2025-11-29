package com.tutortics;
// src/ejemplo_2.5.java

import java.util.Scanner;

public class ejemplo_2_5 {

    /**
     * Devuelve la secuencia de acciones según el valor del selector.
     * La lógica se basa en el diagrama de flujo 2.8.
     * * Nota: El pseudocódigo del "Programa 2.8" en la imagen menciona "Valor 5: Hacer acción 3",
     * pero el diagrama de flujo y la nota descriptiva indican que es "Valor 3".
     * Esta implementación sigue el diagrama y la nota, que son más consistentes.
     *
     * @param selector El valor entero que determina qué acción tomar.
     * @return Una cadena de texto describiendo las acciones ejecutadas.
     */
    public String ejecutarFlujo(int selector) {
        String accionPrincipal;

        switch (selector) {
            case 1:
                accionPrincipal = "Se ejecutó la ACCION 1.";
                break;
            case 2:
                accionPrincipal = "Se ejecutó la ACCION 2.";
                break;
            case 3:
                accionPrincipal = "Se ejecutó la ACCION 3.";
                break;
            default:
                accionPrincipal = "De otra forma: Se ejecutó la ACCION X.";
                break;
        }

        // Acción Y siempre se ejecuta al final
        String accionFinal = "Luego, se ejecutó la ACCION Y.";
        
        return accionPrincipal + " " + accionFinal;
    }

    /**
     * Método principal para la interacción con el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ejemplo_2_5 selectorAccion = new ejemplo_2_5();

        System.out.println("Introduce un valor para el SELECTOR (1, 2, 3, u otro):");
        int valorSelector = scanner.nextInt();

        String resultado = selectorAccion.ejecutarFlujo(valorSelector);

        System.out.println("---------------------------------");
        System.out.println(resultado);
        System.out.println("---------------------------------");
        
        scanner.close();
    }
}
