package src.test.java.basic;

import org.junit.jupiter.api.Test;
import src.main.java.basic.Exercise03;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {
    @Test
    public void Exercise03Test(){
        final Exercise03 obj = new Exercise03();
        assertEquals("2 * 2 * 3 * 7", obj.primeFactorization(84));
        assertEquals("5 * 5 * 11", obj.primeFactorization(275));
        assertEquals("2 * 2 * 2 * 3 * 3 * 5", obj.primeFactorization(360));
    }
}
