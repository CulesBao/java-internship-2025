package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise08Test {
    @Test
    public void shoudIntToRoman_OK(){
        final Exercise08 exercise08 = new Exercise08();
        assertEquals(exercise08.intToRoman(1), "I");
        assertEquals(exercise08.intToRoman(3), "III");
        assertEquals(exercise08.intToRoman(4), "IV");
        assertEquals(exercise08.intToRoman(9), "IX");
        assertEquals(exercise08.intToRoman(58), "LVIII");
        assertEquals(exercise08.intToRoman(1994), "MCMXCIV");
    }
}
