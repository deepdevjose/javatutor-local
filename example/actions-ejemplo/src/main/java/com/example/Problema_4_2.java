package com.example;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner; // Importante para mantener el orden
import java.util.Set;

public class Problema_4_2 {

    /**
     * El método main ahora se enfoca solo en la entrada y salida.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector (N <= 500):");
        int N = sc.nextInt();

        if (N < 1 || N > 500) {
            System.out.println("Tamaño fuera de rango (1 <= N <= 500).");
            sc.close(); // Cerrar scanner antes de salir
            return;
        }

        // Usar genéricos: ArrayList<Integer>
        ArrayList<Integer> VEC = new ArrayList<>();
        System.out.println("Ingrese los " + N + " elementos del vector:");
        
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            VEC.add(sc.nextInt());
        }
        sc.close(); // Cerrar el scanner

        System.out.println("Vector original: " + VEC);

        // --- Llamada al método de lógica ---
        ArrayList<Integer> vecSinRepetir = eliminarDuplicados(VEC);

        System.out.println("Vector sin repeticiones: " + vecSinRepetir);
    }

    /**
     * Esta es la función de lógica que probaremos.
     * Recibe una lista con duplicados y devuelve una lista sin duplicados,
     * manteniendo el orden de la primera aparición.
     *
     * @param vec La lista original con duplicados.
     * @return Una nueva ArrayList sin duplicados.
     */
    public static ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> vec) {
        // 1. Usar un LinkedHashSet para eliminar duplicados
        //    LinkedHashSet mantiene el orden de inserción
        //    Usamos genéricos: Set<Integer>
        Set<Integer> setSinRepetir = new LinkedHashSet<>(vec);

        // 2. Convertir el set de vuelta a una lista
        return new ArrayList<>(setSinRepetir);
    }
}