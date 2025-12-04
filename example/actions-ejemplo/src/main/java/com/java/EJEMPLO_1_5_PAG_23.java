public class EJEMPLO_1_5_PAG_23 {

    public static void main(String[] args) {
        
        // --- Declaración de variables ---
        // entero: I, ACUM, J
        int I, ACUM, J;
        
        // real: REA, SUM
        double REA, SUM;
        
        // caracter: CAR
        char CAR;
        
        // booleano: BAND
        boolean BAND;

        System.out.println("--- Inicio de la Traza de Memoria ---");
        System.out.println("Paso | Asignación \t\t\t| Resultado");
        System.out.println("-------------------------------------------------------------------");

        // 1. I <-- 0
        I = 0;
        System.out.println("1    | I <-- 0 \t\t\t| I = " + I);

        // 2. I <-- I + 1
        I = I + 1; // o I++;
        System.out.println("2    | I <-- I + 1 \t\t\t| I = " + I);

        // 3. ACUM <-- 0
        ACUM = 0;
        System.out.println("3    | ACUM <-- 0 \t\t\t| ACUM = " + ACUM);

        // 4. J <-- 5 ** 2 div 3
        // (5**2) es 25. 
        // 'div' es división entera. 25 / 3 (entero) = 8
        J = (int)Math.pow(5, 2) / 3;
        System.out.println("4    | J <-- 5**2 div 3 \t\t| J = " + J);

        // 5. CAR <-- 'a'
        CAR = 'a';
        System.out.println("5    | CAR <-- 'a' \t\t\t| CAR = " + CAR);

        // 6. ACUM <-- J div I
        // J=8, I=1. 8 / 1 (entero) = 8
        ACUM = J / I;
        System.out.println("6    | ACUM <-- J div I \t\t| ACUM = " + ACUM);

        // 7. REA <-- ACUM / 3
        // ACUM=8. Es división real. 8 / 3.0 = 2.666...
        REA = (double)ACUM / 3;
        System.out.println("7    | REA <-- ACUM / 3 \t\t| REA = " + REA);

        // 8. BAND <-- (8 > 5) y (15 < 2 ** 3)
        // 'y' es '&&' (AND)
        // (2**3) es 8.
        // (VERDADERO) y (15 < 8)
        // (VERDADERO) && (FALSO) = FALSO
        BAND = (8 > 5) && (15 < Math.pow(2, 3));
        System.out.println("8    | BAND <-- (8>5) y (15<2**3) \t| BAND = " + BAND);

        // 9. SUM <-- ACUM * 5 / J ** 2
        // ACUM=8, J=8.
        // (8 * 5) / (8**2) = 40 / 64 = 0.625
        SUM = (ACUM * 5) / Math.pow(J, 2);
        System.out.println("9    | SUM <-- ACUM*5 / J**2 \t| SUM = " + SUM);

        // 10. I <-- I * 3
        // I=1. 1 * 3 = 3
        I = I * 3;
        System.out.println("10   | I <-- I * 3 \t\t\t| I = " + I);

        // 11. REA <-- REA / 5
        // REA=2.666... / 5 = 0.5333...
        REA = REA / 5;
        System.out.println("11   | REA <-- REA / 5 \t\t| REA = " + REA);

        // 12. BAND <-- BAND o (I = J)
        // 'o' es '||' (OR). En pseudocódigo '=' es comparación '=='
        // BAND=FALSO. I=3. J=8.
        // (FALSO) o (3 == 8)
        // (FALSO) || (FALSO) = FALSO
        BAND = BAND || (I == J);
        System.out.println("12   | BAND <-- BAND o (I = J) \t| BAND = " + BAND);

        // 13. I <-- REA
        // I es int, REA es double. Esto es un error de tipos.
        // I = REA; // Esta línea no compila.
        System.out.println("13   | I <-- REA \t\t\t| Error: Incompatibilidad de tipos");

        // 14. CAR <-- J
        // CAR es char, J es int. Esto es un error de tipos.
        // CAR = J; // Esta línea no compila.
        System.out.println("14   | CAR <-- J \t\t\t| Error: Incompatibilidad de tipos");

        System.out.println("-------------------------------------------------------------------");
        System.out.println("--- Fin de la Traza ---");
    }
}