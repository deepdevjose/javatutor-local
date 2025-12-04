import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PS_3_24_PAG_427Test {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void testIdentificaMejorYPeorPromedio() {
        // Preparamos datos de entrada con casos claros de mejor y peor promedio
        StringBuilder input = new StringBuilder();
        
        // Primer alumno (promedio = 90)
        input.append("12345\n");  // matrícula
        input.append("90\n90\n90\n90\n90\n");  // mejor promedio
        
        // Segundo alumno (promedio = 60)
        input.append("67890\n");  // matrícula
        input.append("60\n60\n60\n60\n60\n");  // peor promedio
        
        // Resto de alumnos con promedios intermedios (75)
        for (int i = 3; i <= 35; i++) {
            input.append(i + "0000\n");  // matrícula
            input.append("75\n75\n75\n75\n75\n");  // calificaciones
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_3_24_PAG_427.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe identificar correctamente al mejor alumno",
                  output.contains("Mejor Alumno: Matrícula 12345 con Promedio 90.00"));
        assertTrue("Debe identificar correctamente al peor alumno",
                  output.contains("Peor Alumno:  Matrícula 67890 con Promedio 60.00"));
    }

    @Test
    public void testProcesaTodosLosAlumnos() {
        // Preparamos datos de entrada para los 35 alumnos
        StringBuilder input = new StringBuilder();
        for (int i = 1; i <= 35; i++) {
            input.append(i + "\n");  // matrícula
            input.append("70\n70\n70\n70\n70\n");  // calificaciones
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_3_24_PAG_427.main(new String[]{});
        String output = outputContent.toString();

        // Verificamos que se procesan todos los alumnos
        assertTrue("Debe mostrar mensaje de procesamiento terminado",
                  output.contains("Procesamiento Terminado"));
                  
        // Contamos el número de promedios calculados
        int count = (output.split("Promedio del alumno")).length - 1;
        assertEquals("Debe calcular exactamente 35 promedios", 35, count);
    }

    @Test
    public void testFormatoPresentacion() {
        // Preparamos datos de entrada
        StringBuilder input = new StringBuilder();
        // Un alumno con promedio exacto
        input.append("12345\n");  // matrícula
        input.append("85\n85\n85\n85\n85\n");  // promedio será 85.00
        
        // Resto de alumnos
        for (int i = 2; i <= 35; i++) {
            input.append(i + "\n");
            input.append("70\n70\n70\n70\n70\n");
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_3_24_PAG_427.main(new String[]{});
        String output = outputContent.toString();

        // Verificamos el formato de presentación
        assertTrue("Debe mostrar el título del programa",
                  output.contains("Carga de Calificaciones"));
        assertTrue("Debe mostrar los resultados finales",
                  output.contains("RESULTADOS FINALES"));
        assertTrue("Debe mostrar promedios con dos decimales",
                  output.contains("85.00"));
    }
}

