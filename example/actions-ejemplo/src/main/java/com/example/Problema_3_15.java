package com.example;

// Esta clase contiene la lógica (ya no usa Scanner ni main)
public class Problema_3_15 {
    
    private int cl = 0;
    private double cuenta = 0;

    // El test llama a este método
    public void procesarLlamada(String tipo, int dur) {
        
        if (tipo.equals("H") && dur > 3) {
            double costo = 7.59 + ((dur - 3) * 3.03);
            cuenta += costo;
        } else {
            double costo = 7.59;
            cuenta += costo;
        }
        
        if (tipo.equals("L")) {
            cl++;
            if (cl > 50) {
                cuenta += 0.60;
            }
        }
        
        if (dur > 3) {
            double costo = 1.20 + ((dur - 3) * 0.48);
            cuenta += costo;
        } else {
            double costo = 1.20;
            cuenta += costo;
        }
    }

    // El test usa esto para verificar el resultado
    public double getCuenta() {
        return cuenta;
    }

    // El test usa esto para verificar el contador
    public int getCL() {
        return cl;
    }
}