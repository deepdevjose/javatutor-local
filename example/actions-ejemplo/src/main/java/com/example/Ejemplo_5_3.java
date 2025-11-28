package com.example;

import java.util.Scanner; // <-- AÑADIDO: Importa la clase Scanner

public class Ejemplo_5_3 { // <-- La clase empieza aquí

    // El método main DEBE IR DENTRO de la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ingrese el número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese el país: ");
        String pais = scanner.nextLine();

        Domicilio domicilio = new Domicilio(calle, numero, ciudad, pais);

        System.out.println("Calle: " + domicilio.calle);
        System.out.println("Número: " + domicilio.numero);
        System.out.println("Ciudad: " + domicilio.ciudad);
        System.out.println("País: " + domicilio.pais);
        
        scanner.close(); // Buena práctica cerrar el scanner
    }
    
} // <-- La clase Ejemplo_5_3 termina aquí (la llave sobrante se eliminó)

// La clase Domicilio puede estar en el mismo archivo porque NO es 'public'
class Domicilio {

    String calle;
    int numero;
    String ciudad;
    String pais;

    public Domicilio(String calle, int numero, String ciudad, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
    }
}