import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PS_3_23_PAG_427Test {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void testCalculoPromedioUnAlumno() {
        // Simulamos entrada para un alumno con matrícula 12345
        // y calificaciones: 90, 85, 88, 92, 87
        StringBuilder input = new StringBuilder();
        input.append("12345\n");  // matrícula
        input.append("90\n85\n88\n92\n87\n");  // calificaciones
        
        // Completamos con datos dummy para los otros 34 alumnos
        for (int i = 2; i <= 35; i++) {
            input.append(i + "0000\n");  // matrícula
            input.append("70\n70\n70\n70\n70\n");  // calificaciones
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_3_23_PAG_427.main(new String[]{});
        String output = outputContent.toString();

        // El promedio de 90+85+88+92+87 = 442/5 = 88.40
        assertTrue("Debe mostrar el promedio correcto para el alumno 12345",
                  output.contains("12345") && output.contains("88.40"));
    }

    @Test
    public void testNumeroTotalAlumnos() {
        // Preparamos datos de entrada para los 35 alumnos
        StringBuilder input = new StringBuilder();
        for (int i = 1; i <= 35; i++) {
            input.append(i + "0000\n");  // matrícula
            input.append("70\n70\n70\n70\n70\n");  // calificaciones
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_3_23_PAG_427.main(new String[]{});
        String output = outputContent.toString();

        // Verificamos que se procesaron todos los alumnos
        assertTrue("Debe indicar que se procesaron 35 alumnos",
                  output.contains("Procesamiento de los 35 alumnos terminado"));
        
        // Contamos el número de promedios calculados
        int count = (output.split("El promedio del alumno")).length - 1;
        assertEquals("Debe calcular exactamente 35 promedios", 35, count);
    }

    @Test
    public void testFormatoPresentacion() {
        // Preparamos datos de entrada para un alumno
        StringBuilder input = new StringBuilder();
        input.append("12345\n");  // matrícula
        input.append("90\n85\n88\n92\n87\n");  // calificaciones
        
        // Datos dummy para los otros 34 alumnos
        for (int i = 2; i <= 35; i++) {
            input.append(i + "0000\n");
            input.append("70\n70\n70\n70\n70\n");
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        PS_3_23_PAG_427.main(new String[]{});
        String output = outputContent.toString();

        // Verificamos el formato de presentación
        assertTrue("Debe mostrar el título del programa",
                  output.contains("Carga de Calificaciones"));
        assertTrue("Debe solicitar la matrícula correctamente",
                  output.contains("Ingrese la matrícula del alumno"));
        assertTrue("Debe mostrar el resultado con dos decimales",
                  output.contains(".40")); // Para el promedio 88.40
    }
}

