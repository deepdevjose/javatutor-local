package com.asatutor;
import java.util.Scanner;

/**
 * El programa, dado como dato un número entero positivo,
 * calcula el cuadrado y el cubo de dicho número.
 * Esta es una versión simplificada para principiantes.
 */
public class P14_1_ej_1_14 {

    public static void main(String[] args) {
        // 1. Declarar las variables que vamos a necesitar.
        int num;      // Para guardar el número que introduce el usuario.
        double cua;   // Para guardar el resultado del cuadrado.
        double cub;   // Para guardar el resultado del cubo.

        // 2. Crear una herramienta (Scanner) para leer lo que el usuario escribe.
        Scanner teclado = new Scanner(System.in);

        // 3. Pedir al usuario que introduzca un número.
        System.out.print("Introduce un número entero: ");
        num = teclado.nextInt(); // Leer y guardar el número.

        // 4. Calcular el cuadrado y el cubo.
        // El cuadrado es el número multiplicado por sí mismo.
        cua = num * num;
        // El cubo es el número multiplicado por sí mismo dos veces.
        cub = num * num * num;

        // 5. Mostrar los resultados en la pantalla.
        System.out.println("El cuadrado de " + num + " es: " + cua);
        System.out.println("El cubo de " + num + " es: " + cub);

        // 6. Cerrar la herramienta de lectura para liberar recursos.
        teclado.close();
    }
}