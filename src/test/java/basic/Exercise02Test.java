package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

    @Test
    void shouldSumDigits_OK() {
        final Exercise02 exercise02 = new Exercise02();
        assertEquals(6, exercise02.sumDigits(123));
        assertEquals(15, exercise02.sumDigits(12345));
        assertEquals(0, exercise02.sumDigits(0));
        assertEquals(1, exercise02.sumDigits(1));
        assertEquals(9, exercise02.sumDigits(9));
        assertEquals(10, exercise02.sumDigits(19));
    }
}