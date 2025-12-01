
package com.asatutor;

import java.util.Scanner;
// CORRECCIÓN 1: El nombre de la clase ahora es válido (empieza con una letra)
public class P14_7_ej_5_1 { 
    private String nombre;
    private String direccion;
    private int matricula;
    private String carrera;
    
    // CORRECCIÓN 2: El constructor ahora se llama igual que la clase
    public P14_7_ej_5_1(String nombre, String direccion, int matricula, String carrera) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public static void main(String[] args) {
        // 1. Herramientas y variables iniciales.
        Scanner sc = new Scanner(System.in);

        // 2. Pedir los datos del alumno al usuario.
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Introduce la carrera: ");
        String carrera = sc.nextLine();

        System.out.print("Introduce la matrícula: ");
        int matricula = sc.nextInt();

        // 3. Crear un objeto (una instancia) de la clase Alumno con los datos proporcionados.
        P14_7_ej_5_1 alumno = new P14_7_ej_5_1(nombre, direccion, matricula, carrera);
        
        // 4. Mostrar los datos del alumno usando los métodos 'get' del objeto.
        System.out.println("\n--- Datos del Alumno Registrado ---");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Matrícula: " + alumno.getMatricula());
        System.out.println("Dirección: " + alumno.getDireccion());
        System.out.println("Carrera: " + alumno.getCarrera());

        sc.close();
    }
}