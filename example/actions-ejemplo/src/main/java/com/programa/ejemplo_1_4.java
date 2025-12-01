package com.programa;
public class ejemplo_1_4 {

    public static boolean evaluarCasoA() {
        return !(15 >= Math.pow(7, 2)) || (43 - (8 * 2 / 4) != (3 * 2 / 2));
    }
    
    public static boolean evaluarCasoB() {
        boolean parteB1 = (15 >= (7 * Math.pow(3, 2))) && (8 > 3) && (15 > 6);
        boolean parteB2 = !( (7 * 3) < (5 + (12 * 2 / (int)Math.pow(3, 2))) );
        
        return parteB1 || parteB2;
    }

    public static void main(String[] args) {
    
        // Llamada directa a la función A
        boolean resultadoA = evaluarCasoA();
        System.out.println("Caso a) Resultado: " + resultadoA);

        // Llamada directa a la función B
        boolean resultadoB = evaluarCasoB();
        System.out.println("Caso b) Resultado: " + resultadoB);

        System.out.println("Caso c) Produce un error de tipos, como se indica en el libro.");
    }
}