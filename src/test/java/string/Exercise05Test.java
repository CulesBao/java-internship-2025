package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {
    @Test
    public void testExpandEncodedString() {
        Exercise05 exercise = new Exercise05();

        assertEquals("aaabbbcc", exercise.expandEncodedString("a3b3c2"));
        assertEquals("abcd", exercise.expandEncodedString("abcd"));
        assertEquals("zzzzzz", exercise.expandEncodedString("z6"));
        assertEquals("", exercise.expandEncodedString(""));
        assertEquals("abbbbbbbbbbbbbc", exercise.expandEncodedString("ab13c"));
        assertEquals("a", exercise.expandEncodedString("a1"));
        assertEquals("bb", exercise.expandEncodedString("b2"));
        assertEquals("cccc", exercise.expandEncodedString("c4"));
        assertEquals("xxyyyzzzz", exercise.expandEncodedString("x2y3z4"));
        assertEquals("mnoooopppqqqrrrr", exercise.expandEncodedString("m1n1o4p3q3r4"));
    }
}
