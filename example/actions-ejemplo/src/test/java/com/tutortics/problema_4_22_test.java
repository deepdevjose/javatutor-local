package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class problema_4_22_test {

    @Test
    void testObtenerMayorExistencia() {
        int[] pro = {101, 102, 103};
        int[] can = {5, 20, 10};
        
        int posMayor = problema_4_22.obtenerMayorExistencia(pro, can, 3);
        // La posición del mayor es 1 (clave 102 con 20 cajas)
        assertEquals(1, posMayor);
        assertEquals(102, pro[posMayor]);
        assertEquals(20, can[posMayor]);
    }

    @Test
    void testEliminarConExistenciaCero() {
        int[] pro = {1, 2, 3, 4};
        int[] can = {5, 0, 3, 0};
        
        int nuevoN = problema_4_22.eliminarConExistenciaCero(pro, can, 4);
        
        // Quedan dos productos
        assertEquals(2, nuevoN);
        
        // Las claves deben ser las que no tenían existencia 0: 1 y 3
        assertEquals(1, pro[0]);
        assertEquals(5, can[0]);
        assertEquals(3, pro[1]);
        assertEquals(3, can[1]);
    }

    @Test
    void testEliminarTodosConCero() {
        int[] pro = {10, 20, 30};
        int[] can = {0, 0, 0};
        
        int nuevoN = problema_4_22.eliminarConExistenciaCero(pro, can, 3);
        
        // No debe quedar ningún producto
        assertEquals(0, nuevoN);
    }

    @Test
    void testSinProductosConCero() {
        int[] pro = {100, 200, 300};
        int[] can = {10, 20, 30};
        
        int nuevoN = problema_4_22.eliminarConExistenciaCero(pro, can, 3);
        
        // Deben quedar todos
        assertEquals(3, nuevoN);
        assertEquals(100, pro[0]);
        assertEquals(200, pro[1]);
        assertEquals(300, pro[2]);
    }
}
