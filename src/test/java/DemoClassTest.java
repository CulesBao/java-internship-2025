package src.test.java;

import org.junit.jupiter.api.Test;
import src.main.java.DemoClass;

import static org.junit.jupiter.api.Assertions.*;

class DemoClassTest {

    private final DemoClass demoClass = new DemoClass();

    @Test
    void sum() {
        assertEquals(5, demoClass.sum(2, 3));
        assertEquals(0, demoClass.sum(2, -2));
    }

    @Test
    void max() {
        assertEquals(4, demoClass.max(2, 3,4));
        assertEquals(6, demoClass.max(6, 3,4));
        assertEquals(6, demoClass.max(5, 6,4));
    }
}