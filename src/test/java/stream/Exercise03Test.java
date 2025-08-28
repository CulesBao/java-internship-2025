package stream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise03Test {
  @Test
  public void testConvertNumberToString() {
    final Exercise03 exercise03 = new Exercise03();

    assertEquals("One, Two, Three", exercise03.converNumberToString(123));
    assertEquals("Zero", exercise03.converNumberToString(0));
    assertEquals(
        "Nine, Eight, Seven, Six, Five, Four, Three, Two, One",
        exercise03.converNumberToString(987654321));
    assertEquals("Four, Five, Six", exercise03.converNumberToString(456));
    assertThrows(IllegalArgumentException.class, () -> exercise03.converNumberToString(-1));
  }
}
