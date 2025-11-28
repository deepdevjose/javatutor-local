package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PS_4_36Test {

    private PS_4_36.Inventario inventario;

    // Esto se ejecuta ANTES de CADA test
    @BeforeEach
    void setUp() {
        // Creamos un inventario con capacidad 5 para las pruebas
        inventario = new PS_4_36.Inventario(5);
        
        // Cargamos 3 productos iniciales
        inventario.clavesProductos[0] = 101; // Pan
        inventario.cantidadesProductos[0] = 20;
        
        inventario.clavesProductos[1] = 102; // Leche
        inventario.cantidadesProductos[1] = 15;

        inventario.clavesProductos[2] = 103; // Huevos
        inventario.cantidadesProductos[2] = 30;
        
        inventario.numProductos = 3;
    }

    // --- Pruebas para buscarProducto ---
    
    @Test
    void testBuscarProducto_Encontrado() {
        assertEquals(1, PS_4_36.buscarProducto(inventario, 102), "Debe encontrar la clave 102 en el índice 1");
    }

    @Test
    void testBuscarProducto_NoEncontrado() {
        assertEquals(-1, PS_4_36.buscarProducto(inventario, 999), "No debe encontrar la clave 999");
    }

    // --- Pruebas para procesarVenta ---

    @Test
    void testVenta_Exitosa() {
        String resultado = PS_4_36.procesarVenta(inventario, 101, 5); // Vende 5 panes (había 20)
        
        assertNull(resultado, "Una venta exitosa debe devolver null");
        assertEquals(15, inventario.cantidadesProductos[0], "Deben quedar 15 panes");
    }

    @Test
    void testVenta_StockInsuficiente() {
        String resultado = PS_4_36.procesarVenta(inventario, 102, 50); // Intenta vender 50 leches (había 15)
        
        assertNotNull(resultado, "Debe devolver un mensaje de error");
        assertEquals("No hay suficiente cantidad del producto.", resultado);
        assertEquals(15, inventario.cantidadesProductos[1], "La cantidad de leche no debe cambiar");
    }
    
    @Test
    void testVenta_ProductoNoExiste() {
        String resultado = PS_4_36.procesarVenta(inventario, 999, 1); // Intenta vender producto 999
        
        assertNotNull(resultado, "Debe devolver un mensaje de error");
        assertEquals("El producto no existe.", resultado);
    }

    // --- Pruebas para procesarCompra ---
    
    @Test
    void testCompra_ProductoExistente() {
        String resultado = PS_4_36.procesarCompra(inventario, 103, 10); // Compra 10 huevos (había 30)
        
        assertNull(resultado, "Una compra exitosa debe devolver null");
        assertEquals(40, inventario.cantidadesProductos[2], "Deben quedar 40 huevos");
        assertEquals(3, inventario.numProductos, "El número de productos no debe cambiar");
    }
    
    @Test
    void testCompra_ProductoNuevo() {
        String resultado = PS_4_36.procesarCompra(inventario, 201, 25); // Compra 25 de un producto nuevo
        
        assertNull(resultado, "Una compra de producto nuevo debe ser exitosa");
        assertEquals(4, inventario.numProductos, "El número de productos debe aumentar a 4");
        assertEquals(201, inventario.clavesProductos[3], "La clave del nuevo producto debe estar en el índice 3");
        assertEquals(25, inventario.cantidadesProductos[3], "La cantidad del nuevo producto debe ser 25");
    }
    
    @Test
    void testCompra_ProductoNuevo_InventarioLleno() {
        // Llenamos el inventario (capacidad 5)
        inventario.numProductos = 5;
        inventario.clavesProductos[3] = 201;
        inventario.clavesProductos[4] = 202;
        
        // Intentamos agregar un 6to producto
        String resultado = PS_4_36.procesarCompra(inventario, 301, 10);
        
        assertNotNull(resultado, "Debe devolver un mensaje de error");
        assertEquals("No se pueden agregar más productos. Capacidad máxima alcanzada.", resultado);
        assertEquals(5, inventario.numProductos, "El número de productos no debe cambiar");
    }
}