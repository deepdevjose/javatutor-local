package com.tutor; // O tu paquete específico

import java.util.Scanner;

public class PS_5_1 { // El nombre del archivo debe ser PS_5_1.java

    // Definición del registro Producto (No modificar)
    // Es 'static' para que 'main' pueda usarla.
    static class Producto {
        int clave;
        String descripcion;
        int existencia;
        int minExistencia;
        double precioUnitario;
    }

    /**
     * TAREA DEL ESTUDIANTE: Completa el método 'main' para resolver el ejercicio.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----- INICIA CÓDIGO DEL ESTUDIANTE -----

        // 1. Pide y lee el número de productos (N).

        // 2. Crea el arreglo de productos: Producto[] productos = new Producto[N];

        // 3. Usa un bucle 'for' para leer los datos de los N productos y guardarlos en el arreglo.
        //    ¡No olvides crear cada objeto! productos[i] = new Producto();

        // 4. Inicia un bucle infinito: while (true) { ... }

        // 5. Dentro del bucle, muestra el menú de opciones (a, b, c, d, e) y lee la opción del usuario.

        // 6. Si la opción es 'e', sal del bucle con 'break;'.

        // 7. Para las demás opciones, primero pide la clave del producto.

        // 8. Busca el producto en el arreglo. Si no lo encuentras, imprime un error y continúa el bucle.

        // 9. Usa una estructura 'if-else if' para manejar cada opción (a, b, c, d).
        //    - Para 'a' (Venta): pide cantidad, valida existencia, actualiza y muestra mensajes.
        //    - Para 'b' (Reabastecer): pide cantidad, actualiza existencia.
        //    - Para 'c' (Actualizar precio): pide porcentaje, calcula y actualiza el precio.
        //    - Para 'd' (Informar): imprime todos los datos del producto encontrado.

        // ----- TERMINA CÓDIGO DEL ESTUDIANTE -----
        sc.close();
    }
}