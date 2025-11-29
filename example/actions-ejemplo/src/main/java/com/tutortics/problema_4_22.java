package com.tutortics;

import java.util.Scanner;

public class problema_4_22 {

    /**
     * Encuentra la posición del producto con mayor existencia.
     * Variables según diagrama: MCA (Mayor CAntidad), MPR (Mayor PRoducto)
     * Programación Estructurada: método estático.
     */
    public static int obtenerMayorExistencia(int[] pro, int[] can, int n) {
        int mca = can[0];  // MCA ← CAN[1]
        int mpr = pro[0];  // MPR ← PRO[1]
        int posicion = 0;
        
        // I ← 2
        for (int i = 1; i < n; i++) {  // I ≤ N
            // MCA < CAN[I]?
            if (mca < can[i]) {
                mca = can[i];   // MCA ← CAN[I]
                mpr = pro[i];   // MPR ← PRO[I]
                posicion = i;
            }
            // I ← I + 1
        }
        
        return posicion;
    }

    /**
     * Imprime los productos que se deben pedir al proveedor.
     * Condición: CAN[I] ≥ 1 y CAN[I] < 50
     * Programación Estructurada: método estático.
     */
    public static void productosAPedir(int[] pro, int[] can, int n) {
        System.out.println("\n=== PRODUCTOS A PEDIR AL PROVEEDOR ===");
        boolean hayProductos = false;
        
        // I ← 1
        for (int i = 0; i < n; i++) {  // I ≤ N
            // CAN[I] ≥ 1 y CAN[I] < 50?
            if (can[i] >= 1 && can[i] < 50) {
                // PRO[I], 50 - CAN[I]
                int cantidadPedir = 50 - can[i];
                System.out.println("Clave: " + pro[i] + " - Pedir: " + cantidadPedir + " cajas");
                hayProductos = true;
            }
            // I ← I + 1
        }
        
        if (!hayProductos) {
            System.out.println("No hay productos que pedir");
        }
    }

    /**
     * Elimina productos con existencia cero según diagrama de flujo.
     * Desplaza elementos y decrementa N.
     * Programación Estructurada: método estático.
     */
    public static int eliminarConExistenciaCero(int[] pro, int[] can, int n) {
        int i = 0;  // I ← 1
        
        // I ≤ N
        while (i < n) {
            // CAN[I] = 0?
            if (can[i] == 0) {
                // J ← I
                int j = i;
                
                // J ≤ N
                while (j < n - 1) {
                    // PRO[J] ← PRO[J + 1]
                    // CAN[J] ← CAN[J + 1]
                    pro[j] = pro[j + 1];
                    can[j] = can[j + 1];
                    // J ← J + 1
                    j++;
                }
                
                // N ← N - 1
                n--;
                // No incrementar I porque debemos verificar el elemento que se desplazó
            } else {
                // I ← I + 1
                i++;
            }
        }
        
        return n;
    }

    /**
     * Método principal - Programación Estructurada.
     * Sigue exactamente el flujo de los diagramas.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // "Ingrese el número de productos"
        System.out.print("Ingrese el número de productos: ");
        int n = scanner.nextInt();

        // N ≥ 1 y N ≤ 100?
        if (n >= 1 && n <= 100) {
            int[] pro = new int[100];  // Tamaño máximo
            int[] can = new int[100];

            // I ← 1
            System.out.println("\n=== INGRESO DE PRODUCTOS ===");
            for (int i = 0; i < n; i++) {  // I ≤ N
                // "Ingrese la clave del producto y la cantidad"
                System.out.print("Producto " + (i + 1) + " - Clave: ");
                pro[i] = scanner.nextInt();  // PRO[I]
                System.out.print("Producto " + (i + 1) + " - Existencia: ");
                can[i] = scanner.nextInt();  // CAN[I]
                // I ← I + 1
            }

            // MAYOR: Producto con mayor existencia
            int posMayor = obtenerMayorExistencia(pro, can, n);
            System.out.println("\n=== PRODUCTO CON MAYOR EXISTENCIA ===");
            // "La clave del producto que tiene la mayor existencia es", MPR
            System.out.println("La clave del producto que tiene la mayor existencia es: " + pro[posMayor]);
            System.out.println("Existencia: " + can[posMayor] + " cajas");

            // PEDIDO: Productos a pedir al proveedor
            productosAPedir(pro, can, n);

            // ELIMINAR: Productos con existencia cero
            int nuevoN = eliminarConExistenciaCero(pro, can, n);
            
            System.out.println("\n=== INVENTARIO DESPUÉS DE ELIMINAR EXISTENCIA CERO ===");
            System.out.println("Productos restantes: " + nuevoN);
            if (nuevoN > 0) {
                for (int i = 0; i < nuevoN; i++) {
                    System.out.println("Clave: " + pro[i] + " - Existencia: " + can[i]);
                }
            } else {
                System.out.println("No quedan productos en el inventario");
            }

        } else {
            // "Error en el dato"
            System.out.println("Error en el dato");
        }
        
        scanner.close();
    }
}
