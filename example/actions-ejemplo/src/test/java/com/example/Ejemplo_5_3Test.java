package com.example; // Asegúrate de que sea el mismo paquete que tu clase

// Importaciones de JUnit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Esta es la clase de prueba para Ejemplo_5_3.
 *
 * NOTA IMPORTANTE:
 * No podemos probar el método 'main' directamente porque usa un 'Scanner'
 * y espera datos de un usuario real.
 *
 * Lo que SÍ podemos probar es la otra clase que creaste: 'Domicilio'.
 * Probaremos que su constructor funcione como esperamos.
 */
class Ejemplo_5_3Test {


    /**
     * La anotación @Test le dice a JUnit que esto es una prueba.
     */
    @Test
    void testConstructorDeDomicilio() {
        // 1. PREPARAR (Arrange)
        // Definimos los datos de prueba que usaremos
        String callePrueba = "Av. Insurgentes Sur";
        int numeroPrueba = 1024;
        String ciudadPrueba = "Ciudad de México";
        String paisPrueba = "México";

        // 2. ACTUAR (Act)
        // Llamamos al constructor de la clase Domicilio para crear un objeto
        // La clase Domicilio debe estar visible para esta prueba
        // (es decir, en el mismo paquete o ser pública).
        Domicilio miDomicilio = new Domicilio(callePrueba, numeroPrueba, ciudadPrueba, paisPrueba);

        // 3. VERIFICAR (Assert)
        // Comparamos si los atributos del objeto creado
        // son iguales a los datos que le enviamos en el constructor.
        assertEquals(callePrueba, miDomicilio.calle, "La calle no se asignó correctamente.");
        assertEquals(numeroPrueba, miDomicilio.numero, "El número no se asignó correctamente.");
        assertEquals(ciudadPrueba, miDomicilio.ciudad, "La ciudad no se asignó correctamente.");
        assertEquals(paisPrueba, miDomicilio.pais, "El país no se asignó correctamente.");
    }
}