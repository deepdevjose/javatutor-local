package com.tutor; // O tu paquete específico

import java.util.Scanner;

/**
 * REFRACTORIZADO
 * Este código gestiona un inventario de productos,
 * con toda la lógica en el método main.
 */
public class PS_5_1_R { // El nombre del archivo debe ser PS_5_1R.java

    // Definición de la estructura del registro Producto
    static class Producto {
        int clave;
        String descripcion;
        int existencia;
        int minExistencia;
        double precioUnitario;
    }

    /**
     * El método main contiene toda la lógica para resolver el problema.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos a gestionar (N): ");
        int N = sc.nextInt();

        Producto[] productos = new Producto[N];

        for (int i = 0; i < N; i++) {
            productos[i] = new Producto();
            System.out.println("\nIngrese los datos del producto " + (i + 1) + ":");
            System.out.print("Clave: ");
            productos[i].clave = sc.nextInt();
            sc.nextLine();
            System.out.print("Descripción: ");
            productos[i].descripcion = sc.nextLine();
            System.out.print("Existencia: ");
            productos[i].existencia = sc.nextInt();
            System.out.print("Mínimo a mantener en existencia: ");
            productos[i].minExistencia = sc.nextInt();
            System.out.print("Precio unitario: ");
            productos[i].precioUnitario = sc.nextDouble();
        }

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("a) Venta de un producto");
            System.out.println("b) Reabastecimiento de un producto");
            System.out.println("c) Actualizar el precio de un producto");
            System.out.println("d) Informar sobre un producto");
            System.out.println("e) Salir");
            System.out.print("Opción: ");
            char opcion = sc.next().charAt(0);
            
            if (opcion == 'e') {
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.print("Ingrese la clave del producto: ");
            int clave = sc.nextInt();
            Producto productoEncontrado = null;
            for (Producto p : productos) {
                if (p.clave == clave) {
                    productoEncontrado = p;
                    break;
                }
            }

            if (productoEncontrado == null) {
                System.out.println("Producto no encontrado.");
                continue;
            }

            if (opcion == 'a') {
                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = sc.nextInt();
                if (productoEncontrado.existencia < cantidad) {
                    System.out.println("No hay suficiente existencia para realizar la venta.");
                } else {
                    productoEncontrado.existencia -= cantidad;
                    System.out.print("Venta realizada correctamente.");
                    if (productoEncontrado.existencia < productoEncontrado.minExistencia) {
                        System.out.println(" ¡Atención! La existencia del producto está por debajo del mínimo.");
                    }
                }
            } else if (opcion == 'b') {
                System.out.print("Ingrese la cantidad comprada: ");
                int cantidad = sc.nextInt();
                if (cantidad <= 0) {
                    System.out.println("La cantidad a reabastecer debe ser positiva.");
                } else {
                    productoEncontrado.existencia += cantidad;
                    System.out.println("Reabastecimiento realizado correctamente.");
                }
            } else if (opcion == 'c') {
                System.out.print("Ingrese el porcentaje de aumento: ");
                double porcentaje = sc.nextDouble();
                productoEncontrado.precioUnitario *= (1 + porcentaje / 100.0);
                System.out.println("Precio actualizado correctamente.");
            } else if (opcion == 'd') {
                System.out.println("Información del producto:");
                System.out.println("Clave: " + productoEncontrado.clave);
                System.out.println("Descripción: " + productoEncontrado.descripcion);
                System.out.println("Existencia: " + productoEncontrado.existencia);
                System.out.println("Mínimo a mantener: " + productoEncontrado.minExistencia);
                System.out.println("Precio unitario: " + productoEncontrado.precioUnitario);
            } else {
                System.out.println("Opción inválida, intente de nuevo.");
            }
        }
        sc.close();
    }
}