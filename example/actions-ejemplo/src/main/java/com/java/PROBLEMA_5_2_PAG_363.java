import java.util.Scanner;

// --- CLASE PRINCIPAL ---
public class PROBLEMA_5_2_PAG_363 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1. Leer y Validar N ---
        System.out.print("Ingrese número de empleados (1-100): ");
        int N = scanner.nextInt();

        // Si N es inválido, termina. Si es válido, ejecuta el programa.
        if (N < 1 || N > 100) {
            System.out.println("Error en los datos. El número debe estar entre 1 y 100.");
        } else {
            
            // --- 2. Crear el Arreglo de Registros (Objetos) ---
            // Creamos un arreglo de tipo "Empleado" de tamaño N
            Empleado[] empleados = new Empleado[N];

            // --- 3. Llenado de Datos ---
            for (int i = 0; i < N; i++) {
                // Importante: ¡Debemos crear el objeto (registro) en cada posición!
                empleados[i] = new Empleado();

                System.out.println("\n--- Datos del Empleado " + (i + 1) + " ---");
                System.out.print("Número: ");
                empleados[i].numero = scanner.nextInt();
                
                scanner.nextLine(); // Consumir el 'enter' pendiente
                
                System.out.print("Nombre: ");
                empleados[i].nombre = scanner.nextLine();
                
                System.out.print("Salario: ");
                empleados[i].salario = scanner.nextDouble();

                // Llenado del arreglo anidado (ventas)
                System.out.println("Ingrese las 12 ventas del empleado:");
                for (int j = 0; j < 12; j++) {
                    System.out.print("Mes " + (j + 1) + ": ");
                    empleados[i].ventas[j] = scanner.nextDouble();
                }
            }

            // --- 4. Menú de Opciones ---
            int opcion;
            do {
                System.out.println("\n--- MENÚ DE OPCIONES ---");
                System.out.println("(1) Empleado con mayor venta");
                System.out.println("(2) Incrementar salario por ventas altas");
                System.out.println("(3) Empleados con ventas bajas en Diciembre");
                System.out.println("(4) Terminar");
                System.out.print("Elija una opción: ");
                opcion = scanner.nextInt();

                // switch para manejar las opciones del menú
                switch (opcion) {
                    case 1:
                        // --- Módulo (a) VENTAMAX ---
                        encontrarVentaMaxima(empleados);
                        break;
                    case 2:
                        // --- Módulo (b) INCREMENTO ---
                        aplicarIncremento(empleados);
                        break;
                    case 3:
                        // --- Módulo (c) VENTASMIN ---
                        mostrarVentasMinimasDiciembre(empleados);
                        break;
                    case 4:
                        System.out.println("Terminando programa...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } while (opcion != 4); // El bucle se repite hasta que el usuario elija 4
        }
        
        scanner.close(); // Cerramos el scanner al final
    }

    // --- Módulo (a) ---
    // Encuentra y muestra el empleado con la mayor suma de ventas anuales
    public static void encontrarVentaMaxima(Empleado[] empleados) {
        double maxVentas = -1.0; // Se inicia en -1 para que cualquier venta sea mayor
        int indiceMax = -1; // Guarda el índice del empleado con la venta máxima

        for (int i = 0; i < empleados.length; i++) {
            double sumaAnual = 0;
            // Bucle anidado para sumar las 12 ventas del empleado 'i'
            for (int j = 0; j < 12; j++) {
                sumaAnual += empleados[i].ventas[j];
            }

            // Comparamos si la suma de este empleado es la nueva máxima
            if (maxVentas < sumaAnual) {
                maxVentas = sumaAnual;
                indiceMax = i; // Guardamos el *índice* del empleado
            }
        }

        // Imprimimos el resultado usando el índice guardado
        if (indiceMax != -1) {
            System.out.println("\n--- Empleado con Mayores Ventas ---");
            System.out.println("El empleado con mayores ventas durante el año es:");
            System.out.println("Nombre: " + empleados[indiceMax].nombre);
            System.out.println("Número de empleado: " + empleados[indiceMax].numero);
            System.out.printf("Con un total de ventas de: $%.2f\n", maxVentas);
        }
    }

    // --- Módulo (b) ---
    // Aplica un 10% de aumento a quienes vendieron > 1,000,000
    public static void aplicarIncremento(Empleado[] empleados) {
        System.out.println("\n--- Aplicando Incrementos de Salario ---");
        boolean seAplicoAlguno = false; // Bandera para saber si alguien calificó
        
        for (int i = 0; i < empleados.length; i++) {
            double sumaAnual = 0;
            // Sumamos las 12 ventas
            for (int j = 0; j < 12; j++) {
                sumaAnual += empleados[i].ventas[j];
            }

            // Si la suma es mayor a 1,000,000
            if (sumaAnual > 1000000) {
                seAplicoAlguno = true;
                double salarioAnterior = empleados[i].salario;
                empleados[i].salario *= 1.10; // Aumento del 10%
                
                System.out.println("Salario incrementado para " + empleados[i].nombre);
                System.out.printf("  Salario anterior: $%.2f, Nuevo Salario: $%.2f\n", salarioAnterior, empleados[i].salario);
            }
        }
        
        if (!seAplicoAlguno) {
            System.out.println("Ningún empleado calificó para el incremento.");
        }
    }

    // --- Módulo (c) ---
    // Muestra empleados con ventas < 30,000 en Diciembre
    public static void mostrarVentasMinimasDiciembre(Empleado[] empleados) {
        System.out.println("\n--- Empleados con Ventas < $30,000 en Diciembre ---");
        boolean seEncontroAlguno = false; // Bandera para saber si encontramos a alguien
        
        // Diciembre es el mes 12, que en Java (base 0) es el índice 11
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].ventas[11] < 30000) {
                System.out.println("Número: " + empleados[i].numero + ", Nombre: " + empleados[i].nombre);
                seEncontroAlguno = true;
            }
        }

        if (!seEncontroAlguno) {
            System.out.println("Ningún empleado tuvo ventas tan bajas en Diciembre.");
        }
    }
}

// --- CLASE DE REGISTRO ---
// Esta clase representa la estructura del "Registro" EMPLEADO.
class Empleado {
    int numero;
    String nombre;
    double salario;
    double[] ventas; // Arreglo para 12 meses

    // Constructor: se ejecuta al crear un nuevo Empleado (new Empleado())
    public Empleado() {
        this.ventas = new double[12]; 
    }
}

