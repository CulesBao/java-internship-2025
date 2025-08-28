package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {
    @Test
    public void shoudFibonacci_OK(){
        final Exercise04 exercise04 = new Exercise04();
        assertEquals("1 1", exercise04.fibonacci(1));
        assertEquals("1 1 2", exercise04.fibonacci(2));
        assertEquals("1 1 2 3 5", exercise04.fibonacci(5));
        assertEquals("1 1 2 3 5 8 13", exercise04.fibonacci(13));
        assertEquals("1 1 2 3 5 8 13 21", exercise04.fibonacci(22));
        assertEquals("1 1 2 3 5 8 13 21 34", exercise04.fibonacci(40));
    }
}
