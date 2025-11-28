import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CalificacionesGrupoTest {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void testPromediosExamenes() {
        // Preparar datos de entrada: todos los alumnos tienen 70 en todos los exámenes
        // excepto en el examen 3 donde tienen 90
        StringBuilder input = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 6; j++) {
                input.append(j == 2 ? "90\n" : "70\n"); // Examen 3 (índice 2) tiene 90
            }
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        CalificacionesGrupo.main(new String[]{});
        String output = outputContent.toString();

        // Verificar promedios de exámenes
        assertTrue("El promedio del Examen 1 debe ser 70.00",
                  output.contains("Promedio Examen 1: 70.00"));
        assertTrue("El promedio del Examen 3 debe ser 90.00",
                  output.contains("Promedio Examen 3: 90.00"));
        assertTrue("El Examen 3 debe ser el de mayor promedio",
                  output.contains("El Examen 3 tuvo el mayor promedio: 90.00"));
    }

    @Test
    public void testPromediosAlumnos() {
        // Preparar datos: el alumno 1 tiene todas sus calificaciones en 100,
        // los demás en 80
        StringBuilder input = new StringBuilder();
        
        // Primer alumno: todas en 100
        for (int j = 0; j < 6; j++) {
            input.append("100\n");
        }
        
        // Resto de alumnos: todas en 80
        for (int i = 1; i < 30; i++) {
            for (int j = 0; j < 6; j++) {
                input.append("80\n");
            }
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        CalificacionesGrupo.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("El promedio del Alumno 1 debe ser 100.00",
                  output.contains("Promedio Alumno 1: 100.00"));
        assertTrue("El promedio del Alumno 2 debe ser 80.00",
                  output.contains("Promedio Alumno 2: 80.00"));
    }

    @Test
    public void testFormatoPresentacion() {
        // Datos simples para verificar el formato
        StringBuilder input = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 6; j++) {
                input.append("85\n");
            }
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        CalificacionesGrupo.main(new String[]{});
        String output = outputContent.toString();

        assertTrue("Debe mostrar el título de ingreso de calificaciones",
                  output.contains("Ingreso de 180 Calificaciones"));
        assertTrue("Debe mostrar la sección de promedios por examen",
                  output.contains("Promedio de calificaciones por examen"));
        assertTrue("Debe mostrar la sección de promedios por alumno",
                  output.contains("Promedio de calificaciones por alumno"));
        assertTrue("Debe mostrar la sección del mejor examen",
                  output.contains("Examen con el mayor promedio"));
    }
}