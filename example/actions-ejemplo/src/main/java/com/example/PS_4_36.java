package com.example;

import java.util.Scanner;

/**
 *
 * @author Arantza
 */
public class PS_4_36 {

    // 1. Clase interna estática para guardar el estado del inventario
    public static class Inventario {
        public final int MAX_PRODUCTOS;
        public int[] clavesProductos;
        public int[] cantidadesProductos;
        public int numProductos;

        public Inventario(int max) {
            this.MAX_PRODUCTOS = max;
            this.clavesProductos = new int[max];
            this.cantidadesProductos = new int[max];
            this.numProductos = 0;
        }
    }

    // 2. El método main (ahora solo maneja I/O)
    public static void main(String[] args) {
        Inventario inv = new Inventario(100); // MAX_PRODUCTOS = 100
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Leer el número actual de productos en existencia
        System.out.print("Ingrese el número actual de productos en existencia: ");
        inv.numProductos = scanner.nextInt();

        // Paso 2: Leer los arreglos
        System.out.println("Ingrese las claves de los productos:");
        for (int i = 0; i < inv.numProductos; i++) {
            inv.clavesProductos[i] = scanner.nextInt();
        }

        System.out.println("Ingrese las cantidades de los productos:");
        for (int i = 0; i < inv.numProductos; i++) {
            inv.cantidadesProductos[i] = scanner.nextInt();
        }

        // Paso 3: Actualizar los arreglos según las transacciones
        boolean finDatos = false;
        while (!finDatos) {
            System.out.println("Ingrese el tipo de operación (C o V), la clave del producto y la cantidad (X, 0, 0 para terminar):");
            char tipoOperacion = scanner.next().charAt(0);
            int claveProducto = scanner.nextInt();
            int cantidad = scanner.nextInt();
            
            String resultadoOperacion = null; // Para guardar mensajes de error

            switch (tipoOperacion) {
                case 'C':
                    // Compra
                    resultadoOperacion = procesarCompra(inv, claveProducto, cantidad);
                    break;
                case 'V':
                    // Venta
                    resultadoOperacion = procesarVenta(inv, claveProducto, cantidad);
                    break;
                case 'X':
                    finDatos = true;
                    break;
                default:
                    resultadoOperacion = "Operación inválida.";
                    break;
            }
            
            // Si hubo un error (resultado NO es null), imprimirlo
            if (resultadoOperacion != null) {
                System.out.println(resultadoOperacion);
            }
        }

        // Mostrar los productos y sus cantidades actualizadas
        System.out.println("\nInventario actualizado:");
        for (int i = 0; i < inv.numProductos; i++) {
            System.out.println("Producto " + inv.clavesProductos[i] + ": " + inv.cantidadesProductos[i] + " unidades");
        }

        scanner.close();
    }

    // --- 3. Métodos de Lógica (¡Esto es lo que probaremos!) ---

    /**
     * Busca un producto por clave.
     * @return El índice del producto, or -1 si no se encuentra.
     */
    public static int buscarProducto(Inventario inv, int claveProducto) {
        for (int i = 0; i < inv.numProductos; i++) {
            if (inv.clavesProductos[i] == claveProducto) {
                return i; // Se encontró el producto, retorna su índice
            }
        }
        return -1; // El producto no existe
    }

    /**
     * Procesa una operación de Compra (C).
     * Modifica el inventario.
     * @return null si la operación fue exitosa, o un String con el mensaje de error.
     */
    public static String procesarCompra(Inventario inv, int claveProducto, int cantidad) {
        int indice = buscarProducto(inv, claveProducto);
        if (indice != -1) {
            // El producto existe, sumar cantidad
            inv.cantidadesProductos[indice] += cantidad;
            return null; // Éxito
        } else {
            // El producto no existe, se debe incorporar
            if (inv.numProductos < inv.MAX_PRODUCTOS) {
                inv.clavesProductos[inv.numProductos] = claveProducto;
                inv.cantidadesProductos[inv.numProductos] = cantidad;
                inv.numProductos++;
                return null; // Éxito
            } else {
                return "No se pueden agregar más productos. Capacidad máxima alcanzada."; // Error
            }
        }
    }

    /**
     * Procesa una operación de Venta (V).
     * Modifica el inventario.
     * @return null si la operación fue exitosa, o un String con el mensaje de error.
     */
    public static String procesarVenta(Inventario inv, int claveProducto, int cantidad) {
        int indice = buscarProducto(inv, claveProducto);
        if (indice != -1) {
            // El producto existe
            if (inv.cantidadesProductos[indice] >= cantidad) {
                inv.cantidadesProductos[indice] -= cantidad;
                return null; // Éxito
            } else {
                return "No hay suficiente cantidad del producto."; // Error
            }
        } else {
            return "El producto no existe."; // Error
        }
    }
}