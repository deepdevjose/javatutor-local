import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EJEMPLO_1_5_PAG_23Test {

    @Test
    public void testEJEMPLO_1_5_PAG_23() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Execute main method
        EJEMPLO_1_5_PAG_23.main(new String[] {});

        // Restore original System.out
        System.setOut(originalOut);

        // Get the output as string
        String output = outContent.toString();

        // Verify specific values in the output
        assertTrue("Should show initial value of I", output.contains("I = 0"));
        assertTrue("Should show I after increment", output.contains("I = 1"));
        assertTrue("Should show initial ACUM", output.contains("ACUM = 0"));
        assertTrue("Should show J calculation", output.contains("J = 8"));
        assertTrue("Should show CAR value", output.contains("CAR = a"));
        assertTrue("Should show ACUM after J div I", output.contains("ACUM = 8"));
        assertTrue("Should show REA calculation", output.contains("REA = 2.666"));
        assertTrue("Should show BAND calculation", output.contains("BAND = false"));
        assertTrue("Should show SUM calculation", output.contains("SUM = 0.625"));
        assertTrue("Should show I multiplication", output.contains("I = 3"));
        assertTrue("Should show final REA value", output.contains("REA = 0.533"));
        assertTrue("Should show final BAND value", output.contains("BAND = false"));
        assertTrue("Should show type error messages", output.contains("Error: Incompatibilidad de tipos"));
    }
}

