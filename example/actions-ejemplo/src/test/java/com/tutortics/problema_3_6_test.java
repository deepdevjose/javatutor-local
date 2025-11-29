package com.tutortics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class problema_3_6_test {

    @Test
    void testEncontrarMayorMenorNormal() {
        problema_3_6 sut = new problema_3_6();
        int[] nums = {5, 1, 9, -2, 7};
        int[] res = sut.encontrarMayorMenor(nums);
        assertNotNull(res);
        assertEquals(9, res[0]);
        assertEquals(-2, res[1]);
    }

    @Test
    void testEncontrarMayorMenorNullOEmpty() {
        problema_3_6 sut = new problema_3_6();
        assertNull(sut.encontrarMayorMenor(new int[]{}));
        assertNull(sut.encontrarMayorMenor(null));
    }
}
